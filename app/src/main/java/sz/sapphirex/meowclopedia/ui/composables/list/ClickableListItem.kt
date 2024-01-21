package sz.sapphirex.meowclopedia.ui.composables.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import sz.sapphirex.meowclopedia.ui.theme.Mu9MeowclopediaTheme
import sz.sapphirex.meowclopedia.ui.utils.ThemePreviews

internal val padding = 16.dp

@Composable
fun ClickableListItem(
    icon: @Composable (() -> Unit)? = null,
    title: String,
    subtitle: String? = null,
    endItem: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null
) {
    Surface(
        modifier = Modifier
            .run {
                if (onClick != null) {
                    clickable { onClick.invoke() }
                } else {
                    this
                }
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = padding, vertical = padding / 2),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (icon != null) {
                Box(modifier = Modifier.padding(end = padding)) {
                    icon()
                }
            }
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = title, fontSize = 16.sp)
                if (subtitle != null) {
                    Text(text = subtitle, fontSize = 12.sp)
                }
            }
            if (endItem != null) {
                endItem()
            }
        }
    }
}


@ThemePreviews
@Composable
fun ShowPreview() {
    Mu9MeowclopediaTheme {
        Surface {
            Column {
                ClickableListItem(
                    title = "Change Settings",
                    subtitle = "Change settings for a new look",
                    icon = { Icon(imageVector = Icons.Outlined.List, contentDescription = null)},
                    endItem = { Switch(checked = true, onCheckedChange = {})}
                )
            }
        }
    }
}