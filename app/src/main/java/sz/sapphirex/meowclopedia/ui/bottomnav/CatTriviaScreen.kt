package sz.sapphirex.meowclopedia.ui.bottomnav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import sz.sapphirex.meowclopedia.R
import sz.sapphirex.meowclopedia.data.DataResult
import sz.sapphirex.meowclopedia.data.models.CatTrivia
import sz.sapphirex.meowclopedia.ui.composables.cards.CatTriviaCard
import sz.sapphirex.meowclopedia.ui.composables.labels.TitleText
import sz.sapphirex.meowclopedia.ui.composables.skeleton.TriviaCardSkeleton

@Composable
fun CatTriviaScreen() {
    val catTriviaScreenViewModel: CatTriviaScreenViewModel = viewModel()
    catTriviaScreenViewModel.fetchCats()
    Box(modifier = Modifier.fillMaxSize()) {

        Image(painter = painterResource(id = R.drawable.splash_02), contentDescription = null, contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            CatTriviaScreenTopBar()
            CatTriviaScreenList(
                viewModel = catTriviaScreenViewModel
            )
        }
    }
}

@Composable
private fun CatTriviaScreenTopBar(
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TitleText(text = stringResource(id = R.string.trivia_title))
    }
}

@Composable
fun CatTriviaScreenList(viewModel: CatTriviaScreenViewModel) {
    val triviaData by viewModel.catTriviaResult
    when (triviaData) {
        is DataResult.Success -> {
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                val trivia = (triviaData as DataResult.Success<List<CatTrivia>>).data
                trivia.forEach { catTrivia ->
                    item { CatTriviaCard(catTrivia) }
                }
            }
        }
        is DataResult.Error -> {
            Text(text = "${(triviaData as DataResult.Error).exception}")
        }
        is DataResult.Loading -> {
            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = 8.dp)
            ) {
                val trivia = (0..10).toList()
                trivia.forEach { _ ->
                    item { TriviaCardSkeleton() }
                }
            }
        }
    }
}