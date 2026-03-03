package oop_104654_VincentWisnata.week5

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}