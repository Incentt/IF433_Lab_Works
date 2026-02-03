package oop_104654_VincentWisnata.week1

fun main(args: Array<String>) {
    // Variable definition
    val radius: Double = 7.0
    val pi: Double = 3.14
    // Calculation
    var area = pi * radius * radius
// Output Concatenation
    println("Radius: ${radius}, Area: ${area}")
    // Logic check
    println("Check Size: ${checkSize(area)}")
}
fun checkSize(area: Double): String {
    if (area > 100) {
        return "This is a Big Circle"
    } else {
       return "This is a Small Circle"
    }
}