package oop_104654_VincentWisnata.week5

class CreditCard(accountName: String, val Limit: Double) : PaymentMethod(accountName)   {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        usedAmount += amount
        if (usedAmount > Limit) {
        println("Transaksi ditolak")
        }else{
            println("Transaksi Success")
        }
    }
}