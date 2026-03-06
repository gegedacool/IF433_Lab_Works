package oop_119185_GeraldAlfons.week05

fun Main () {
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
}