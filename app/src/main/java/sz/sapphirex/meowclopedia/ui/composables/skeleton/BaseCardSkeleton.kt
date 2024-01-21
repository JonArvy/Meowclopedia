package sz.sapphirex.meowclopedia.ui.composables.skeleton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BaseCardSkeleton(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .alpha(.4f),
        shape = RoundedCornerShape(10),
        tonalElevation = 8.dp,
        shadowElevation = 8.dp,
    ) {
        Row(
            Modifier
                .fillMaxSize()
                .padding(16.dp)) {
            Box(modifier = Modifier
                .padding(end = 16.dp)
                .fillMaxHeight()
                .aspectRatio(1f)
                .background(Color.Gray)
                .shimmerEffect()
            )
            Column {
                Box(modifier = Modifier
                    .fillMaxWidth(.7f)
                    .height(20.dp)
                    .background(Color.Gray)
                    .shimmerEffect()
                )
                Spacer(modifier = Modifier.height(24.dp))
                Box(modifier = Modifier
                    .fillMaxWidth(.4f)
                    .height(20.dp)
                    .background(Color.Gray)
                    .shimmerEffect()
                )
            }
        }
    }
}