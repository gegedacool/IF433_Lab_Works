package oop_119185_GeraldAlfons.week04

open class Car(brand: string, val numberOfDoor: Int) : Vehicle(brand) {
    fun openTrunk () {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu terbuka.")
    }
    override fun honk() {
        println("Tin Tin! Mobil $brand lewat!!")
    
    }

    override fun accelerate() {
                super.accelerate()
        println("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}
