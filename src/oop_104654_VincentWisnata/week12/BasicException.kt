package oop_104654_VincentWisnata.week12

fun divide(a: Int, b: Int): Int {
    try{
        return a / b
    }catch (e: Exception){
        println("Error: ${e.message}")
        return -1
    }finally {
        println("Division Attempts Finish")
    }
}