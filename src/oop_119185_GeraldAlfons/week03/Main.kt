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
}
}

