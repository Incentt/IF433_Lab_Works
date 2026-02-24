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
}