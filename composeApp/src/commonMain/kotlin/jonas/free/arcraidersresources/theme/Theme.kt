package jonas.free.arcraidersresources.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import jonas.free.arcraidersresources.data.LootType

private val ArcLightColorScheme = lightColorScheme(
    primary = ArcBlue,
    onPrimary = OnPrimary,
    primaryContainer = ArcBlueLight,
    onPrimaryContainer = OnPrimary,
    secondary = ArcOrange,
    onSecondary = OnSecondary,
    secondaryContainer = ArcOrangeLight,
    onSecondaryContainer = OnSecondary,
    tertiary = UpgradePurple,
    onTertiary = OnPrimary,
    error = ErrorRed,
    onError = OnPrimary,
    background = BackgroundLight,
    onBackground = OnBackground,
    surface = ArcSurfaceLight,
    onSurface = OnSurface,
    surfaceVariant = ArcSurfaceLight,
    onSurfaceVariant = OnSurface,
    outline = OnSurface.copy(alpha = 0.12f),
    outlineVariant = OnSurface.copy(alpha = 0.6f),
    scrim = OnSurface.copy(alpha = 0.32f)
)

private val ArcDarkColorScheme = darkColorScheme(
    primary = ArcBlueLight,
    onPrimary = OnPrimary,
    primaryContainer = ArcBlueDark,
    onPrimaryContainer = OnPrimary,
    secondary = ArcOrangeLight,
    onSecondary = OnSecondary,
    secondaryContainer = ArcOrangeDark,
    onSecondaryContainer = OnSecondary,
    tertiary = UpgradePurple,
    onTertiary = OnPrimary,
    error = ErrorRedDark,
    onError = OnPrimary,
    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    surface = ArcSurfaceDark,
    onSurface = OnSurfaceDark,
    surfaceVariant = ArcSurfaceDark,
    onSurfaceVariant = OnSurfaceDark,
    outline = OnSurfaceDark.copy(alpha = 0.12f),
    outlineVariant = OnSurfaceDark.copy(alpha = 0.6f),
    scrim = OnSurfaceDark.copy(alpha = 0.32f)
)

@Composable
fun ArcResourcesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> ArcDarkColorScheme
        else -> ArcLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = ArcTypography,
        content = content
    )
}

// Helper extension to get loot type colors
@Composable
fun getLootTypeColor(type: LootType): Color {
    return when (type) {
        LootType.QUEST -> QuestGreen
        LootType.PROJECT -> ProjectBlue
        LootType.RECYCLE -> RecycleOrange
        LootType.UPGRADE -> UpgradePurple
    }
}
