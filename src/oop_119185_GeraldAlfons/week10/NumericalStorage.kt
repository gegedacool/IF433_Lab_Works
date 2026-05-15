package oop_119185_GeraldAlfons.week10

class MathBox<T : Number>(val value1: T, val value2: T) {

    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }

    fun <T> getMax(a: T, b: T): T where T : Comparable<T> {
        return if (a > b) a else b
    }
    println("\n=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${getMax(45,90)}")
}
}

