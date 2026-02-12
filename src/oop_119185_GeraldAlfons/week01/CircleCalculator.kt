package oop_119185_GeraldAlfons.week01

fun main(args: Array<String>) {
    //variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14

    //calculation
    val area : Double = pi * radius * radius

    //Output Concatenation
    println("Radius : $radius, Area : $area" )

    //login check
    checkSize (area)
}

fun checkSize(area) {
    if (area > 100) {
        println ("This is a Big Circle")
    } else {
        println ("This is a Small Circle")
    }
}
