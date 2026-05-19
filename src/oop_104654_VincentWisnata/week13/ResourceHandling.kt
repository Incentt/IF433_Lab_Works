package oop_104654_VincentWisnata.week13

import java.io.File

fun main(){
    val src = "/Users/incent/Documents/UMN/IF433_Lab_Works/IF433_Lab_Works/src/oop_104654_VincentWisnata/week13/"

    println(" === TEST UNSAFE RESOURCE HANDLING ===")
    val unsafeFile = File("$src/unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log1: Membuka koneksi database")
    writer.println("Log2: Menulis data pengguna")

    writer.close()
    println("Proses penulisan unsafe selesai.")

}