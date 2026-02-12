package oop_119185_GeraldAlfons.week01

fun main(args: Array<String>) {
    // Variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14

    // Calculation
    val area: Double = pi * radius * radius

    // Output Concatenation
    println("Radius : $radius, Area : $area")

    // Memanggil fungsi checkSize di dalam println
    println(checkSize(area))
}

// Expression Body Function
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"