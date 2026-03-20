package oop_104654_VincentWisnata.week7

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item,     50)
        }
        fun forgeEpicSword(): Weapon{
            val item = GameItem("Pedang Besi Keras", 100, ItemRarity.EPIC)
            return Weapon(item,     50)
        }
    }
}