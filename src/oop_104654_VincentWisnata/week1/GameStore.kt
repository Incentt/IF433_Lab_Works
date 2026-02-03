package oop_104654_VincentWisnata.week1

fun main() {
    val gameTitle = "Nama Game";
    val price = 100000;
}

fun calculateDiscount(price: Int): Int{
    if (price > 500000){
        return  (price *20/100)
    }else {
        return (price *10/100)
    }
}
