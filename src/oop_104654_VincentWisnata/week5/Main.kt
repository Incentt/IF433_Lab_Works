package oop_104654_VincentWisnata.week5

fun main(){
    val dosen1 = Dosen("Pak Alex", nidn = "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVASI PEGAWAI ===")
    for(pegawai in daftarPegawai){
        pegawai.bekerja()
        when(pegawai){
            is Dosen -> {
                println("Terdeketsi sebagai Dosen ${pegawai.nidn}")
                pegawai.mengajar()
            }
            is Admin -> {
                println("Terdeketsi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }

println("TES MATEMATIKA")
    println("Luas dari 2 adalah:")
    println(MathHelper().HitungLuas(2))
    println("luas dari P = 2 dan L = 4 adalah")
    println(MathHelper().HitungLuas(2, 4))
    println("Luas dari jari jari 12 adalah")
    println(MathHelper().HitungLuas( 12.0))

    var EW = EWallet("vincent", 5000.0)
    var CC = CreditCard("vincentCredit", 100000.0)
    var paymentMethod: List<PaymentMethod> = listOf(EW, CC)
    for (payment in paymentMethod){
        when (payment){
            is EWallet -> {
                payment.processPayment(75000.0)
            }
            is CreditCard -> {
                payment.processPayment(75000.0)
            }
        }
    }

}