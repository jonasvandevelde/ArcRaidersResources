package jonas.free.arcraidersresources.data

import org.jetbrains.compose.resources.DrawableResource
import arcraidersresources.composeapp.generated.resources.Res
import arcraidersresources.composeapp.generated.resources.*

enum class LootType { QUEST, PROJECT, RECYCLE, UPGRADE }

enum class LootRarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC
}

data class LootTypeRequirements(
    val type: LootType,
    val amountNeeded: Int = 1
)

data class LootItem(
    val displayName: String,
    val typeRequirements: List<LootTypeRequirements>,
    val imageResource: DrawableResource? = null,
    val recyclePercentage: Int = 0,
    val rarity: LootRarity = LootRarity.COMMON
)

val lootItems = listOf(
    //Quest Items
    LootItem(
        "Magnetron",
        listOf(LootTypeRequirements(LootType.QUEST, 1)),
        recyclePercentage = -3,
        imageResource = Res.drawable.magnetron,
        rarity = LootRarity.EPIC
    ),
    LootItem(
        "Leaper Pulse Unit", listOf(
            LootTypeRequirements(LootType.QUEST, 1),
            LootTypeRequirements(LootType.PROJECT, 3),
            LootTypeRequirements(LootType.UPGRADE, 4)
        ), Res.drawable.leaper_pulse_unit, recyclePercentage = -18,
        rarity = LootRarity.EPIC
    ),
    LootItem(
        "Power Rod", listOf(
            LootTypeRequirements(LootType.QUEST, 1)
        ), Res.drawable.power_rod, recyclePercentage = -50, LootRarity.EPIC
    ),
    LootItem(
        "Rocketeer Driver", listOf(
            LootTypeRequirements(LootType.QUEST, 1),
            LootTypeRequirements(LootType.UPGRADE, 3)
        ), Res.drawable.rocketeer_driver, recyclePercentage = -18, LootRarity.EPIC
    ),
    LootItem(
        "Surveyor Vault", listOf(
            LootTypeRequirements(LootType.QUEST, 1),
            LootTypeRequirements(LootType.UPGRADE, 5)
        ), Res.drawable.surveyor_vault, recyclePercentage = -16, LootRarity.RARE
    ),
    LootItem(
        "Antiseptic", listOf(
            LootTypeRequirements(LootType.QUEST, 2),
            LootTypeRequirements(LootType.UPGRADE, 8)
        ), Res.drawable.antiseptic, recyclePercentage = -25, LootRarity.RARE
    ),
    LootItem(
        "Hornet Driver", listOf(
            LootTypeRequirements(LootType.QUEST, 2),
            LootTypeRequirements(LootType.UPGRADE, 5)
        ), Res.drawable.hornet_driver, recyclePercentage = -16, LootRarity.RARE
    ),
    LootItem(
        "Wasp Driver", listOf(
            LootTypeRequirements(LootType.QUEST, 2),
            LootTypeRequirements(LootType.UPGRADE, 8)
        ), Res.drawable.wasp_driver, recyclePercentage = -16, LootRarity.RARE
    ),
    LootItem(
        "Water Pump", listOf(
            LootTypeRequirements(LootType.QUEST, 1),
            LootTypeRequirements(LootType.RECYCLE)
        ), Res.drawable.water_pump, recyclePercentage = -10, LootRarity.RARE
    ),
    LootItem(
        "Snitch Scanner", listOf(
            LootTypeRequirements(LootType.QUEST, 2),
            LootTypeRequirements(LootType.UPGRADE, 6)
        ), recyclePercentage = -26, imageResource = Res.drawable.snitch_scanner, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "Syringe",
        listOf(LootTypeRequirements(LootType.QUEST, 1)),
        recyclePercentage = -44,
        imageResource = Res.drawable.syringe, rarity = LootRarity.RARE
    ),
    LootItem(
        "Fertilizer",
        listOf(LootTypeRequirements(LootType.QUEST, 1)),
        recyclePercentage = -80,
        imageResource = Res.drawable.fertilizer, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "Durable Cloth", listOf(
            LootTypeRequirements(LootType.QUEST, 1),
            LootTypeRequirements(LootType.PROJECT, 35),
            LootTypeRequirements(LootType.UPGRADE, 5)
        ), recyclePercentage = -53, imageResource = Res.drawable.durable_cloth, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "Great Mullein",
        listOf(LootTypeRequirements(LootType.QUEST, 1)),
        recyclePercentage = -33,
        imageResource = Res.drawable.great_mullein, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "Battery", listOf(
            LootTypeRequirements(LootType.QUEST, 3),
            LootTypeRequirements(LootType.PROJECT, 30)
        ), recyclePercentage = -40, imageResource = Res.drawable.battery, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "ARC Alloy", listOf(
            LootTypeRequirements(LootType.QUEST, 3),
            LootTypeRequirements(LootType.PROJECT, 80)
        ), recyclePercentage = -25, imageResource = Res.drawable.arc_alloy, rarity = LootRarity.UNCOMMON
    ),
    LootItem(
        "Wires", listOf(
            LootTypeRequirements(LootType.QUEST, 11),
            LootTypeRequirements(LootType.PROJECT, 30)
        ), recyclePercentage = -50, imageResource = Res.drawable.wires, rarity = LootRarity.UNCOMMON
    ),

    //Project Items
    LootItem(
        "Magnetic Accelerator",
        listOf(LootTypeRequirements(LootType.PROJECT, 3)),
        recyclePercentage = -50,
        imageResource = Res.drawable.magnetic_accelerator, rarity = LootRarity.EPIC
    ),
    LootItem(
        "Exodus Modules",
        listOf(LootTypeRequirements(LootType.PROJECT, 1)),
        recyclePercentage = -42,
        imageResource = Res.drawable.exodus_modules, rarity = LootRarity.EPIC
    ),
    LootItem(
        "Humidifier", listOf(LootTypeRequirements(LootType.PROJECT, 5)), imageResource = Res.drawable.humidifier,
        rarity = LootRarity.RARE
    ),
    LootItem(
        "Sensors",
        listOf(LootTypeRequirements(LootType.PROJECT, 20)),
        recyclePercentage = -45,
        imageResource = Res.drawable.sensors, rarity = LootRarity.RARE
    ),
    LootItem(
        "Cooling Fan",
        listOf(LootTypeRequirements(LootType.PROJECT, 5)),
        recyclePercentage = -18,
        imageResource = Res.drawable.cooling_fan, rarity = LootRarity.RARE
    ),
    LootItem("Light Bulb", listOf(LootTypeRequirements(LootType.PROJECT, 5)), imageResource = Res.drawable.light_bulb),
    LootItem(
        "Electrical Components", listOf(
            LootTypeRequirements(LootType.PROJECT, 30),
            LootTypeRequirements(LootType.UPGRADE, 5)
        ), recyclePercentage = -48, imageResource = Res.drawable.electrical_components
    ),
    LootItem(
        "Rubber Parts",
        listOf(LootTypeRequirements(LootType.PROJECT, 200)),
        imageResource = Res.drawable.rubber_parts
    ),
    LootItem(
        "Metal Parts",
        listOf(LootTypeRequirements(LootType.PROJECT, 150)),
        imageResource = Res.drawable.metal_parts
    ),
    LootItem(
        "Advanced Electrical Components", listOf(
            LootTypeRequirements(LootType.PROJECT, 5),
            LootTypeRequirements(LootType.UPGRADE, 5)
        ), recyclePercentage = -52, imageResource = Res.drawable.advanced_electrical_components
    ),
    LootItem(
        "Steel Spring",
        listOf(LootTypeRequirements(LootType.PROJECT, 15)),
        recyclePercentage = -25,
        imageResource = Res.drawable.steel_spring
    ),

    //Recycle Items
    LootItem("Ion Sputter", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.ion_sputter),
    LootItem("Alarm Clock", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.alarm_clock),
    LootItem("ARC Coolant", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.arc_coolant),
    LootItem(
        "ARC Flex Rubber",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.arc_flex_rubber
    ),
    LootItem(
        "ARC Performance Steel",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.arc_performance_steel
    ),
    LootItem(
        "ARC Synthetic Resin",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.arc_synthetic_resin
    ),
    LootItem(
        "ARC Thermo Lining",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.arc_thermo_lining
    ),
    LootItem("Bicycle Pump", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.bicycle_pump),
    LootItem(
        "Broken Flashlight",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.broken_flashlight
    ),
    LootItem(
        "Broken Guidance System",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.broken_guidance_system
    ),
    LootItem(
        "Broken Handheld Radio",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.broken_handheld_radio
    ),
    LootItem(
        "Broken Handcuffs",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_handcuffs
    ),
    LootItem("Broken Taser", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.broken_taser),
    LootItem(
        "Burned ARC Circuitry",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.broken_arc_circuitry
    ),
    LootItem("Camera Lens", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.camera_lens),
    LootItem(
        "Candle Holder",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.candle_holder
    ),
    LootItem("Coolant", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.coolant),
    LootItem("Cooling Coil", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.cooling_coil),
    LootItem(
        "Crumpled Plastic Bottle",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.crumpled_plastic_bottle
    ),
    LootItem(
        "Damaged ARC Motion Core",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.damaged_arc_motion_core
    ),
    LootItem(
        "Damaged ARC Powercell",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.damaged_arc_powercell
    ),
    LootItem(
        "Damaged Rocketeer Driver",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.damaged_rocketeer_driver
    ),
    LootItem(
        "Damaged Tick Pod",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.damaged_tick_pod
    ),
    LootItem(
        "Degraded ARC Rubber",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.degraded_arc_rubber
    ),
    LootItem(
        "Deflated Football",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.deflated_football
    ),
    LootItem(
        "Diving Goggles",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.diving_goggles
    ),
    LootItem(
        "Dried-Out ARC Resin",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.dried_out_arc_resin
    ),
    LootItem(
        "Expired Respirator",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.expired_respirator
    ),
    LootItem("Flame Spray", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.flame_spray),
    LootItem("Frying Pan", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.frying_pan),
    LootItem("Garlic Press", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.garlic_press),
    LootItem("Headphones", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.headphones),
    LootItem(
        "Ice Cream Scooper",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ice_cream_scooper
    ),
    LootItem(
        "Impure ARC Coolant",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.impure_arc_coolant
    ),
    LootItem(
        "Industrial Charger",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.industrial_charger
    ),
    LootItem(
        "Industrial Magnet",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.industrial_magnet
    ),
    LootItem("Number Plate", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.number_plate),
    LootItem(
        "Household Cleaner",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.household_cleaner
    ),
    LootItem(
        "Metal Brackets",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.metal_brackets
    ),
    LootItem(
        "Polluted Air Filter",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.polluted_air_filter
    ),
    LootItem("Portable TV", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.portable_tv),
    LootItem("Power Bank", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.power_bank),
    LootItem("Projector", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.projector),
    LootItem("Radio", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.radio),
    LootItem("Radio Relay", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.radio_relay),
    LootItem(
        "Remote Control",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.remote_control
    ),
    LootItem(
        "Ripped Safety Vest",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ripped_safety_vest
    ),
    LootItem("Rubber Pad", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.rubber_pad),
    LootItem("Rope", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.rope),
    LootItem(
        "Ruined Accordion",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_accordion
    ),
    LootItem("Ruined Baton", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.ruined_baton),
    LootItem(
        "Ruined Handcuffs",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_handcuffs
    ),
    LootItem(
        "Ruined Parachute",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_parachute
    ),
    LootItem(
        "Ruined Riot Shield",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_riot_shield
    ),
    LootItem(
        "Ruined Tactical Vest",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.ruined_tactical_vest
    ),
    LootItem(
        "Rusty ARC Steel",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.rust_arc_steel
    ),
    LootItem("Rusted Bolts", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.rusted_bolts),
    LootItem(
        "Unusable Weapon",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.unusable_weapon
    ),
    LootItem(
        "Spotter Relay",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.spotter_relay
    ),
    LootItem(
        "Sample Cleaner",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.sample_cleaner
    ),
    LootItem(
        "Spring Cushion",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.spring_cushion
    ),
    LootItem(
        "Tattered ARC Lining",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.tattered_arc_lining
    ),
    LootItem(
        "Tattered Clothes",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.tattered_clothes
    ),
    LootItem("Thermostat", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.thermostat),
    LootItem("Moss", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.moss),
    LootItem("Torn Blanket", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.torn_blanket),
    LootItem("Turbo Pump", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.turbo_pump),
    LootItem("Zipline", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.zipline),
    LootItem(
        "Barricade Kit",
        listOf(LootTypeRequirements(LootType.RECYCLE)),
        imageResource = Res.drawable.barricade_kit
    ),
    LootItem("Water Filter", listOf(LootTypeRequirements(LootType.RECYCLE)), imageResource = Res.drawable.water_filter),

    //Upgrade Items
    LootItem(
        "Dog Collar",
        recyclePercentage = -26,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 1)), imageResource = Res.drawable.dog_collar
    ),
    LootItem(
        "Lemon",
        recyclePercentage = -25,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.lemon
    ),
    LootItem(
        "Apricot",
        recyclePercentage = -53,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 6)),
        imageResource = Res.drawable.apricot
    ),
    LootItem(
        "Prickly Pear",
        recyclePercentage = -53,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 6)), imageResource = Res.drawable.prickly_pear
    ),
    LootItem(
        "Olives",
        recyclePercentage = -69,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 6)),
        imageResource = Res.drawable.olives
    ),
    LootItem("Cat Bed", listOf(LootTypeRequirements(LootType.UPGRADE, 1)), imageResource = Res.drawable.cat_bed),
    LootItem("Mushroom", listOf(LootTypeRequirements(LootType.UPGRADE, 12)), imageResource = Res.drawable.mushroom),
    LootItem(
        "Very Comfortable Pillow",
        recyclePercentage = 0,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.very_comfortable_pillow
    ),
    LootItem(
        "Rusted Tools",
        recyclePercentage = -10,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, amountNeeded = 3)),
        imageResource = Res.drawable.rusted_tools
    ),
    LootItem(
        "Mechanical Components",
        listOf(LootTypeRequirements(LootType.UPGRADE, amountNeeded = 5)),
        recyclePercentage = -49, imageResource = Res.drawable.mechanical_components
    ),
    LootItem(
        "Rusted Gear",
        recyclePercentage = -21,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)), imageResource = Res.drawable.rusted_gear
    ),
    LootItem(
        "Advanced Mechanical Components",
        recyclePercentage = -21,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.advanced_mechanical_components
    ),
    LootItem(
        "Sentinel Firing Core",
        recyclePercentage = -23,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 4)),
        imageResource = Res.drawable.sentinel_firing_core
    ),
    LootItem(
        "Power Cable",
        recyclePercentage = -20,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)), imageResource = Res.drawable.power_cable
    ),
    LootItem(
        "Industrial Battery",
        recyclePercentage = -15,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.industrial_battery
    ),
    LootItem(
        "Bastion Cell",
        recyclePercentage = -22,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 6)), imageResource = Res.drawable.bastion_cell
    ),
    LootItem(
        "Cracked Bioscanner",
        recyclePercentage = -10,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 2)),
        imageResource = Res.drawable.cracked_bioscanner
    ),
    LootItem(
        "Tick Pod",
        recyclePercentage = -22,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 8)),
        imageResource = Res.drawable.tick_pod
    ),
    LootItem(
        "Rusted Shut Medical Kit",
        recyclePercentage = 0,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.rusted_shut_medical_kit
    ),
    LootItem(
        "Toaster",
        recyclePercentage = -10,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.toaster
    ),
    LootItem(
        "Fireball Burner",
        recyclePercentage = -27,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 8)),
        imageResource = Res.drawable.fireball_burner
    ),
    LootItem(
        "ARC Motion Core",
        recyclePercentage = -60,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 5)),
        imageResource = Res.drawable.arc_motion_core
    ),
    LootItem(
        "Motor",
        recyclePercentage = -25,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.motor
    ),
    LootItem(
        "ARC Circuitry",
        recyclePercentage = -25,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 10)),
        imageResource = Res.drawable.arc_circuitry
    ),
    LootItem(
        "Bombardier Cell",
        recyclePercentage = -25,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 6)),
        imageResource = Res.drawable.bombardier_cell
    ),
    LootItem(
        "Synthesized Fuel",
        recyclePercentage = -50,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.synthesized_fuel
    ),
    LootItem(
        "Pop Trigger",
        recyclePercentage = -27,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 5)), imageResource = Res.drawable.pop_trigger
    ),
    LootItem(
        "Crude Explosives",
        recyclePercentage = -44,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 5)),
        imageResource = Res.drawable.crude_explosives
    ),
    LootItem(
        "Laboratory Reagents",
        recyclePercentage = -20,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.laboratory_reagents
    ),
    LootItem(
        "Explosive Compound",
        recyclePercentage = -46,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 5)),
        imageResource = Res.drawable.explosive_compound
    ),
    LootItem(
        "Damaged Heat Sink",
        recyclePercentage = -15,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 2)),
        imageResource = Res.drawable.damaged_heat_sink
    ),
    LootItem(
        "Fried Motherboard",
        recyclePercentage = -21,
        typeRequirements = listOf(LootTypeRequirements(LootType.UPGRADE, 3)),
        imageResource = Res.drawable.fried_motherboard
    ),
)
