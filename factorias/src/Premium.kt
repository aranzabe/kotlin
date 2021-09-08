class Premium(override val name: String, override val surname: String) : User {
    override fun status() = "Premium"
    override fun showAds() = false

}