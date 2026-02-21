package oop_104654_VincentWisnata.week3

class Employee (val name: String) {
    var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke ${value}")
        this.salary = value
    }
}