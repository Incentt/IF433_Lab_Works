package oop_104654_VincentWisnata.week2
import java.util.Scanner

class Loan(var bookTitle: String, var borrower: String, var loanDuration: Int = 1) {

    init {
        println("--- DETAIL PEMINJAMAN ---")
        println("Judul buku: $bookTitle")
        println("Nama Peminjam: $borrower")
        println("Denda pinjaman: ${calculateFine()}")
    }
    fun calculateFine(): Int{
        var denda: Int = 0;
        if (loanDuration > 3){
             denda = (loanDuration - 3) * 2000
        }else if (loanDuration <= 3){
            denda = 0;
        }
        return denda;
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI LIBRARY UMN ---")
    print("Masukan Nama Buku : ")
    val bookName = scanner.nextLine();
    print("Masukan Nama Peminjam: ")
    val borrowerName = scanner.nextLine();
    print("Masukan Lama Pinjam: ")
    var loanDuration = scanner.nextInt()
    scanner.nextLine();

    if (loanDuration < 0){
        loanDuration = 1
    }
    var bukuPinjaman = Loan(bookName, borrowerName, loanDuration)
}