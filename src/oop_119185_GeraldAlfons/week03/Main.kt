package oop_119185_GeraldAlfons.week03

fun main() {
    val e = Employee("Budi")
    e.salary = -1000
    e.salary =5000000
    println("Gaji : ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    //e.performanceRating = 5

    //3. Test computed Property
    println("Pajak yang harus dibayar : ${e.salary}")
}

