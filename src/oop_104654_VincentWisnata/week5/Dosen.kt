package oop_104654_VincentWisnata.week5

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
println("[$nama] bekerja sedang menyiapkan materi perkuliahan dan merevisi RPKPS")
    }
    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas")
    }
}