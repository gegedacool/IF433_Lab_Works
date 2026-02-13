package oop_119185_GeraldAlfons.week02

import java.util.Scanner

fun main(){
    val sccanner = Scanner(source = System.`in`)
    println("--- APLIKASI PMB UMN ---")
    print ("Masukkan Nama : ")
    val name = scanner.nextLine()

    print("Masukkan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()

    sccanner.nextLine()

    //Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR : Pendaftaran dibatalkan. NIM harus 5 karakter!")
        //program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan Jurusan : ")
        val major = scanner.nextLine()

        //instansi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status : Pendaftaran Selesai.")
    }
}
