package oop_104654_VincentWisnata.week10

data class Coin(
    override val name: String,
    val balance: Double
) : HasName
data class Transaction(val id: String, val amount: Double)