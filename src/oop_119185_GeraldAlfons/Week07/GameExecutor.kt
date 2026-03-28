package oop_119185_GeraldAlfons.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("Awas! Monster ${event.monsterName} muncul menghadang!")
        }
        is LootDropped -> {
            // Menggunakan Destructuring dari data class GameItem
            val (name, dmg, rarity) = event.item
            println("Selamat! Kamu mendapatkan loot: $name [DMG: $dmg, Rarity: $rarity]")
        }
        is GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        SafeZone -> {
            println("Kamu berada di Safe Zone. Silakan beristirahat.")
        }
    }
}