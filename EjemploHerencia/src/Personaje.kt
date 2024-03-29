//abstract class Personaje {
open class Personaje {
    var nombre:String = ""
    var midiclorianos:Int = 0

    constructor(n:String, m:Int){
        this.nombre = n
        this.midiclorianos = m
    }

    companion object estaticos {
        open var N:Int = 10
    }

    //abstract fun pelearSable():String


    open public fun hablar():String{
        return this.nombre + " dice hola"
    }



    override fun toString(): String {
        return "Personaje: (" + this.nombre + ", " + this.midiclorianos + ")"
    }
}