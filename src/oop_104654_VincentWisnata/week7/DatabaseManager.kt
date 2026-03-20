package oop_104654_VincentWisnata.week7

object DatabaseManager{
    var connectionStatus: String = "Disconnected"

    fun connect(){
        connectionStatus = "Connected"
        println("Database is ready")
    }

}