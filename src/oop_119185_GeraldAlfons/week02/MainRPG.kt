package oop_119185_GeraldAlfons.week02
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama Hero: ")
    val name = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val damage = scanner.nextInt()

    val myHero = Hero(name, damage) //
    var enemyHp = 100 //

    println("\n=== BATTLE START: ${myHero.name} VS Slime ===")

    // 2. Main Game Loop
    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- Menu: 1. Serang | 2. Kabur ---")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            // Hero menyerang
            myHero.attack("Slime")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh: $enemyHp")

            // Musuh membalas jika masih hidup
            if (enemyHp > 0) {
                val monsterDamage = (10..20).random()
                println("Slime membalas! Memberikan $monsterDamage damage.")
                myHero.takeDamage(monsterDamage)
                println("Sisa HP ${myHero.name}: ${myHero.hp}")
            }
        } else if (choice == 2) {
            println("Kamu kabur seperti pengecut!")
            break
        } else {
            println("Pilihan ngawur!")
        }
    }

    // 3. Pengumuman Pemenang
    println("\n=== BATTLE END ===")
    if (enemyHp <= 0) {
        println("Selamat! ${myHero.name} menang!")
    } else if (!myHero.isAlive()) {
        println("Yah... ${myHero.name} gugur di medan perang.")
    }
}