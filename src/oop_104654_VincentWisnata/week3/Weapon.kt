package oop_104654_VincentWisnata.week3

class Weapon(val name: String) {
    var Damage: Int = 0
        set(value) {
            if(value < 0){
                println("ERROR: Damage tidak boleh negatif")
            }else if (value > 1000){
                println("ERROR: Damage tidak boleh lebih dari 1000")
                field = 1000
            }
            else{
                field = value
            }
        }
    val tier: String
        get() {
            if (Damage > 800) {
                return "Legendary"
            } else if (Damage > 500) {
                return "Epic"
            } else {
                return "Common"
            }
        }
}