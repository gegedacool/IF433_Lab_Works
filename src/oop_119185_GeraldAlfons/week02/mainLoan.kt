package oop_119185_GeraldAlfons.week02

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- SISTEM DENDA PERPUSTAKAAN ---")
    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // Validasi: Tidak boleh minus
    if (duration < 0) {
        println("WARNING: Durasi tidak valid, diatur ke default 1 hari.")
        duration = 1
    }

    // Buat objek Loan
    val myLoan = Loan(title, borrower, duration)

    // Output Detail
    println("\n--- Detail Peminjaman ---")
    println("Buku: ${myLoan.bookTitle}")
    println("Peminjam: ${myLoan.borrower}")
    println("Durasi: ${myLoan.loanDuration} hari")
    println("Total Denda: Rp ${myLoan.calculateFine()}")
}