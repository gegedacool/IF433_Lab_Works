package oop_119185_GeraldAlfons.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName] Transaksi kartu kredit sukses. Terpakai: $usedAmount")
        } else {
            println("[$accountName] Transaksi ditolak: Melebihi limit!")
        }
    }
}