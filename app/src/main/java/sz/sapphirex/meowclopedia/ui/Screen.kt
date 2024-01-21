package sz.sapphirex.meowclopedia.ui

import androidx.annotation.DrawableRes
import sz.sapphirex.meowclopedia.R

sealed class Screen(val route: String, val title: String, @DrawableRes val icon: Int) {
    object Home: Screen("home", "Home", R.drawable.outline_home_24)
    object Dex: Screen("dex", "Dex", R.drawable.outline_collections_bookmark_24)
    object CatTrivia: Screen("cat_trivia", "Cat Trivia", R.drawable.outline_pets_24)
    object More: Screen("more", "More", R.drawable.outline_more_horiz_24)
}