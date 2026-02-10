package oop_104654_VincentWisnata.week2
import java.util.Scanner

class Student(
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String,
){
    init {
        if(nim.length != 5){
            println("NIM  ${nim} Tidak valid, NIM berisi 5 karakter")
        }else{
            println("LOG: Objek Student $name berhasil dialokasikan ke dalam memori")
        }
    }
    constructor(name: String, nim: String, gpa: Double = 0.0): this(name, nim, gpa, "Non-Matriculated"){
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

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt();
    scanner.nextLine();

    if (type == 1){
        print("Masukan Jurusan: ")
        print("Masukan Jurusan : ")
        val major = scanner.nextLine();

        val s1 = Student(name, nim)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2){
        val s2 = Student(nim, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    }else{
        println("Pilihan ngawur, pendaftaran batal!!!!")
    }

//    scanner.nextLine();
//    if (nim.length != 5){
//        println("ERROR: Pendaftaran dibatalkan, NIM harus 5 KARAKTER");
//    }else{
//        print("Masukan Jurusan : ")
//        val major = scanner.nextLine();
//
//        val s1 = Student(name, nim)
//        println("Status Pendaftaran selesai.")
//    }
}