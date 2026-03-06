package oop_119185_GeraldAlfons.week05

fun Main () {
    val math = MathHelper()
    val dosen1 = Dosen(nama =  "Pak Alex", nidn ="0123456")
    val admin1  = Admin (nama = "Bu Siti")
    // Polymorphic Collection : list yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)
    println ("===Aktivitas Pegawai===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        //pegawai.mengajar() //ERROR
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println ("-------------------------------")


    }
    println("--- HASIL TUGAS MANDIRI 1 ---")
    println("Luas Persegi: ${math.hitungLuas(5)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(10, 5)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    // 1. Inisialisasi objek
    val eWallet = EWallet("Gopay Gege", 50000.0)
    val creditCard = CreditCard("Visa Platinum", 100000.0)

    // 2. Masukkan ke dalam list bertipe Parent (PaymentMethod)
    val listPayment: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("\n--- CHECKPOINT 10: POLYMORPHISM ---")
    for (payment in listPayment) {
        // Memanggil fungsi yang di-override (Runtime Polymorphism)
        payment.processPayment(75000.0)
    }

}
