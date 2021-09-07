//Esta clase tendrá métodos abstractos por lo que no se podrá instanciar.
/*
Para probar esto podemos hacer que Perro y Gato hereden de Animal2. Comentamos alguna función abstracta de las hijas
y veremos como me la exige definir, tal y como sucedía en Java.
 */
abstract class Animal2 { //La clase base hereda de forma implícita de Any (como todas las clases, igualque en Java heredan de Object).
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
     * En esta segunda clase Animal2, al tener métodos abstractos la convierte en abstracta.
     */
    //abstract fun hacerCaso():String

    //abstract fun hacerRuido():String

    override fun toString():String{
        return "Animal{nombre: " + this.nombre + ", edad: " + this.edad + ", peso: " + this.peso + ", raza: " + this.raza + "}"
    }
}