package oop_119185_GeraldAlfons.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}