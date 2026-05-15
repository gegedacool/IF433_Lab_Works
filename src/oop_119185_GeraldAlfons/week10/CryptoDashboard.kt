package oop_119185_GeraldAlfons.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name} | Balance: ${it.balance}")
    }
    println("\n=== RECENT TRANSACTIONS ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 150.0))
    txRepo.add(Transaction("TX002", 300.5))

    txRepo.getAll().forEach {
        println("ID: ${it.id} | Amount: ${it.amount}")
    }
}