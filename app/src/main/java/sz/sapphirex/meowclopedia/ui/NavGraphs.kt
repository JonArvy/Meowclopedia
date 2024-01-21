package sz.sapphirex.meowclopedia.ui

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import sz.sapphirex.meowclopedia.BottomNavComposable
import sz.sapphirex.meowclopedia.MeowclopediaApp
import sz.sapphirex.meowclopedia.ui.bottomnav.CatTriviaScreen
import sz.sapphirex.meowclopedia.ui.bottomnav.DexScreen
import sz.sapphirex.meowclopedia.ui.bottomnav.HomeScreen
import sz.sapphirex.meowclopedia.ui.bottomnav.MoreScreen
import sz.sapphirex.meowclopedia.ui.catinfo.CatInfoScreen

object Routes {
    const val BOTTOM_NAV_ROUTE = "bottom_nav"
    const val CAT_INFO_ROUTE = "cat_info"
}

fun NavGraphBuilder.mainDestinations(meowclopediaAppState: MeowclopediaApp) {
    composable(route = Routes.BOTTOM_NAV_ROUTE) {
        BottomNavComposable(meowclopediaAppState)
    }
    composable(
        route = "${Routes.CAT_INFO_ROUTE}/{catId}",
        arguments = listOf(navArgument("catId") { type = NavType.StringType}),
        enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(300)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right,
                animationSpec = tween(300)
            )
        }
    ) { backStackEntry ->
        backStackEntry.arguments?.getString("catId")?.toInt()?.let { id ->
            CatInfoScreen(meowclopediaAppState = meowclopediaAppState, id = id)
        }
    }
}

fun NavGraphBuilder.bottomNavScreenDestinations(meowclopediaAppState: MeowclopediaApp) {
    composable(Screen.Home.route) { HomeScreen(meowclopediaAppState) }
    composable(Screen.Dex.route) { DexScreen(meowclopediaAppState) }
    composable(Screen.CatTrivia.route) { CatTriviaScreen() }
    composable(Screen.More.route) { MoreScreen()}
}