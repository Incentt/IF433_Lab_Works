package oop_104654_VincentWisnata.week9

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 12.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, -8.3, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 20, -15.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 25.7, "CLOSED"),
        TradeLog("BNBUSDT", "LONG", 8, 5.2, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 12, -3.5, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach {
        println(it)
    }

    println("\n--- WORST PERFORMERS ---")
    worstPerformersString.forEach {
        println(it)
    }

    println("\n--- UNIQUE PAIRS ---")
    println(uniquePairs)
}
