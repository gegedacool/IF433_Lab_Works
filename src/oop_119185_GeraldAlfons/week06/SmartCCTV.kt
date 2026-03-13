package oop_119185_GeraldAlfons.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] Kamera aktif.")
        startRecord() // Wajib memanggil startRecord otomatis
    }

    override fun turnOff() {
        println("[$name] Kamera non-aktif.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Memulai perekaman video...")
    }
}