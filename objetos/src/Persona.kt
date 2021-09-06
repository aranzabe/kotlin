class Persona {
    //Los gettes y setters en Kotlin son implícitos y heredan el mismo acceso que las propiedades.
    //var nombre:String =""
    //var edad:Int = 0

    //Para declararlos de forma explícita.
    var nombre:String
        get() {
            return field
        }
        set(nuevoNombre) {
            field = nuevoNombre
        }
    var edad:Int = 0
        get() {
            return field
        }
        set(nuevaEdad) {
            field = nuevaEdad
        }

    //Todos los métodos y atributos que queramos que sean estáticos van aquí, entre "companion object".
    companion object {
        var count:Int = 0

        fun getCount() : String {
            return count.toString()
        }
    }

    /*
    El init no es obligatorio, pero en él puedes iniciar los elementos de la clase (statics) o simplemente hacer lo que se hace al construir tu objeto.
    El init es para establecer el valor inicial de las variables. Es muy útil cuando declaramos con val y las mismas se deben inicializar obligatoriamente.
    */
    /*init {
        println("Init del objeto")
        this.nombre = ""
        this.edad = 0
    }*/

    constructor(nombre: String) {
        this.nombre = nombre
        Persona.count++
    }

    constructor(){
        this.nombre = "Nadie"
        this.edad = 0
        Persona.count++
    }

    constructor(nombre:String, edad:Int){
        this.nombre = nombre
        this.edad = edad
        Persona.count++
    }

    override fun toString():String {
        return this.nombre + " " + this.edad
    }

    //Por defecto el método es público.
    public fun hablame():String {
        return "Hola soy " + this.nombre
    }


}