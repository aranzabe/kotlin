class Sith (n: String, m: Int) : Metodos, Personaje(n, m) {
    var maldad:Int = 0

    init{
        this.nombre = "Darth: "
    }
    constructor(n:String, m:Int, ma:Int):this(n,m){
        this.nombre = this.nombre + n
        this.maldad = ma
    }

    override fun pelearSable():String {
        return "Sith " + this.nombre + " peleando"
    }

    override fun preguntaAlvaro(): Int {
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