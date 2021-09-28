class Jedi(n: String, m: Int) : Metodos,  Personaje(n, m) {
    var empalago:Int = 0

    init{
        this.nombre = "Caballero: "
    }
    constructor(n:String, m:Int, em:Int):this(n,m){
        this.nombre = this.nombre + n
        this.empalago = em
    }

    override fun pelearSable():String {
        return "Jedi " + this.nombre + " peleando"
    }

    override fun preguntaAlvaro(): Int {
        return 0
    }

    public override fun hablar():String{
        return "El Jedi " + this.nombre + " dice hola"
    }

    public fun empalagar():String{
        var emp:String = "Poco"
        if (this.empalago > 80){
            emp = "Mucho"
        }
        return emp;
    }

    override fun toString(): String {
        return super.toString() + ", empalago: " + this.empalago
    }
}