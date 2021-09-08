class Normal(override val name: String, override val surname: String) : User {
    override fun status() = "Normal"
    override fun showAds() = true

}