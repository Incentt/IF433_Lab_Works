package oop_104654_VincentWisnata.week1

fun main() {
    val radius: Double = 7.0
    val pi: Double = 3.14
    var area = pi * radius * radius

    println("Radius: ${radius}, Area: ${area}")
    println("Check Size: ${checkSize(area)}")
}
fun checkSize(area: Double): String {
    if (area > 100) {
        return "This is a Big Circle"
    } else {
       return "This is a Small Circle"
    }
}