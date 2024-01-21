package sz.sapphirex.meowclopedia

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MeowclopediaApp(
    meowclopediaAppViewModel: MeowclopediaAppViewModel = viewModel()
) {
    Mu9MeowclopediaTheme {
        val meowclopediaState by meowclopediaAppViewModel.meowclopediaResult
        val meowclopediaAppState = rememberMeowclopediaAppState()
        var splashScreenVisible by remember { mutableStateOf(true) }
        AnimatedVisibility(visible = splashScreenVisible) {
            SplashScreen()
        }
        when (meowclopediaState) {
            is DataResult.Loading -> splashScreenVisible = false
            is DataResult.Error -> {}
            is DataResult.Success -> {
                splashScreenVisible = false
                val initialStatePairs = (meowclopediaState as DataResult.Success<Pair<Meowclopedia, Images>>).data
                val isMaintenance = initialStatePairs.first.maintenance
                val imageList = initialStatePairs.second.homeBanner
                meowclopediaAppState.setHomeImageList(imageList)
                AnimatedVisibility(visible = isMaintenance) {
                    MeowclopediaWebView(initialStatePairs.first.websiteLink)
                }
                AnimatedVisibility(visible = !isMaintenance) {
                    NavHost(
                        navController = meowclopediaAppState.navController,
                        startDestination = Routes.BOTTOM_NAV_ROUTE
                    ) {
                        mainDestinations(meowclopediaAppState)
                    }
                }
            }
        }
    }
}

@Composable
fun BottomNavComposable(meowclopediaAppState: MeowclopediaApp) {
    val navController = rememberNavController()
    val screenList = listOf(Screen.Home, Screen.Dex, Screen.CatTrivia, Screen.More)
    Scaffold(
        topBar = {},
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
