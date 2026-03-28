package oop_119185_GeraldAlfons.Week07

enum class ItemRarity (val dropChance: Int){
    enum class ItemRarity(val dropChance: Int) {
        COMMON(70),
        UNCOMMON(30),
        RARE(10),
        EPIC(5),
        LEGENDARY(1) [cite: 145, 146]
    }
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
) [cite: 151, 152]
