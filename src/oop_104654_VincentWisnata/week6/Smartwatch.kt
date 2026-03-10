package oop_104654_VincentWisnata.week6

class Smartwatch: Watch(), Rechargeable, BluetoothConnectable {
    override  fun ShowTime(){
        println("Layar Oled Menyala: 14.00 WIB")
    }
    override  fun connectToBluetooth(){
        println("Mencari perangkat HP di sekitar untuk pairing")
    }
    override fun chargeBattery(){
        println("Mengisi daya menggunakan charger magnetik 15W")
    }
}