package oop_104654_VincentWisnata.week9

fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("Original Data: $numbers")
    println("\n === HOF Filter === ")
    val evens = numbers.filter { it % 2 == 0 }
    print("Evens Only: $evens")

    println("=== HOF Maps ===")
    val multiplied = numbers.map { it * 10 }
    val asStrings = multiplied.map { "RP ${it}k" }
    println("Multiplied: $multiplied")
    println("Formatted: $asStrings")
}