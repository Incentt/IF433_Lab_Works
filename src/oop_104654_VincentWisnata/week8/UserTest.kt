package oop_104654_VincentWisnata.week8

object DatabaseMock{
    fun findUser(id: Int): UserProfile?{
        return if(id == 1) UserProfile("TestUser", "test@test.com")else null
    }
}
fun runMockUnitTest(){
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    val initial =  testUser!!.name?.substring(0, 1)

    check(initial == "T") {
        "Test Failed! Initial is Wrong."
    }
    println("Test Passed: initial is T")
}