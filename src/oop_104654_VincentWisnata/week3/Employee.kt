package oop_104654_VincentWisnata.week3

class Employee (val name: String) {
    var salary: Int = 0
    set(value) {
       if(value < 0){
           println("ERROR: Gaji tidak boleh negatif")
           field = value
       }else{
           field = value
       }
    }
    private var performanceRating: Int = 3
    fun increasePerformance(){
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }
    fun printStatus(){
        println("Karyawan $name, Rating: $performanceRating")
    }
}