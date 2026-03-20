package oop_104654_VincentWisnata.week7

fun main(){
    println("TESTING SINGLETON")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("TEST CONNECTION OBJECT")
    val client = NetworkClient.createClient()
    client.connect()

    println("Test REGULAR CLASS")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}" )

    println("Test Data CLASS")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}" )
}