package oop_119185_GeraldAlfons.week05

class MathHelper {
    fun hitungLuas(sisi: Int): Int = sisi * sisi

    // Overload 2: Menghitung luas persegi panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Overload 3: Menghitung luas lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}