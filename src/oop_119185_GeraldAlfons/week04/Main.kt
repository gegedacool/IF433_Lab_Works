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

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager(name = "Andi", baseSalary = 8000000)
    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Budi", baseSalary = 6000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}