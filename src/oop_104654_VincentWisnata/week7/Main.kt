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

    val data3 = data1.copy(age = 23)
    println("Hasil Copy $data3")

    val(username, age) = data1
    println("Destructured $username berumur $age")

    println("TEST SEALED CLASS")
    val response : ApiResponse = ApiResponse.Success("Data berhasil ditarik")

    val uiMessage = when(response){
        is ApiResponse.Success -> "Tampilkan $response.data"
        is ApiResponse.Error -> "Munculkan alert $response.message"
    }
}