package oop_104654_VincentWisnata.week12

class InsufficentFundsException(
    val amount: Double,
    val balance: Double,
): Exception("Attempted $amount , balance: $balance")