package oop_104654_VincentWisnata.week10

class MathBox<T: Number>(var value1: T, var value2: T){
    fun Sum() : Double{
        return value1.toDouble() + value2.toDouble()
    }
}