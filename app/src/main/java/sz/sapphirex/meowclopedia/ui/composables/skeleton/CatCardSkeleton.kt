package sz.sapphirex.meowclopedia.ui.composables.skeleton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
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
fun CatCardSkeleton(
    modifier: Modifier = Modifier,
    isRowCard: Boolean = true
) {
    Surface(
        modifier = modifier
            .alpha(.4f),
        shape = RoundedCornerShape(10),
        tonalElevation = 8.dp,
        shadowElevation = 8.dp,
    ) {
        if (isRowCard) {
            Row {
                Box(modifier = Modifier
                    .fillMaxWidth(.6f)
                    .aspectRatio(2f)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.Gray)
                    .shimmerEffect()
                )
                Column(
                    Modifier.padding(16.dp)
                ) {
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .height(25.dp)
                        .background(Color.Gray)
                        .shimmerEffect()
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Box(modifier = Modifier
                        .fillMaxWidth(.6f)
                        .height(20.dp)
                        .background(Color.Gray)
                        .shimmerEffect()
                    )
                }
            }
        } else {
            Column {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(2f)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.Gray)
                    .shimmerEffect()
                )
                Box(modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .height(25.dp)
                    .background(Color.Gray)
                    .shimmerEffect()
                )
                Box(modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 16.dp)
                    .fillMaxWidth(.6f)
                    .height(20.dp)
                    .background(Color.Gray)
                    .shimmerEffect()
                )
            }
        }
    }
}
