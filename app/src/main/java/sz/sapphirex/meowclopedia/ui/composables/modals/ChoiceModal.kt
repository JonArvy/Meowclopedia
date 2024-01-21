package sz.sapphirex.meowclopedia.ui.composables.modals

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun <T> ChoiceModal(
    title: String,
    onDismissRequest: () -> Unit,
    choices: List<Pair<String, T>>,
    defaultSelectedValue: T? = null,
    onConfirmation: (T) -> Unit,
) {
    var selectedChoice by remember { mutableStateOf(choices.first().second) }
    BaseModal(
        title = title,
        onDismissRequest = { onDismissRequest() },
        onConfirmation = { onConfirmation(selectedChoice) }
    ) {
        ChoiceRadio(choices = choices, defaultSelectedValue = defaultSelectedValue) {
            selectedChoice = it
        }
    }
}