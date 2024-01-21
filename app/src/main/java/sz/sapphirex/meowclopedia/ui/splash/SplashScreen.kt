package sz.sapphirex.meowclopedia.ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import sz.sapphirex.meowclopedia.R

@Composable
fun SplashScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.splash_02),
            contentDescription = null, modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}