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

}