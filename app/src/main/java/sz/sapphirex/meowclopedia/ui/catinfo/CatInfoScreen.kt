package sz.sapphirex.meowclopedia.ui.catinfo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import sz.sapphirex.meowclopedia.MeowclopediaApp
import sz.sapphirex.meowclopedia.R
import sz.sapphirex.meowclopedia.data.models.Cat
import sz.sapphirex.meowclopedia.data.models.CatImages
import sz.sapphirex.meowclopedia.ui.composables.labels.HorizontalTextLabel
import sz.sapphirex.meowclopedia.ui.composables.labels.HorizontalTextLabelList
import sz.sapphirex.meowclopedia.ui.composables.labels.TitleText

@Composable
fun CatInfoScreen(
    meowclopediaAppState: MeowclopediaApp,
    id: String? = null
) {
    var visibleInfo by remember { mutableStateOf(true) }
    var fullFloatVisibility by remember { mutableStateOf(false) }
    val snackBarHostState = remember { SnackbarHostState() }
    val catData = catData[id?.toInt() ?: 0]
    val lazyState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = { CatInfoTopBar(meowclopediaAppState = meowclopediaAppState) },
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(end = 8.dp, bottom = 8.dp),
                onClick = {
                    visibleInfo = !visibleInfo
                    coroutineScope.launch {
                        if (!visibleInfo) {
                            snackBarHostState.showSnackbar("Swipe the screen to view other images")
                        }
                    }
                }
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(painter = painterResource(id = R.drawable.outline_image_24), contentDescription = null)
                    Spacer(modifier = Modifier.then(if (fullFloatVisibility) Modifier.width(8.dp) else Modifier))
                    AnimatedVisibility(
                        visible = fullFloatVisibility,
                    ) {
                        Text(text = if (visibleInfo) "View Images" else "Show Info")
                    }
                }
            }
        },
        snackbarHost = {
            if (!visibleInfo) {
                SnackbarHost(hostState = snackBarHostState)
            }
        }
    ) { paddingValues ->
        CatInfoScreenBackground(catImages = catData.images, automaticPageControl = visibleInfo)
        AnimatedVisibility(
            visible = visibleInfo,
            enter = fadeIn(),
            exit = fadeOut(),
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Surface(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                shape = RoundedCornerShape(10.dp),
                color = MaterialTheme.colorScheme.onPrimary.copy(alpha = .5f)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize(),
                    state = lazyState
                ) {
                    item {
                        CatInfo(catData)
                    }
                }
            }
        }
    }
    LaunchedEffect(lazyState) {
        snapshotFlow { lazyState.canScrollForward }.collect { canScroll ->
            fullFloatVisibility = !canScroll
        }
    }
}

@Composable
fun CatInfo(catData: Cat) {
    Column(
        modifier = Modifier
            .padding(16.dp)
    ) {
        val titleWidth = .2f

        TitleText(text = "Breed Information")
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabel(title = "Name: ", value = catData.name, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabel(title = "Origin: ", value = catData.origin.originValue, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabel(title = "Size: ", value = catData.size.sizeValue, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabelList(title = "Coat: ", values = catData.coat.map { it.coatValue }, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabel(title = "Life span: ", value = catData.lifeSpan, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabel(title = "Weight: ", value = catData.weight, titleWidthSize = titleWidth)
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        HorizontalTextLabelList(title = "Colors: ", values = catData.color.map { it.colorValue }, titleWidthSize = titleWidth)

        Spacer(modifier = Modifier.padding(vertical = 16.dp))

        Divider(color = MaterialTheme.colorScheme.onBackground, modifier = Modifier.padding(vertical = 8.dp))

        Spacer(modifier = Modifier.padding(vertical = 16.dp))

        TitleText(text = "Overview")
        Spacer(modifier = Modifier.padding(vertical = 8.dp))
        Text(text = catData.description)

        Spacer(modifier = Modifier.padding(vertical = 32.dp))


    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CatInfoScreenBackground(
    catImages: CatImages,
    automaticPageControl: Boolean = true
) {
    val pagerState = rememberPagerState {
        catImages.catImages.size
    }
    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize(), userScrollEnabled = !automaticPageControl) { imageId ->
        BoxWithConstraints {
            val height by animateDpAsState(if (automaticPageControl) maxHeight else maxHeight / 3, label = "")
            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height),
                contentScale = ContentScale.FillHeight,
                model = catImages.catImages[imageId],
                contentDescription = null
            )
        }
    }
    if (automaticPageControl) {
        LaunchedEffect(pagerState) {
            while(true) {
                delay(3000)
                pagerState.animateScrollToPage((pagerState.currentPage + 1) % pagerState.pageCount)
            }
        }

    }
}

@Composable
fun CatInfoTopBar(meowclopediaAppState: MeowclopediaApp) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { meowclopediaAppState.goBack() }) {
            Icon(painter = painterResource(id = R.drawable.outline_arrow_back_24), contentDescription = null, tint = Color.Black)
        }
    }
}