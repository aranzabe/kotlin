//Esta persona está construida con un constructor primario que sirve para definir tb los atributos de la clase.
class Persona2(var nombre:String, var edad:Int) {
    constructor(nombre: String) : this(nombre, 0) {
    }
    constructor() : this("Nadie", 0) {
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
