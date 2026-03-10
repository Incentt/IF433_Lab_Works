package oop_104654_VincentWisnata.week6

class Button(override val name: String): Clickable {
    override fun click() {
        println("Tombol $name berhasil di klik")
    }
}