package oop_119185_GeraldAlfons.week06

class Button (override val name: String) : Clickable {
    override fun click() {
        println("Tombol '$name' berhasil di klik")
    }
}