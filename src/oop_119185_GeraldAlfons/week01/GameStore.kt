    package oop_119185_GeraldAlfons.week01

    fun main() {
        val gameTitle: String = "Elden Ring: Shadow of the Erdtree"
        val price: Int = 600000
        val userNote: string? = null

        val discount = calculateDiscount(price)
        val finalPrice = price - discount

        printReceipt(
            title = gameTitle,
            finalPrice = finalPrice,
            note = userNote
        )

    }

    fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

    fun printReceipt(title: String, finalPrice: Int, note: String?) {
        println("========= STRUK PEMBELIAN =========")
        println("Game        : $title")
        println("Total Bayar : Rp $finalPrice")

        val displayNote = note ?: "Tidak ada catatan"
        println("Catatan     : $displayNote")

        println("===================================")
        println("Terima kasih telah belanja di SteamKW!")
    }