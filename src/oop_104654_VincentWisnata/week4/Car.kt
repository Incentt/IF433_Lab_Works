package oop_104654_VincentWisnata.week4

class Car(brand: String, val numberOfDoors: Int): Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi Mobil $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk(){
        println("TIN TIN! Mobil $brand lewat")
    }
}