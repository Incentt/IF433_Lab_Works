package oop_104654_VincentWisnata.week1

fun main() {
    val gameTitle = "John Wick";
    val price = 100000;
    printReceipt(title = gameTitle, price = price)
}

fun calculateDiscount(price: Int): Int{
    if (price > 500000){
        return  (price *20/100)
    }else {
        return (price *10/100)
    }
}
//Note dikarenakan output juga meminta harga original, saya ganti final price menjadi price - Vincent
fun printReceipt(title: String, price: Int){
    println("============================")
    println("Nama Game: $title")
    println("Harga Produk: $price")
    println("Diskon: ${calculateDiscount(price)}")
    println("Harga Produk setelah diskon: ${price - calculateDiscount(price)}")
    println("============================")
}