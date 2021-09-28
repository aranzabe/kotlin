class FoodOrder private constructor(
    val bread: String?,
    val condiments: String?,
    val meat: String?,
    val fish: String?) {

    /*
    Una data class no es más que una clase que sólo contiene estado y no realiza ninguna operación.
    La ventaja de utilizar data classes en vez de clases normales es que Kotlin nos aporta una cantidad inmensa de código autogenerado.
    https://devexperto.com/data-classes-kotlin/
     */
    class Builder(
        var bread: String? = null,
        var condiments: String? = null,
        var meat: String? = null,
        var fish: String? = null) {

        fun bread(bread: String):Builder
            {
                this.bread = bread
                return this
            }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread, condiments, meat, fish)
    }

    override fun toString(): String {
        return "Order: {" + this.bread + ", " + this.condiments + ", " + this.meat + ", " + this.fish + "}"
    }
}