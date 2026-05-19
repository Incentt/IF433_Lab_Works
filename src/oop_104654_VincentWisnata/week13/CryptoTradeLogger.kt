package oop_104654_VincentWisnata.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"
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

fun main() {
    val src = "/Users/incent/Documents/UMN/IF433_Lab_Works/IF433_Lab_Works/src/oop_104654_VincentWisnata/week13/"
    val trades = listOf(
        TradeRecord(
            id = 1,
            symbol = "BTCUSDT",
            type = "Long",
            margin = 1500.0,
            pnl = 320.5
        ),
        TradeRecord(
            id = 2,
            symbol = "ETHUSDT",
            type = "Short",
            margin = 800.0,
            pnl = -120.75
        ),
        TradeRecord(
            id = 3,
            symbol = "SOLUSDT",
            type = "Long",
            margin = 500.0,
            pnl = 95.25
        )
    )

    saveTrades(trades, "${src}crypto_trades.csv")
    println("Data trade berhasil disimpan ke crypto_trades.csv")

    File("${src}crypto_trades.csv")
        .appendText("\nCORRUPT_ID,DOGEUSDT,Hold,XX,YY\n")

    println("Data trade & data korup berhasil ditulis.")

    val loadedData = loadTrades("${src}crypto_trades.csv")
    val totalPnL = loadedData.sumOf { it.pnl }

    println("\n=== LOADED TRADE DATA ===")
    loadedData.forEach { println(it) }

    println("\nTotal Net PnL: $totalPnL")
}