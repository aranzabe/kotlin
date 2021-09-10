//En esta clase usaremos un Builder para contruir personas a modo de factorías.
class PersonaBuilder {
    var nombre: String?
    var edad: Int?

    constructor(nombre:String?, edad:Int?){
        this.nombre = nombre
        this.edad = edad
        PersonaBuilder.count++
    }

    //Definimos una clase interna de tipo data.
    data class Builder(var nombre: String? = null, var edad:Int?=0) {
        fun nombre(nombre: String) = apply { this.nombre = nombre }
        fun edad(edad: Int) = apply { this.edad = edad }
        fun build() = PersonaBuilder(nombre, edad)
    }

    //Todos los métodos y atributos que queramos que sean estáticos van aquí, entre "companion object".
    companion object {
        var count:Int = 0

        fun getCount() : String {
            return count.toString()
        }
    }

    override fun toString():String {
        return this.nombre + " " + this.edad
    }

    //Por defecto el método es público.
    public fun hablame():String {
        return "Hola soy " + this.nombre
    }


}