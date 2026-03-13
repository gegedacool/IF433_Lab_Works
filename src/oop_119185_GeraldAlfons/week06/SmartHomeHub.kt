package oop_119185_GeraldAlfons.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        println("\n--- Mematikan Semua Perangkat ---")
        for (device in devices) {
            // Smart Casting menggunakan 'is'
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        println("\n--- MENGAKTIFKAN MODE KEAMANAN ---")
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                // Casting manual untuk akses fungsi spesifik
                (device as SmartSpeaker).playMusic("Sirine Peringatan")
            }
        }
    }
}