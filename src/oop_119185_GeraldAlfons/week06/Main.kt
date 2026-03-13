package oop_119185_GeraldAlfons.week06

import oop_119185_GeraldAlfons.week05.PaymentMethod

fun processCheckout (method: PaymentMethod, amount: Double) {
    println("-> Memulai Checkout:...")
    method.pay(amount) //


fun main () {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    val lamp = SmartLamp("L01", "Ruang Tamu")
    val speaker = SmartSpeaker("S01", "Google Nest Dapur")
    val cctv = SmartCCTV("C01", "Ezviz Garasi")
    val myHub = SmartHomeHub()
    myHub.addDevice(lamp)
    myHub.addDevice(speaker)
    myHub.addDevice(cctv)

    myHub.activateSecurityMode()
    myHub.turnOffAllSwitches()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount =150000.0)
}
}