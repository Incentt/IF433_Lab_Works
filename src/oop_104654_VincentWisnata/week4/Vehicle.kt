package oop_104654_VincentWisnata.week4

open class Vehicle(val brand: String) {
    var speed: Int = 0;

    open fun accelerate() {
        speed += 10;
        print("$brand melaju. Kecepatan: $speed km/jam")
    }
    open fun honk(){
        println("Beep Beep");
    }
}