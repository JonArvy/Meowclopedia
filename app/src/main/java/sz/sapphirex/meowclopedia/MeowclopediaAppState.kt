package sz.sapphirex.meowclopedia

@Composable
fun rememberMeowclopediaAppState(
    navController: NavHostController = rememberNavController(),
): MeowclopediaApp = remember(navController) {
    MeowclopediaApp(navController)
}

class MeowclopediaApp(val navController: NavHostController) {
    val currentRoute: String?
        get() = navController.currentDestination?.route

    var homeImageList: List<String> = emptyList()
        private set

    private var isGrid = false
    private var searchToken: String = ""

    fun setHomeImageList(imageList: List<String>) {
        homeImageList = imageList
    }

    fun getSearchToken(): String {
        return searchToken
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

    fun navigateToWebView(url: String) {
        val encodedUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
        val webRoute = "${Routes.WEB_VIEW_ROUTE}/$encodedUrl"
        if (currentRoute != "${Routes.WEB_VIEW_ROUTE}/{webURL}") {
            navController.navigate(webRoute)
        }
    }
}