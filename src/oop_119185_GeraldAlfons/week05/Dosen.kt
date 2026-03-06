package oop_119185_GeraldAlfons.week05

class Dosen(nama: String, val nidn: String) : Pegawai (nama){
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkulihan dan merevisi RPKPS.")
    }
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}

