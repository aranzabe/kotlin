fun main(){
    //https://kotlin.desarrollador-android.com/patrones-de-diseno/patrones-creacionales/factory-method/
    val normal = UserFactory.getUser(UserType.Normal, "James", "Smith")
        println(normal.getFullName())
        println(normal.status())
        println(normal.showAds())

    val premium = UserFactory.getUser(UserType.Premium, "Peter", "Brown")
    with(premium) {
        println(getFullName())
        println(status())
        println("Show ads: ${showAds()}")
    }

    println("Normal: $normal")
    println("Premium: $premium")

}