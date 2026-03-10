package oop_104654_VincentWisnata.week6

interface SmartDevice{
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord()
}