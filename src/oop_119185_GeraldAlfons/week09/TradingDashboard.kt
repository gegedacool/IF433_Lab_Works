package oop_119185_GeraldAlfons.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, 120.0, "OPEN"),
        TradeLog("SOLUSDT", "LONG", 10, 8.4, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 20, -12.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 25, -2.5, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }