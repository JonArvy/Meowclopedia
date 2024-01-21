package sz.sapphirex.meowclopedia

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import sz.sapphirex.meowclopedia.data.catImages
import sz.sapphirex.meowclopedia.ui.Routes
import sz.sapphirex.meowclopedia.ui.Screen
import sz.sapphirex.meowclopedia.ui.bottomNavScreenDestinations
import sz.sapphirex.meowclopedia.ui.mainDestinations
import sz.sapphirex.meowclopedia.ui.theme.Mu9MeowclopediaTheme

@Composable
fun MeowclopediaApp() {
    Mu9MeowclopediaTheme {
        val meowclopediaAppState = rememberMeowclopediaAppState()
        meowclopediaAppState.setHomeImageList(catImages.catImages)

        NavHost(
            navController = meowclopediaAppState.navController,
            startDestination = Routes.BOTTOM_NAV_ROUTE
        ) {
            mainDestinations(meowclopediaAppState)
        }
    }
}

@Composable
fun BottomNavComposable(meowclopediaAppState: MeowclopediaApp) {
    val navController = rememberNavController()
    val screenList = listOf(Screen.Home, Screen.Dex, Screen.CatTrivia, Screen.More)
    Scaffold(
        bottomBar = { BottomNavBar(navController, screenList) }
    ) { paddingValues ->
        NavHost(navController = navController, startDestination = Screen.Home.route, modifier = Modifier.padding(paddingValues)) {
            bottomNavScreenDestinations(meowclopediaAppState)
        }
    }
}

@Composable
fun BottomNavBar(
    navController: NavHostController,
    list: List<Screen>
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val destination = backStackEntry?.destination
    NavigationBar {
        list.forEach { screen ->
            NavigationBarItem(
                selected = destination?.hierarchy?.any { it.route == screen.route } == true,
                onClick = {
                    if (screen.route != navController.currentDestination?.route) {
                        navController.navigate(screen.route) {
                            launchSingleTop = true
                            restoreState = true

                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                        }
                    }
                },
                icon = {
                    Icon(painter = painterResource(id = screen.icon), contentDescription = null)
                },
                label = {
                    Text(text = screen.title)
                }
            )
        }
    }
}
