package oop_104654_VincentWisnata.week4

class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int): Car(brand, numberOfDoors) {

    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity")
    }
}