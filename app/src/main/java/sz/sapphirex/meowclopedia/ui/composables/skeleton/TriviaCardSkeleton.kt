package sz.sapphirex.meowclopedia.ui.composables.skeleton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TriviaCardSkeleton() {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .alpha(.4f),
        shape = RoundedCornerShape(20),
        tonalElevation = 8.dp,
        shadowElevation = 8.dp,
    ) {
        Column {
            Box(modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(.8f)
                .height(20.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color.Gray)
                .shimmerEffect()
            )
            Box(modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
                .fillMaxWidth(.5f)
                .height(20.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color.Gray)
                .shimmerEffect()
            )
        }
    }
}