package jonas.free.arcraidersresources.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalUriHandler

@Composable
fun MenuButton() {
    var expanded by remember { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current

    Box {
        TextButton(onClick = { expanded = true }) {
            Text("⋮", style = MaterialTheme.typography.headlineMedium)
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(
                text = { Text("Dam battleground") },
                onClick = {
                    uriHandler.openUri("https://arctracker.io/maps/dam-battleground")
                    expanded = false
                }
            )
            DropdownMenuItem(
                text = { Text("Spaceport") },
                onClick = {
                    uriHandler.openUri("https://arctracker.io/maps/the-spaceport")
                    expanded = false
                }
            )
            DropdownMenuItem(
                text = { Text("Buried city") },
                onClick = {
                    uriHandler.openUri("https://arctracker.io/maps/buried-city")
                    expanded = false
                }
            )
            DropdownMenuItem(
                text = { Text("Stella montis") },
                onClick = {
                    uriHandler.openUri("https://arctracker.io/maps/stella-montis")
                    expanded = false
                }
            )
            DropdownMenuItem(
                text = { Text("Blue gate") },
                onClick = {
                    uriHandler.openUri("https://arctracker.io/maps/blue-gate")
                    expanded = false
                }
            )
        }
    }
}
