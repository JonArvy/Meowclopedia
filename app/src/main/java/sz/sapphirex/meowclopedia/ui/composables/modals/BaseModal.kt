package sz.sapphirex.meowclopedia.ui.composables.modals

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun BaseModal(
    title: String,
    onDismissRequest: () -> Unit,
    onConfirmation: () -> Unit,
    content: @Composable () -> Unit
) {
    AlertDialog(
        title = {
            Text(text = title)
        },
        onDismissRequest = {
            onDismissRequest()
        },
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirmation()
                }
            ) {
                Text("Confirm")
            }
        },
        dismissButton = {
            TextButton(
                onClick = {
                    onDismissRequest()
                }
            ) {
                Text("Dismiss")
            }
        },
        text = { content() }
    )
}