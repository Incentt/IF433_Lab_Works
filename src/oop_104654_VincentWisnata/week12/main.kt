package oop_104654_VincentWisnata.week12

fun main() {
    println("=== TEST TRY AS EXPRESSION ===")
    val inputString = "123"

    val result: Int = try{
        Integer.parseInt(inputString)
    }catch (e: NumberFormatException){
        -1
    }
    println("Hasil parsing ${   result  }")

    println("=== TEST Multiple CATCH ===")
    val account = BankAccount(100.0)
    try {
        account.withdraw(150.0)
    }catch (e: InsufficentFundsException){
        println("Caught Domain Error: Uang Tidak Cukup. ${e.message}")
    }catch (e: IllegalArgumentException){
        println("Caught Domain Error: Input tidak valid. ${e.message}")
    }catch (e: Exception){
        println("Caught General Error: Terjadi kesalahan tidak terduga ${e.message}")
    }

}