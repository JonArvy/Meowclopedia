package sz.sapphirex.meowclopedia.ui.composables.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatCard(
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    shape: Shape = CardDefaults.shape,
    colors: CardColors = CardDefaults.cardColors(),
    elevation: CardElevation = CardDefaults.cardElevation(),
    border: BorderStroke? = null,
    isRowCard: Boolean = false,
    image: String,
    onClick: (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {
    if (onClick != null) {
        Card(
            modifier = modifier
                .fillMaxWidth(),
            enabled = enabled,
            shape = shape,
            colors = colors,
            elevation = elevation,
            border = border,
            onClick = onClick
        ) {
            CatCardContent(
                isRowCard = isRowCard,
                image = image,
                content = content
            )
        }
    } else {
        Card(
            modifier = modifier
                .fillMaxWidth(),
            shape = shape,
            colors = colors,
            elevation = elevation,
            border = border,
        ) {
            CatCardContent(
                isRowCard = isRowCard,
                image = image,
                content = content
            )
        }
    }
}

@Composable
fun CatCardContent(
    isRowCard: Boolean = true,
    image: String,
    content: @Composable ColumnScope.() -> Unit
) {
    if (isRowCard) {
        Row {
            AsyncImage(
                model = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .clip(
                        RoundedCornerShape(4)
                    )
            )
            CatCardInternalContent(
                content = content
            )
        }
    } else {
        Column {
            AsyncImage(
                model = image,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(
                        RoundedCornerShape(2)
                    )
            )
            CatCardInternalContent(
                content = content
            )
        }
    }
}

@Composable
fun CatCardInternalContent(content: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        content()
    }
}