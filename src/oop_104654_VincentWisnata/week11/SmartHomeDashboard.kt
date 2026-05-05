package oop_104654_VincentWisnata.week11

fun main(){
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", "").apply {
        name = "Philips WiZ Living Room"
        category = "Lighting"
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    homeDevices.forEach {
        println(it.diagnose())
    }
}