package oop_104654_VincentWisnata.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" }

        val type = rawJson["type"] as? String
        return when (type) {
            "ELECTRONIC" -> {
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(
                    id = id.toString(),
                    name = name.toString(),
                    warrantyMonths = warranty
                )
            }
            "CLOTHING" -> {
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(
                    id = id.toString(),
                    name = name.toString(),
                    size = size
                )
            }
            else -> null
        }
    }
    
    fun checkout(product: Product) {
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        val transactionId = JavaPaymentService.processPayment(productId)!!

        println("Transaction ID: $transactionId")
    }
}