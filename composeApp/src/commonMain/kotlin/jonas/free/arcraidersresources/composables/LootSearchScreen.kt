package jonas.free.arcraidersresources.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import jonas.free.arcraidersresources.data.lootItems

@Composable
fun LootSearchScreen(modifier: Modifier = Modifier) {
    var searchText by remember { mutableStateOf("") }

    val filteredItems = remember(searchText) {
        if (searchText.isBlank()) {
            lootItems.sortedBy { it.displayName }
        } else {
            lootItems.sortedBy { it.displayName }.filter {
                it.displayName.contains(searchText, ignoreCase = true)
            }
        }
    }

    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            // Search input
            OutlinedTextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Search loot items...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                singleLine = true
            )

            // Results count
            Text(
                text = "Found ${filteredItems.size} items",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Results list
            LazyColumn(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                itemsIndexed(filteredItems.chunked(2)) { _, rowItems ->
                    Row(
                        modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
                            .height(IntrinsicSize.Min),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        rowItems.forEach { item ->
                            LootItemCard(
                                item = item,
                                modifier = Modifier.weight(1f).fillMaxHeight()
                            )
                        }
                        // Fill empty space if odd number of items
                        if (rowItems.size == 1) {
                            Box(modifier = Modifier.weight(1f).fillMaxHeight())
                        }
                    }
                }
            }
        }
    }
}
