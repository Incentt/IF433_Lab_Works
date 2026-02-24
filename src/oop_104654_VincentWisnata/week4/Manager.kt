package oop_104654_VincentWisnata.week4

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary ) {

    override fun work(){
        println("$name sedang memimpin rapat divise")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}