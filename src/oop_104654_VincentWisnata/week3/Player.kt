package oop_104654_VincentWisnata.week3

class Player(val name: String) {
    private var xp: Int = 0
    var level: Int = 0
        get() = (xp / 100) + 1

    fun addXp(xp: Int) {
        var previousLevel: Int = level
        if (xp < 0) {
            println("XP tidak boleh negatif")
        }else{
            this.xp += xp
        }
        if (level > previousLevel) {
            println("Level Up! Selamat ${name} naik ke" + "level: $level")
        }else{
            println("Level saat ini: ${level}")
        }
    }
}