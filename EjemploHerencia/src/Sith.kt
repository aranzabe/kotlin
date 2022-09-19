class Sith (n: String, m: Int, var maldad:Int = 0) : Metodos, Personaje(n, m) {

    companion object {
        var ESTSITH = 20
        val pe = Personaje.estaticos
    }

    init{
        this.nombre = "Darth: "
    }

    override fun pelearSable():String {
        return "Sith " + this.nombre + " peleando"
    }

    override fun otroMetodo(): Int {
        return 0
    }

    public override fun hablar():String{
        return "Darth " + this.nombre + " dice hola"
    }
    override fun toString(): String {
        return super.toString() + ", maldad: " + this.maldad
    }

    public fun serMalotes():String{
        var emp:String = "Poco"
        if (this.maldad > 80){
            emp = "Mucho"
        }
        return emp;
    }
}