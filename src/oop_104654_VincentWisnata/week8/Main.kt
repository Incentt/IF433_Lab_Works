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
    println(receipt)

    println("===== TEST SAFE CASTING =====");
    val mixedData: List<Any> = listOf(
        "Smartphone", 150000, UserProfile("Andi", null), "Laptop", 450000.0
    )
    for(i in mixedData){
        val text = i as? String
        text?.let {
            println("Ditemukan Text: ${it.uppercase()}")
        }
    }
    val someObject: Any = 100
    val safeString = someObject as? String ?: "Unknown String"
    println("Hasil Cast + Fallback ${safeString}")
        //TEST BERHASIL
}