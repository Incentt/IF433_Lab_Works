package oop_104654_VincentWisnata.week7

class NetworkClient private constructor(val url: String){
    fun connect(){
        println("Connecting to $url...")
    }
}