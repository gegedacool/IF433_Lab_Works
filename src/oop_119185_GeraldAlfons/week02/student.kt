package oop_119185_GeraldAlfons.week02

class Student (val name: String, val nim: String, var major: String, var gpa: Double = 0.0) {
    init {
        //validasi sederhana: cek panjang nim
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan nim ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di memory.")
        }
    }

    //secondary constructor
    //wajib memanggil primary constructor menggunakan `this()`
    constructor (name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }
}

