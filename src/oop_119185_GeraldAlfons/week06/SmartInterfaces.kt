package oop_119185_GeraldAlfons.week06

class SmartInterfaces {
    interface SmartDevice {
        val id: String
        val name: String
    }

    interface Switchable {
        fun turnOn()
        fun turnOff()
    }

    interface Recordable {
        fun startRecord()
        // Default function dengan body
        fun stopRecord() {
            println("Perekaman dihentikan dan disimpan ke Cloud.")
        }
    }
}