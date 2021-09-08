package Animales

//La palabra open la habilita para ser clase base.
//En la clase base definimos un constructor primario.
open class Animal (var nombre:String){ //La clase base hereda de forma implícita de Any (como todas las clases, igual que en Java heredan de Object).
    var raza: String = ""
    var peso: Float = 0.toFloat()
    var edad: Int = 0

    init{
        this.raza = "No especificada"
    }

    /*
    Este ejemplo es usando constructores secundarios.
     */

    constructor(nombre:String, edad:Int):this(nombre){
        this.nombre = nombre
        this.edad = edad
    }

    constructor(nombre:String, edad:Int, raza:String):this(nombre){
        this.nombre = nombre
        this.edad = edad
        this.raza = raza
    }

    fun vacunar():String {
        return "Animales.Animal " + this.nombre + " vacunado."
    }

    fun dormir():String {
        return "Animales.Animal " + this.nombre + " durmiendo."
    }

    fun comer():String {
        return "Animales.Animal " + this.nombre + " comiendo."
    }

    /**
     * La clausula open es necesaria para aquellos métodos que vamos a sobrescribir en las clases hijas.
     * Con los atributos pasa igual. Si queremos definir atributos que se pueden sobreescribir en las hijas
     * se pondrá:
     *     open var loquesea:Int = 0 --> En la clase base/madre.
     * Y:
     *     override var loquesea = 18 --> En la clase derivada/hija
     */
    open fun hacerCaso():String {
        return "Animales.Animal " + this.nombre + " hace caso."
    }

    open fun hacerRuido():String {
        return "Animales.Animal " + this.nombre + " hace ruido"
    }

    override fun toString():String{
        return "Animales.Animal{nombre: " + this.nombre + ", edad: " + this.edad + ", peso: " + this.peso + ", raza: " + this.raza + "}"
    }
}