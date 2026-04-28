package oop_104654_VincentWisnata.week10

interface HasName {
    val name: String
}

class WalletRepository<T : HasName> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(name: String): List<T> {
        return items.filter {
            it.name.contains(name, ignoreCase = true)
        }
    }
}