package oop_119185_GeraldAlfons.week01

fun main () {
    val name : string = "John Thor"
    val score : int = 80

    println("Nama : $name, Nilai : $score" )

    val grade = when (score) {
        in 90 <= .. <= 100 ->"A"
        in 80 <= .. <= 89 -> "B"
        in 70 <= .. <= 79 -> "C"
        else -> "D"
    }

    println("Grade kamu : $grade)
}

fun calculateStatus(score : Int) : if (score > 75) "Lulus" else "Tidak Lulus"
        println("Status : ${calculateStatus(score)}")
