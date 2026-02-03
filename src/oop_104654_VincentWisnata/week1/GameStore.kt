package oop_104654_VincentWisnata.week1

fun main() {
    val gameTitle = "John Wick";
    val price = 100000;
    val userNote: String? = ""
    printReceipt(title = gameTitle, price = price, note = userNote)
}

fun calculateDiscount(price: Int): Int{
    if (price > 500000){
        return  (price *20/100)
    }else {
        return (price *10/100)
    }
}
//Note dikarenakan output juga meminta harga original, saya ganti final price menjadi price - Vincent
fun printReceipt(title: String, price: Int, note: String?){
    println("============================")
    println("Nama Game: $title")
    println("Harga Produk: $price")
    println("Diskon: ${calculateDiscount(price)}")
    println("Harga Produk setelah diskon: ${price - calculateDiscount(price)}")
    // Elvis Operator
    println("Note: ${note ?: "Tidak ada catatan"}")
    println("============================")
}