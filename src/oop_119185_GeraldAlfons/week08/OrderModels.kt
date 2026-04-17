package oop_119185_GeraldAlfons.week08

class city (val name: String)
class Adress (val city: String)
class DeliveryDetail(val address: Address?)
class Order(val deliveryDetail: DeliveryDetail?, val totalPrice: Int?)