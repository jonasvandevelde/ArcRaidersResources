package jonas.free.arcraidersresources.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import jonas.free.arcraidersresources.data.LootItem
import jonas.free.arcraidersresources.data.LootRarity
import jonas.free.arcraidersresources.theme.ArcCommon
import jonas.free.arcraidersresources.theme.ArcDarkBackground
import jonas.free.arcraidersresources.theme.ArcEpic
import jonas.free.arcraidersresources.theme.ArcRare
import jonas.free.arcraidersresources.theme.ArcUncommon
import org.jetbrains.compose.resources.painterResource

@Composable
fun LootItemCard(item: LootItem, modifier: Modifier = Modifier) {

    val backgroundColor = when (item.rarity) {
        LootRarity.RARE -> ArcRare
        LootRarity.EPIC -> ArcEpic
        LootRarity.COMMON -> ArcCommon
        LootRarity.UNCOMMON -> ArcUncommon
    }

    Column(
        modifier = modifier.clip(MaterialTheme.shapes.extraSmall).background(
            brush = Brush.horizontalGradient(
                colors = listOf(backgroundColor, ArcDarkBackground) // Replace with your desired colors
            )
        ),
    ) {
        Box(modifier = Modifier.fillMaxWidth()) {
            val textColor = if (item.recyclePercentage < 0) Color.Red else Color.Green
            Text(
                modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                color = textColor,
                fontWeight = FontWeight.Bold,
                text = item.recyclePercentage.toString()
            )
            Column {
                item.imageResource?.let { imageResource ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(4.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier.size(100.dp),
                            painter = painterResource(imageResource),
                            contentDescription = null
                        )
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = item.displayName,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        color = Color.White,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                    )

                }
                FlowRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    // Show chips for each type requirement
                    item.typeRequirements.forEach { typeReq ->
                        LootTypeChip(
                            modifier = Modifier.padding(bottom = 4.dp, end = 4.dp),
                            type = typeReq.type,
                            amountNeeded = typeReq.amountNeeded
                        )
                        if (typeReq != item.typeRequirements.last()) {
                            Spacer(modifier = Modifier.width(4.dp))
                        }
                    }
                }
            }
        }


    }
}
