package oop_104654_VincentWisnata.week10

fun main(){
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 1.5))
    coinRepo.add(Coin("ETH", 10.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 250.0))
    txRepo.add(Transaction("TX003", 100.0))

    println("\nDaftar Transaksi:")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }}