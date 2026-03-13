package oop_119185_GeraldAlfons.week06

class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Phone>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi smartphone berhasil booting.")
    }
}

