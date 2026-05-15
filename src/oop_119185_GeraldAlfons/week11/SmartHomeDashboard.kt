package oop_119185_GeraldAlfons.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()
    homeDevices.add(SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    })

}
