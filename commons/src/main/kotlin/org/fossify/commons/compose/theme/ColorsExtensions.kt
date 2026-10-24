package org.fossify.commons.compose.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance

@get:ReadOnlyComposable
val textSubTitleColor
    @Composable get() = if (isInDarkThemeOrSurfaceIsNotLitWell()) {
        Color.White.copy(0.6f)
    } else {
        Color.Black.copy(
            0.6f,
        )
    }

fun Color.isLitWell(threshold: Float = LUMINANCE_THRESHOLD) = luminance() > threshold

fun Color.isNotLitWell(threshold: Float = LUMINANCE_THRESHOLD) = luminance() < threshold
