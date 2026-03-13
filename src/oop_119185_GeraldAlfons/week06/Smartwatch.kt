package oop_119185_GeraldAlfons.week06

class Smartwatch : Watch(), Rechargeable, BluetoothConnectable {
    override fun showTime() {
        println("Layar OLED menyala : 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di sekitar untuk pairing")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magnetic 15W.")
    }
}