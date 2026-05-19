package oop_104654_VincentWisnata.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(var nama: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$nama,$age,$gpa"

fun fromCSV(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}
fun saveStudents(students: List<Student>, path: String) {
    File("$path").writeText(students.joinToString("\n"){
        it.toCsv()
    }
    )
}

fun loadStudents(path: String): List<Student> {
    return try{
            File(path).readLines().map { fromCSV(it)}
    }catch(e: FileNotFoundException){
        println("EROR: File tidak ditemukan")
        emptyList()
    }
}
fun main (){
    val src = "/Users/incent/Documents/UMN/IF433_Lab_Works/IF433_Lab_Works/src/oop_104654_VincentWisnata/week13/"
    val Students = listOf(
        Student("ALice",20, 3.0),
        Student("Bob", 22, 3.5)
    )
    saveStudents(Students, "$src/students.csv")

    val loaded = loadStudents("$src/students.csv")
    println("=== LOADED STUDENT DATA ===")
    loaded.forEach { println(it) }
}