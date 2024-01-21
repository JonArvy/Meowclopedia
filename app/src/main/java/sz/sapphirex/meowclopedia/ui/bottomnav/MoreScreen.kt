package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import sz.sapphirex.meowclopedia.MeowclopediaApp
import sz.sapphirex.meowclopedia.R
import sz.sapphirex.meowclopedia.data.changeColorScheme
import sz.sapphirex.meowclopedia.data.changeTheme
import sz.sapphirex.meowclopedia.data.observeColorSchemeChanges
import sz.sapphirex.meowclopedia.data.observeThemeChanges
import sz.sapphirex.meowclopedia.ui.composables.list.ClickableListItem
import sz.sapphirex.meowclopedia.ui.composables.modals.ChoiceModal

@Composable
fun MoreScreen(meowclopediaAppState: MeowclopediaApp) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    val colorSchemePreferences by observeColorSchemeChanges(context).collectAsState(initial = 0)
    val themePreference by observeThemeChanges(context).collectAsState(initial = 0)

    var colorSchemeModalVisible by remember { mutableStateOf(false) }
    var themeModalVisible by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        MoreTopTitleBar()

        // Change color scheme
        ClickableListItem(
            title = "Change Color Scheme",
            subtitle = "Change color scheme for a new look",
            icon = { Icon(painter = painterResource(id = R.drawable.outline_color_lens_24), contentDescription = null)},
            onClick = {
                colorSchemeModalVisible = true
            },
        )
        if (colorSchemeModalVisible) {
            val choices: List<Pair<String, Int>> = listOf(
                Pair("Default", 0),
                Pair("Green", 1),
                Pair("Lavender", 2),
            )
            ChoiceModal(
                title = "Color Scheme",
                onDismissRequest = { colorSchemeModalVisible = false },
                choices = choices,
                defaultSelectedValue = colorSchemePreferences
            ) {
                coroutineScope.launch {
                    changeColorScheme(context = context, colorScheme = it)
                }
                colorSchemeModalVisible = false
            }
        }

        // Change Dark Mode
        ClickableListItem(
            title = "Change Mode",
            subtitle = "Choose between light mode and dark mode",
            icon = { Icon(painter = painterResource(id = R.drawable.outline_dark_mode_24), contentDescription = null)},
            onClick = {
                themeModalVisible = true
            },
        )
        if (themeModalVisible) {
            val choices: List<Pair<String, Int>> = listOf(
                Pair("System", 0),
                Pair("Light", 1),
                Pair("Night", 2),
            )
            ChoiceModal(
                title = "Change Settings",
                onDismissRequest = { themeModalVisible = false },
                choices = choices,
                defaultSelectedValue = themePreference
            ) {
                coroutineScope.launch {
                    changeTheme(context = context, theme = it)
                }
                themeModalVisible = false
            }
        }
    }
}

@Composable
fun MoreTopTitleBar() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.navbar_01), contentDescription = "title")
    }
    Divider()
}