package oop_119185_GeraldAlfons.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName] Pembayaran sebesar $amount sukses. Sisa saldo: $balance")
        } else {
            println("[$accountName] Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName] Berhasil top up $amount. Saldo sekarang: $balance")
    }
}