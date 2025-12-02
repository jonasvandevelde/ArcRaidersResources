package jonas.free.arcraidersresources.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import jonas.free.arcraidersresources.data.LootType
import jonas.free.arcraidersresources.theme.ArcResourcesTheme
import jonas.free.arcraidersresources.theme.getLootTypeColor
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun LootTypeChip(modifier: Modifier = Modifier, type: LootType, amountNeeded: Int = 1) {
    val color = getLootTypeColor(type)
    val textColor = Color.White

    Box(
        modifier = modifier
            .wrapContentWidth()
            .padding(horizontal = 2.dp).background(color),
    ) {
        Text(
            text = if (amountNeeded > 1) "${type.name} ($amountNeeded)" else type.name,
            color = textColor,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        )
    }
}

@Composable
@Preview
fun LootTypeChipPreview() {
    ArcResourcesTheme {
        LootTypeChip(
            type = LootType.RECYCLE,
            amountNeeded = 3
        )
    }
}
