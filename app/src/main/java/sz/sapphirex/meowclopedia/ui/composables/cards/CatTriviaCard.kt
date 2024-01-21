package sz.sapphirex.meowclopedia.ui.composables.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sz.sapphirex.meowclopedia.data.models.CatTrivia

@Composable
fun CatTriviaCard(catTrivia: CatTrivia) {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
        ,
        shadowElevation = 4.dp,
        tonalElevation = 4.dp,
        shape = RoundedCornerShape(10)
    ) {
        Box(modifier = Modifier
            .padding(16.dp)
        ) {
            Text(text = catTrivia.trivia, fontSize = 16.sp)
        }
    }
}
