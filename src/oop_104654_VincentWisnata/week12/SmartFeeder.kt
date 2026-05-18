package oop_104654_VincentWisnata.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {

    require(requestedGram > 0) {
        "Porsi kibble harus lebih dari 0 gr"
    }
    if (isJammed) {
        throw DispenserJamException()
    }
    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, requestedGram)
    }
    return requestedGram
}
fun main(){
    var currentKibbleStock = 50.0;
    try {
        dispenseKibble( 80, currentKibbleStock, false)
    }catch (e: FoodEmptyException){
        println(e.message)
    }catch (e: DispenserJamException){
        println(e.message)
    }catch (e: Exception){
        println("Something went wrong ${e.message}")
    }

}