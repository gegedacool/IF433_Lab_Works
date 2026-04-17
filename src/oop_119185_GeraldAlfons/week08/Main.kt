package oop_119185_GeraldAlfons.week08

fun Main {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)
    val destination = emptyOrder.deliveryDetail?.address?.city?.name ?: "Kota Tidak Diketahui"
    print("Tujuan pengiriman : $destination")

    print("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)
    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Paja: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"
    println(receipt)
}