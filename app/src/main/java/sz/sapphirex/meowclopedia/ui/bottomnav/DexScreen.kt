package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import sz.sapphirex.meowclopedia.MeowclopediaApp
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.Cat
import sz.sapphirex.meowclopedia.ui.composables.cards.CatCard
import sz.sapphirex.meowclopedia.ui.composables.labels.HorizontalTextLabel
import sz.sapphirex.meowclopedia.ui.composables.skeleton.CatCardSkeleton

@Composable
fun DexScreen(
    meowclopediaAppState: MeowclopediaApp,
    dexScreenViewModel: DexScreenViewModel = viewModel()
) {
    var isRowCard by remember { mutableStateOf(false) }
    var text by remember { mutableStateOf(meowclopediaAppState.getSearchToken()) }
    Box(modifier = Modifier
        .fillMaxSize()
    ) {
        Column {
            DexScreenTopBar(
                onToggleRowCard = { isRowCard = !isRowCard},
                text = text
            ) {
                meowclopediaAppState.setSearchToken(it)
                text = it
            }
            DexScreenContent(
                meowclopediaAppState = meowclopediaAppState,
                isRowCard = isRowCard,
                searchQuery = text,
                viewModel = dexScreenViewModel
            )
        }
    }
}

@Composable
private fun DexScreenContent(meowclopediaAppState: MeowclopediaApp, isRowCard: Boolean, searchQuery: String, viewModel: DexScreenViewModel) {
    val catResult by viewModel.catResult
    when (catResult) {
        is DataResult.Success -> {
            val catData = (catResult as DataResult.Success<List<Cat>>).data
            val filteredCatData = catData.filter {
                it.name.contains(searchQuery, ignoreCase = true) ||
                        it.origin.originValue.contains(searchQuery, ignoreCase = true)
            }
            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize(),
                columns = GridCells.Fixed(count = 1),
            ) {
                item { Spacer(modifier = Modifier.height(8.dp)) }
                filteredCatData.forEach { cat ->
                    item {
                        CatCard(
                            modifier = Modifier
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            elevation = cardElevation(defaultElevation = 6.dp),
                            image = cat.images.catImages[0],
                            isRowCard = isRowCard,
                            onClick = {
                                meowclopediaAppState.navigateToCatInfo(cat.id)
                            }
                        ) {
                            Text(text = cat.name, fontWeight = FontWeight.Bold, fontSize = 24.sp)
                            HorizontalTextLabel(title = "Origin: ", value = cat.origin.originValue)
                        }
                    }
                }
                item { Spacer(modifier = Modifier.height(8.dp)) }
            }
        }
        is DataResult.Error -> {
            Text(text = "Error: ${(catResult as DataResult.Error).exception}")
        }
        is DataResult.Loading -> {
            CatCardSkeleton(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                isRowCard = isRowCard
            )
            CatCardSkeleton(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth(),
                isRowCard = isRowCard
            )
        }
    }

}

@Composable
private fun DexScreenTopBar(onToggleRowCard: (() -> Unit)? = null, text: String, textChange: (String) -> Unit) {
    var isSearching by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TitleText(text = "CatDex")
        Row(
            modifier = Modifier.padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (!isSearching) {
                IconButton(onClick = { isSearching = true }) {
                    Icon(painter = painterResource(id = R.drawable.outline_search_24), contentDescription = null)
                }
            }
            AnimatedVisibility(visible = isSearching, enter = expandHorizontally(), exit = shrinkHorizontally()) {
                OutlinedTextField(
                    value = text,
                    onValueChange = { textChange(it) },
                    label = { Text(text = "Search")},
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                isSearching = false
                                textChange("")
                            }
                        ) {
                            Icon(painter = painterResource(id = R.drawable.outline_close_24), contentDescription = null)
                        }
                    }
                )
            }
//            IconButton(onClick = { onToggleRowCard?.invoke() }) {
//                Icon(painter = painterResource(id = R.drawable.outline_grid_view_24), contentDescription = null)
//            }
        }
    }
}