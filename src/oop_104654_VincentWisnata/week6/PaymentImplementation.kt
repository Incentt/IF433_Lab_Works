package oop_104654_VincentWisnata.week6

class Gopay: PaymentMethod {
    override fun Pay(amount: Double) {
println("Processing Rp$amount via Gopay Server")
    }
}
class  CreditCard: PaymentMethod {
    override  fun Pay(amount: Double) {
        println("Processing Rp$amount via CreditCard")
    }
}