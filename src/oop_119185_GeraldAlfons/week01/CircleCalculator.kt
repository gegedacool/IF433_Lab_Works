package oop_119185_GeraldAlfons.week01

fun main(args: Array<String>) {
    //variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    //calculation
    var area : Double = pi * radius * radius

    //Output Concatenation
    println("Radius : " + radius + ", Area : " + area )

    //login check
    checkSize (area)
}

fun checkSize(area : Double) {
    if (area > 100) {
        println ("This is a Big Circle")
    } else {
        println ("This is a Small Circle")
    }
}
