package oop_119185_GeraldAlfons.week13
import java.io.File

fun main () {
    println("=== TEST WRITE TEXT ===")
    val file = File ("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem.\n")
    println("File berhasil dibuat dan ditulis")
    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")

    println("=== TEST READ TEXT ===")
    val fullContent = file.readText()
    println("membaca sekaligus:\n$fullContent")

    println("=== TEST READ LINES===")
    val lines = file.readLines()
    lines.forEach { index, line ->
        println("Isi Index $index: $line")
    }
}


