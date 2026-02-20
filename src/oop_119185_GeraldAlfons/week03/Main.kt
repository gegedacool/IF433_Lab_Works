package oop_119185_GeraldAlfons.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary =5000000
    println("Gaji : ${e.salary}")
    e.increasePerformance()
    println("Pajak yang harus dibayar : ${e.salary}")

    println("\n--- Test Tugas 1: Weapon ---")
    val sword = Weapon("Excalibur")

    // 1. Test Damage Negatif
    sword.damage = -50
    println("Damage sekarang: ${sword.damage}") // Harusnya tetap 0

    // 2. Test Damage > 1000
    sword.damage = 9999
    println("Damage sekarang: ${sword.damage}") // Harusnya jadi 1000

    // 3. Test Tier
    println("Tier Senjata: ${sword.tier}")

    fun main() {
        // ... kode sebelumnya ...

        println("\n--- Test Tugas 2: Player ---")
        val player1 = Player("ProGamer99")

        // 1. Coba akses XP langsung (Ini akan error jika di-uncomment)
        // player1.xp = 500 // Error: Cannot access 'xp': it is private in 'Player'

        // 2. Tambah XP (masih level 1)
        player1.addXp(50)
        println("Level saat ini: ${player1.level}")

        // 3. Tambah XP lagi sehingga naik ke level 2
        player1.addXp(60) // Total XP 110, harusnya Level Up
        println("Level saat ini: ${player1.level}")
    }
}


