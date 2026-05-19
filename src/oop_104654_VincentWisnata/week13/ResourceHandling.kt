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

    println(" === TEST SAFE RESOURCE HANDLING ===")
    val safeFile = File("$src/safe_logs.txt")
    safeFile.printWriter().use { out ->
        for(i in 1..100){
            out.println("Safe log entry #${i}: System status: OK.")
        }
    }
    println("100 baris log berhasil di generate dengan sangat aman")

    println(" === TEST BUFFERED READER ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach {
            line ->
            println("Stream line $line")
        }
    }
}