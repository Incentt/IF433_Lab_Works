package oop_104654_VincentWisnata.week2
import java.util.Scanner

class Student(
    val name: String,
    val nim: String,
    var major: String,
){
    init {
        if(nim.length != 5){
            println("NIM  ${nim} Tidak valid, NIM berisi 5 karakter")
        }else{
            print("LOG: Objek Student $name berhasil dialokasikan ke dalam memori")
        }
    }
    constructor(name: String, nim: String): this(name, nim, "Non-Matriculated"){
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan)")
    }
}
fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print("Masukan Nama : ")
    val name = scanner.nextLine();

    print("Masukan Nim (WAJIB 5 KARAKTER): ")
    val nim = scanner.next();

    scanner.nextLine();
    if (nim.length != 5){
        println("ERROR: Pendaftaran dibatalkan, NIM harus 5 KARAKTER");
    }else{
        print("Masukan Jurusan : ")
        val major = scanner.nextLine();

        val s1 = Student(name, nim, major)
        println("Status Pendaftaran selesai.")
    }
}