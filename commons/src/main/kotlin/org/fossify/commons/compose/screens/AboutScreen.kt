package org.fossify.commons.compose.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import org.fossify.commons.R
import org.fossify.commons.compose.lists.SimpleColumnScaffold
import org.fossify.commons.compose.settings.SettingsGroup
import org.fossify.commons.compose.settings.SettingsHorizontalDivider
import org.fossify.commons.compose.settings.SettingsListItem
import org.fossify.commons.compose.settings.SettingsTitleTextComponent
import org.fossify.commons.compose.theme.SimpleTheme

private val titleStartPadding = Modifier.padding(start = 40.dp)

@Composable
internal fun AboutScreen(
    goBack: () -> Unit,
    aboutSection: @Composable () -> Unit,
    sourceCodeSection: @Composable () -> Unit,
    otherSection: @Composable () -> Unit,
) {
    SimpleColumnScaffold(title = stringResource(id = R.string.about), goBack = goBack) {
        aboutSection()
        sourceCodeSection()
        otherSection()
    }
}

@Composable
internal fun OtherSection(
    onLicenseClick: () -> Unit,
    versionName: String,
    packageName: String,
    onVersionClick: () -> Unit,
) {
    SettingsGroup(title = {
        SettingsTitleTextComponent(
            text = stringResource(id = R.string.other),
            modifier = titleStartPadding
        )
    }) {
        TwoLinerTextItem(
            click = onLicenseClick,
            text = stringResource(id = R.string.third_party_licences),
            icon = R.drawable.ic_article_outline_vector
        )
        SettingsListItem(
            tint = SimpleTheme.colorScheme.onSurface,
            click = onVersionClick,
            text = versionName,
            description = packageName,
            icon = R.drawable.ic_info_outline_vector,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        SettingsHorizontalDivider()
    }
}

@Composable
internal fun AboutSection(
    onFAQClick: () -> Unit,
) {
    SettingsGroup(title = {
        SettingsTitleTextComponent(
            text = stringResource(id = R.string.support),
            modifier = titleStartPadding
        )
    }) {
        TwoLinerTextItem(
            click = onFAQClick,
            text = stringResource(id = R.string.frequently_asked_questions),
            icon = R.drawable.ic_help_outline_vector
        )
        SettingsHorizontalDivider()
    }
}

@Composable
internal fun SourceCodeSection(
    onSourceCodeClick: () -> Unit,
) {
    SettingsGroup(title = {
        SettingsTitleTextComponent(
            text = stringResource(id = R.string.source_code),
            modifier = titleStartPadding
        )
    }) {
        SocialText(
            click = onSourceCodeClick,
            text = stringResource(id = R.string.github),
            icon = R.drawable.ic_github_vector,
            tint = SimpleTheme.colorScheme.onSurface
        )
        SettingsHorizontalDivider()
    }
}

@Composable
internal fun SocialText(
    text: String,
    icon: Int,
    tint: Color? = null,
    click: () -> Unit,
) {
    SettingsListItem(
        click = click,
        text = text,
        icon = icon,
        isImage = true,
        tint = tint,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
internal fun TwoLinerTextItem(text: String, icon: Int, click: () -> Unit) {
    SettingsListItem(
        tint = SimpleTheme.colorScheme.onSurface,
        click = click,
        text = text,
        icon = icon,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis
    )
}
