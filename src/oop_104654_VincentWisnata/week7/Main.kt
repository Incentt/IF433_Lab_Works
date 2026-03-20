package oop_104654_VincentWisnata.week7

fun main(){
    println("TESTING SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("TEST CONNECTION OBJECT")
    val client = NetworkClient.createClient()
    client.connect()
}