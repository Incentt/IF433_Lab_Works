package oop_104654_VincentWisnata.week6

class Smartphone: Camera, Phone{
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem Operasi smartphone berhasil booting")
    }
}