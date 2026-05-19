package oop_104654_VincentWisnata.week13

import java.io.File
import java.io.FileNotFoundException

data class Student(var nama: String, val age: Int, val gpa: Double)

fun Student.toCsv(): String = "$nama, $age, $gpa"

fun fromCSV(line: String): Student {
    val parts = line.split(",")
    return Student(parts[0], parts[1].toInt(), parts[2].toDouble())
}
fun loadStudents(path: String): List<Student> {
    return try{
        File(path).readLines().map { fromCSV(it)}
    }catch(e: FileNotFoundException){
        println("EROR: File tidak ditemukan")
        emptyList()
    }
}