package oop_104654_VincentWisnata.week2

class student(
    val name: String,
    val nim: String,
    var major: String,
){
init {
    if(nim.length != 5){
        println("NIM  ${nim} Tidak valid")
    }else{
        print("LOG: Objek Student $name berhasil dialokasikan ke dalam memori")
    }
}
}