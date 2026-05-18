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
}