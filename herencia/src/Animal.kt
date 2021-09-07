//La palabra open la habilita para ser clase base.
open class Animal { //La clase base hereda de forma implícita de Any (como todas las clases, igualque en Java heredan de Object).
    var nombre: String = ""
    var raza: String = ""
    var peso: Float = 0.toFloat()
    var edad: Int = 0

    init{
        this.raza = "No especificada"
    }

    /*
    Este ejemplo es usando constructores secundarios.
     */
    constructor(nombre: String) {
        this.nombre = nombre
    }

    constructor(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
    }

    constructor(nombre:String, edad:Int, raza:String){
        this.nombre = nombre
        this.edad = edad
        this.raza = raza
    }

    fun vacunar():String {
        return "Animal " + this.nombre + " vacunado."
    }

    fun dormir():String {
        return "Animal " + this.nombre + " durmiendo."
    }

    fun comer():String {
        return "Animal " + this.nombre + " comiendo."
    }

    /**
     * La clausula open es necesaria para aquellos métodos que vamos a sobrescribir en las clases hijas.
     */
    open fun hacerCaso():String {
        return "Animal " + this.nombre + " hace caso."
    }

    open fun hacerRuido():String {
        return "Animal " + this.nombre + " hace ruido"
    }

    override fun toString():String{
        return "Animal{nombre: " + this.nombre + ", edad: " + this.edad + ", peso: " + this.peso + ", raza: " + this.raza + "}"
    }
}