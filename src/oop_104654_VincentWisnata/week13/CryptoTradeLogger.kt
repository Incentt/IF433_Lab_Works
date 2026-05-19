package oop_104654_VincentWisnata.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")

        TradeRecord(
            parts[0].trim().toInt(),
            parts[1].trim(),
            parts[2].trim(),
            parts[3].trim().toDouble(),
            parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String){
    File("$path").writeText(trades.joinToString("\n"){
        it.toCsv()
    }
    )
}
fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path)
            .readLines()
            .mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("ERROR: File tidak ditemukan")
        emptyList()
    }
}