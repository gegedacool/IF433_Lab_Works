package oop_119185_GeraldAlfons.week03

class Player(val username: String) {
    private var xp: Int = 0

    // Computed Property untuk Level
    // Rumus: (xp / 100) + 1 [cite: 120]
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount > 0) {
            val oldLevel = level // Simpan level lama sebelum tambah XP
            xp += amount

            println("$username mendapatkan $amount XP.")

            // Cek jika naik level
            if (level > oldLevel) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("XP yang ditambahkan harus positif!")
        }
    }
}