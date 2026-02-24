package oop_104654_VincentWisnata.week4

fun main(){
    println("------ Testing Vehicle -----");
    val generalVehicle = Vehicle("Sepedha Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("------ Testing Car -----");
    val myCar = Car("Toyota",  4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("------ Testing Electric -----");
    val electroCar = ElectricCar("Tesla",  4, 1000)
    electroCar.openTrunk()
    electroCar.honk()
    electroCar.accelerate()

    val Man = Manager("eric", 10000)
    Man.work()
    println("Bonus Manager: ${Man.calculateBonus()}")

    val Dev = Developer("vincent", 10000, "kotlin")
    Dev.work()
    println("Bonus Developer: ${Dev.calculateBonus()}")
}