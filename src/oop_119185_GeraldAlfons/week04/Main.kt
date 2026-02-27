package oop_119185_GeraldAlfons.week04

fun Main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n --- Testing Car---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myEV = ElectricCar(brand = "Tesla Model 3", numberOfDoors = 4, batteryCapacity = 85)
    myEV.openTrunk()
    myEV.honk()
    myEV.accelerate()
}