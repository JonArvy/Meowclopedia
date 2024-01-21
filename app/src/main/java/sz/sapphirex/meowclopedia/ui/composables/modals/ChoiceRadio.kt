package sz.sapphirex.meowclopedia.ui.composables.modals

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp

@Composable
fun <T> ChoiceRadio(
    choices: List<Pair<String, T>>,
    defaultSelectedValue: T? = null,
    onOptionSelect: (T) -> Unit
) {
    val indexedValue = if (choices.indexOfFirst { it.second == defaultSelectedValue } != -1) {
        choices.indexOfFirst { it.second == defaultSelectedValue }
    } else {
        0
    }
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(choices[indexedValue]) }
    Column {
        choices.forEach { pair ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .selectable(
                        selected = (pair == selectedOption),
                        onClick = {
                            onOptionSelected(pair)
                            onOptionSelect(pair.second)
                        },
                        role = Role.RadioButton
                    )
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (pair == selectedOption),
                    onClick = null
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = pair.first)
            }
        }
    }
}