package oop_104654_VincentWisnata.week2
import java.util.Scanner

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
    var enemyHP = 100;

    var scanner = Scanner(System.`in`)
    println("Masukan Nama Hero: ")
    var heroName = scanner.nextLine()
    println("Masukan Base Damage: ")
    var baseDamage = scanner.nextInt()
    scanner.nextLine()

    var hero = Hero(heroName, baseDamage)

    while (hero.isAlive()) {
        println("Pilih Menu: 1. Menyerang, 2. Kabur")
        var menu = scanner.nextInt();
        scanner.nextLine()
        if (menu == 1){
            println("Menyerang")
            enemyHP -= hero.baseDamage;
            println("Damage: ${hero.baseDamage}, sisa health musuh: ${enemyHP}")
            if (enemyHP > 0){
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
            }
        }else if (menu ==2 ){
            println("Hero Kabur");
        }else {
            println("Error menu tidak ada");
        }
    }
    var winner = "";
    if (enemyHP > hero.hp ){
        winner = "Enemy"
    }else if (hero.hp > enemyHP){
        winner = "Hero"
    }else{
        print("Error");
        return;
    }
    println("Pemenangnya adalah: $winner")
}