package oop_104654_VincentWisnata.week1

fun main(){
    val name: String = "John Thor"
    val score: Int = 80

    println("Name: ${name} Nilai: ${score}");

    val grade = when (score){
        in 90  ..  100 -> "A"
        in 80  .. 89 -> "B"
        in 80 .. 89 -> "C"
        else -> "D"
    }

    println("Grade Kamu: ${grade}");
}