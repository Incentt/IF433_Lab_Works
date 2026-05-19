package oop_104654_VincentWisnata.week13

import java.io.File

fun main(){
    val src = "/Users/incent/Documents/UMN/IF433_Lab_Works/IF433_Lab_Works/src/oop_104654_VincentWisnata/week13/"

    println("=== TEST WRITE TEXT ===")
    val file = File("${src}notes.txt")
    file.writeText("Line1: inisialisasi sistem \n")
    println("File berhasil dibuat")

    file.appendText("Line2: menambahkan konfigurasi baru \n")
    println("Teks berhasil append")
    


}