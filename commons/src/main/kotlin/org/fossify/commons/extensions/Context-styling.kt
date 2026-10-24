package org.fossify.commons.extensions

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Configuration
import android.graphics.Color
import android.graphics.Typeface
import android.view.ViewGroup
import com.google.android.material.color.MaterialColors
import org.fossify.commons.R
import org.fossify.commons.helpers.DARK_GREY
import org.fossify.commons.helpers.FONT_TYPE_CUSTOM
import org.fossify.commons.helpers.FONT_TYPE_SYSTEM_DEFAULT
import org.fossify.commons.helpers.FontHelper
import org.fossify.commons.helpers.isSPlus
import org.fossify.commons.views.MyAppCompatCheckbox
import org.fossify.commons.views.MyAppCompatSpinner
import org.fossify.commons.views.MyAutoCompleteTextView
import org.fossify.commons.views.MyButton
import org.fossify.commons.views.MyCompatRadioButton
import org.fossify.commons.views.MyEditText
import org.fossify.commons.views.MyFloatingActionButton
import org.fossify.commons.views.MyMaterialSwitch
import org.fossify.commons.views.MySeekBar
import org.fossify.commons.views.MyTextInputLayout
import org.fossify.commons.views.MyTextView
import java.io.File

fun Context.isDynamicTheme() = isSPlus() && baseConfig.isSystemThemeEnabled

fun Context.isBlackAndWhiteTheme(): Boolean {
    return baseConfig.textColor == Color.WHITE
            && baseConfig.primaryColor == Color.BLACK
            && baseConfig.backgroundColor == Color.BLACK
}

fun Context.isWhiteTheme(): Boolean {
    return baseConfig.textColor == DARK_GREY
            && baseConfig.primaryColor == Color.WHITE
            && baseConfig.backgroundColor == Color.WHITE
}

fun Context.isSystemInDarkMode() = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_YES != 0

fun Context.isAutoTheme() = !isSPlus() && baseConfig.isSystemThemeEnabled

fun Context.getProperTextColor() = when {
    isDynamicTheme() -> resources.getColor(R.color.you_neutral_text_color, theme)
    else -> baseConfig.textColor
}

fun Context.getProperBackgroundColor() = when {
    isDynamicTheme() -> resources.getColor(R.color.you_background_color, theme)
    else -> baseConfig.backgroundColor
}

fun Context.getProperPrimaryColor() = when {
    isDynamicTheme() -> resources.getColor(R.color.you_primary_color, theme)
    isWhiteTheme() || isBlackAndWhiteTheme() -> baseConfig.accentColor
    else -> baseConfig.primaryColor
}

fun Context.getProperStatusBarColor() = when {
    isDynamicTheme() -> resources.getColor(R.color.you_status_bar_color, theme)
    else -> getProperBackgroundColor()
}

// get the color of the status bar with material activity, if the layout is scrolled down a bit
fun Context.getColoredMaterialStatusBarColor(): Int {
    return when {
        isDynamicTheme() -> resources.getColor(R.color.you_status_bar_color, theme)
        else -> getProperPrimaryColor()
    }
}

fun Context.updateTextColors(viewGroup: ViewGroup) {
    val textColor = when {
        isDynamicTheme() -> getProperTextColor()
        else -> baseConfig.textColor
    }

    val backgroundColor = baseConfig.backgroundColor
    val accentColor = when {
        isWhiteTheme() || isBlackAndWhiteTheme() -> baseConfig.accentColor
        else -> getProperPrimaryColor()
    }

    val cnt = viewGroup.childCount
    (0 until cnt).map { viewGroup.getChildAt(it) }.forEach {
        when (it) {
            is MyTextView -> it.setColors(textColor, accentColor, backgroundColor)
            is MyAppCompatSpinner -> it.setColors(textColor, accentColor, backgroundColor)
            is MyCompatRadioButton -> it.setColors(textColor, accentColor, backgroundColor)
            is MyAppCompatCheckbox -> it.setColors(textColor, accentColor, backgroundColor)
            is MyMaterialSwitch -> it.setColors(textColor, accentColor, backgroundColor)
            is MyEditText -> it.setColors(textColor, accentColor, backgroundColor)
            is MyAutoCompleteTextView -> it.setColors(textColor, accentColor, backgroundColor)
            is MyFloatingActionButton -> it.setColors(textColor, accentColor, backgroundColor)
            is MySeekBar -> it.setColors(textColor, accentColor, backgroundColor)
            is MyButton -> it.setColors(textColor, accentColor, backgroundColor)
            is MyTextInputLayout -> it.setColors(textColor, accentColor, backgroundColor)
            is ViewGroup -> updateTextColors(it)
        }
    }
}

fun Context.getPopupMenuTheme(): Int {
    return if (isDynamicTheme()) {
        if (isSystemInDarkMode()) {
            R.style.AppTheme_YouPopupMenuStyle
        } else {
            R.style.AppTheme_YouPopupMenuStyle_Light
        }
    } else if (isWhiteTheme()) {
        R.style.AppTheme_PopupMenuLightStyle
    } else {
        R.style.AppTheme_PopupMenuDarkStyle
    }
}

/** Resets settings that only the Fossify Thank You app's global config could set. */
fun Context.syncGlobalConfig(callback: (() -> Unit)? = null) {
    baseConfig.isGlobalThemeEnabled = false
    baseConfig.showCheckmarksOnSwitches = false
    baseConfig.useBinaryStorageUnits = false
    validateFontSettings()
    callback?.invoke()
}

private fun Context.validateFontSettings() {
    if (baseConfig.fontType == FONT_TYPE_CUSTOM) {
        val typeface = FontHelper.getTypeface(this)
        if (typeface == Typeface.DEFAULT) {
            baseConfig.fontType = FONT_TYPE_SYSTEM_DEFAULT
            baseConfig.fontName = ""
            FontHelper.clearCache()
        }
    }
}

fun Context.ensureFontPresentLocally(fontName: String): Boolean {
    if (fontName.isEmpty()) return false
    return File(FontHelper.getFontsDir(this), fontName).exists()
}

fun Context.getAppIconColors() = resources.getIntArray(R.array.md_app_icon_colors).toCollection(ArrayList())

@SuppressLint("NewApi")
fun Context.getBottomNavigationBackgroundColor(): Int {
    val baseColor = baseConfig.backgroundColor
    val bottomColor = when {
        isDynamicTheme() -> resources.getColor(R.color.you_status_bar_color, theme)
        baseColor == Color.WHITE -> resources.getColor(R.color.bottom_tabs_light_background)
        else -> baseConfig.backgroundColor.lightenColor(4)
    }
    return bottomColor
}

fun Context.getDialogBackgroundColor(): Int {
    return when {
        isDynamicTheme() -> MaterialColors.getColor(
            this, com.google.android.material.R.attr.colorSurfaceContainerHigh, Color.TRANSPARENT
        )

        else -> baseConfig.backgroundColor
    }
}
