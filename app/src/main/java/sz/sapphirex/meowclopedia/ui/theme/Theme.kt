package sz.sapphirex.meowclopedia.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import sz.sapphirex.meowclopedia.data.observeColorSchemeChanges
import sz.sapphirex.meowclopedia.data.observeThemeChanges
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.DefaultDarkColors
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.DefaultLightColors
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.GreenDarkColors
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.GreenLightColors
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.LavenderDarkColors
import sz.sapphirex.meowclopedia.ui.theme.colorscheme.LavenderLightColors

@Composable
fun Mu9MeowclopediaTheme(
    content: @Composable () -> Unit
) {
    val colorSchemePreferences by observeColorSchemeChanges(LocalContext.current).collectAsState(initial = 0)
    val themePreference by observeThemeChanges(LocalContext.current).collectAsState(initial = 0)

    val useDarkTheme: Boolean = when (themePreference) {
        2 -> true
        1 -> false
        else -> isSystemInDarkTheme()
    }

    val lightColors = when (colorSchemePreferences) {
        2 -> LavenderLightColors
        1 -> GreenLightColors
        else -> DefaultLightColors
    }

    val darkColors = when (colorSchemePreferences) {
        2 -> LavenderDarkColors
        1 -> GreenDarkColors
        else -> DefaultDarkColors
    }

    val colors = if (!useDarkTheme) {
        lightColors
    } else {
        darkColors
    }
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}