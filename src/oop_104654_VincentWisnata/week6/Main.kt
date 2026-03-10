package oop_104654_VincentWisnata.week6

fun main(){
    fun processCheckout(method: PaymentMethod, amount: Double) {
        println("Memulai Checkout...")
        method.Pay(amount)
    }
    val myWatch = Smartwatch()
    myWatch.ShowTime()
    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === TESTING CHECKOUT ===")
    processCheckout( pay1, 50000.0)
    processCheckout( pay2, 150000.0)

    val SL = SmartLamp("1", "Ruang Tamu")
    val SS = SmartSpeaker("2", "Google Nest Dapur")
    val SC = SmartCCTV("3", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(SL)
    hub.addDevice(SS)
    hub.addDevice(SC)
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}