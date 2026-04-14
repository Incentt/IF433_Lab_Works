package oop_104654_VincentWisnata.week8

fun main(){
    println("===== TEST SAFECALL =====");
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kotak Tidak Diketahui"
    println("Tujuan Pengiriman $destination")

    println("===== TEST LET BLOCK =====");
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let {
        price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga RP $price, Pajak: $tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    print(receipt)

    println("===== TEST SAFE CASTING =====");
    val mixedData: List<Any> = listOf(
        "Smartphone", 150000, UserProfile("Andi", null), "Laptop", 450000.0
    )

}