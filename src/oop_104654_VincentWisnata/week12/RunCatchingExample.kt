package oop_104654_VincentWisnata.week12

fun main(){
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getorelse): $safeValue")
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered value: $recovered")
}