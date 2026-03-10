package oop_104654_VincentWisnata.week6

class SmartSpeaker(override val id: String, override  val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Menyalakan $name")
    }

    override fun turnOff() {
        println("Mematikan $name")
    }
    fun playMusic(song: String){
        println("Musik $song")
    }

}