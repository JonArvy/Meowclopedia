package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import sz.sapphirex.meowclopedia.MeowclopediaApp
import sz.sapphirex.meowclopedia.R
import sz.sapphirex.meowclopedia.ui.composables.carousel.Carousel
import sz.sapphirex.meowclopedia.ui.composables.labels.TitleText

@Composable
fun HomeScreen(meowclopediaAppState: MeowclopediaApp) {
    Scaffold(
        topBar = { HomeTopBar() }
    ) { paddingValues ->
        Image(painter = painterResource(id = R.drawable.splash_02), contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
        LazyColumn(
            Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            item { Spacer(modifier = Modifier.height(16.dp)) }
            item { HomeCarousel(meowclopediaAppState) }
            item { HomeDescription() }
        }
    }
}

@Composable
fun HomeTopBar() {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.navbar_02), contentDescription = null)
    }
}

@Composable
private fun HomeDescription() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TitleText(text = stringResource(id = R.string.home_about_cats_title))
            Spacer(modifier = Modifier.width(12.dp))
            Icon(imageVector = Icons.Filled.Info, contentDescription = null)
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = stringResource(id = R.string.home_about_cats)
        )
        Spacer(modifier = Modifier.height(8.dp))
        TitleText(text = stringResource(id = R.string.home_origin_and_history_of_cats_title))
        Text(text = stringResource(id = R.string.home_origin_cats))
    }
}

@Composable
private fun HomeCarousel(meowclopediaAppState: MeowclopediaApp) {
    Carousel(carouselItems = meowclopediaAppState.homeImageList, isAutomaticControl = true)
}