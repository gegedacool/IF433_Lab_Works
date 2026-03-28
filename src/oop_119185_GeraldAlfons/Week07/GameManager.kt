package oop_119185_GeraldAlfons.Week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.") [cite: 139]
        } else {
            isGameRunning = true
            println("Memulai Game Engine...") [cite: 140]
        }
    }
}