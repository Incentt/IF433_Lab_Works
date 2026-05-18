package oop_104654_VincentWisnata.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    return requestedGram
}