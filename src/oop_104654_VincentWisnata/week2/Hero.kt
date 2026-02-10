package oop_104654_VincentWisnata.week2

class Hero(var name: String, var baseDamage: Int, var hp: Int = 100){

    fun attack(targetName: String){
        println("Hero $name menyerang $targetName sebesar $baseDamage")
    }
    fun takeDamage(damage: Int){
        hp -= damage
        if (hp <= 0){
            hp = 0
        }
        println("Hero terkena serangan sebesar $damage, sisa health $hp")
    }
    fun isAlive(): Boolean{
        if (hp > 0){
            return true
        }else{
            return false
        }
    }
}

fun main(){
  
}