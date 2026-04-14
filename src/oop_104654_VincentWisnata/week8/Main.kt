package oop_104654_VincentWisnata.week8

fun main(){
    println("===== TEST SAFECALL =====");
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kotak Tidak Diketahui"
    println("Tujuan Pengiriman $destination")
}