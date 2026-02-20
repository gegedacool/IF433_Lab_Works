package oop_119185_GeraldAlfons.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if (value < 0) {
                println("Peringatan: Damage tidak boleh negatif! Nilai tidak diubah.")
                // field tidak diupdate, tetap nilai lama [cite: 102]
            } else if (value > 1000) {
                println("Peringatan: Damage terlalu OP! Dipaksa menjadi 1000.")
                field = 1000
            } else {
                field = value
            }
        }

    // Computed Property untuk Tier [cite: 104]
    val tier: String
        get() {
            return when {
                damage > 800 -> "Legendary"
                    damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}