package oop_104654_VincentWisnata.week3

fun main () {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")
    e.increasePerformance()

    println("Pajak yang harus dibayar ${e.tax}")

    val w = Weapon("Padang")
    w.Damage = -100
    w.Damage = 9999
    println("Damage ${w.name}: ${w.Damage}")
    println("Tier ${w.name}: ${w.tier}")
}