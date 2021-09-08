fun main() {
    val foodOrder = FoodOrder.Builder()
        .bread("white bread")
        .meat("bacon")
        .condiments("olive oil")
        .build()

    var otroPedido = FoodOrder.Builder()
        .bread("brown bread").
        build()
    println(foodOrder)
    println(otroPedido)
}
