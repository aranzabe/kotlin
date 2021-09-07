class Perro: Animal {
    var lealtad:Int = 0

    /*
    Usando constructores secundarios.
     */
    constructor(nombre: String, edad:Int, lealtad:Int) : super(nombre, edad){
        this.lealtad = lealtad
    }

    constructor(nombre: String, edad:Int, raza:String, lealtad:Int) : super(nombre, edad, raza){
        this.lealtad = lealtad
    }

    //Esta función es exclusica del perro.
    fun sacarPaseo():String{
        return "El perro " + this.nombre + " sale de paseo."
    }

    override fun hacerRuido(): String {
        return "El perro " + this.nombre + " hace GUAU."
    }

    override fun hacerCaso(): String {
        var lohace:String = "no hace caso"
        if (this.lealtad >= 50){
            lohace = "haciendo caso"
        }
        return "El perro " + this.nombre + " " + lohace
    }

    override fun toString(): String {
        return "Perro:{" + super.toString() + " ,lealtad perruna: " + this.lealtad + "}"
    }

}
