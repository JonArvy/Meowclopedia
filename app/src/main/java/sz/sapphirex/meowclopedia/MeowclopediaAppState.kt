package sz.sapphirex.meowclopedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import sz.sapphirex.meowclopedia.data.models.Cat
import sz.sapphirex.meowclopedia.ui.Routes

@Composable
fun rememberMeowclopediaAppState(
    navController: NavHostController = rememberNavController(),
): MeowclopediaApp = remember(navController) {
    MeowclopediaApp(navController)
}

class MeowclopediaApp(val navController: NavHostController) {
    private val currentRoute: String?
        get() = navController.currentDestination?.route

    var catListReference: List<Cat> = emptyList()

    var homeImageList: List<String> = emptyList()
        private set

    var searchToken: String = ""
        private set

    fun setHomeImageList(imageList: List<String>) {
        homeImageList = imageList
    }

    fun setSearchToken(token: String) {
        searchToken = token
    }

    fun goBack() {
        navController.popBackStack()
    }

    fun navigateToCatInfo(catId: Int) {
        val catRoute = "${Routes.CAT_INFO_ROUTE}/$catId"
        if (currentRoute != "${Routes.CAT_INFO_ROUTE}/{catId}") {
            navController.navigate(catRoute)
        }
    }
}