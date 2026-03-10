package oop_104654_VincentWisnata.week6

class SmartCCTV(override val id: String, override  val name: String): SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("Menyalakan $name")
        startRecord()
    }
    override fun turnOff() {
        println("Mematikan $name")
        stopRecord()
    }
    override  fun startRecord(){
        println("Menyalakan Recording $name")
    }
    override fun stopRecord(){
        println("Mematikan Recording $name")
    }
}