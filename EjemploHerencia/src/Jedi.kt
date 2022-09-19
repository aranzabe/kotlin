class Jedi :  Personaje, Metodos {
    var empalago:Int = 0

    companion object{
        val pe = Personaje.estaticos
    }

    constructor(n:String , m:Int , em:Int ) : super(n,m) {
        this.empalago = em
    }

    init{
        this.nombre = "Caballero: "
    }


    override fun pelearSable():String {
        return "Jedi " + this.nombre + " peleando"
    }

    override fun otroMetodo(): Int {
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