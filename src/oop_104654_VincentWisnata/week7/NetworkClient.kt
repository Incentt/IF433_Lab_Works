package oop_104654_VincentWisnata.week7

class NetworkClient private constructor(val url: String){
    companion object{
        const val BASE_URL = "https://api.umn.ac.id"
        fun createClient(): NetworkClient {
            println("Membangun network client dengan url $BASE_URL")
            return NetworkClient("$BASE_URL")
        }
    }
    fun connect(){
        println("Connecting to $url...")
    }
}