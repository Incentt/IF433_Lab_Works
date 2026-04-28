package oop_104654_VincentWisnata.week10

fun main() {
    println("=== TEST GENERIC CLASS ===")
    val intBox = Box(100)
    val stringBox = Box("Generics in Kotlin")

    println("Isi intBox is ${intBox.value}")
    println("Isi stringBox is ${stringBox.value}")

    println("=== TEST MULTIPLE PARAMETERS ===")
    val itemPrice = PairBox("Bitcoin", 100000)
    println("Aset ${itemPrice.key}, Harga:  ${itemPrice.value}USD")

    println("=== TEST GENERIC FUNCTION ===")
    printData(3.14)
    val result = processData("Stable Coins")
    println("Hasil proses: $result")

    println("=== TEST CONSTRAINTS ===")
    val math = MathBox(10.5, 20)
    println("Total: ${math.sum()}")
    println("Terbesar: ${math.getMax(45, 90)}")


}