package oop_119185_GeraldAlfons.week01

fun main() {
    val gameTitle: String = "Elden Ring: Shadow of the Erdtree"
    val price: Int = 600000

}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()