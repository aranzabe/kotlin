class Persona(var nombre:String? = null, var edad:Int? = null, var vida:Int? = null,var bando:String? = null) {
    override fun toString(): String {
        return "Persona: (" + this.nombre + ", " + this.edad + ")"
    }

    class Builder(var nombre:String? = null, var edad:Int? = null, var vida:Int? = null,var bando:String? = null){
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun edad(edad:Int):Builder{
            this.edad = edad
            return this
        }
        fun vida(vida:Int):Builder{
            this.vida = vida
            return this
        }
        fun bando(bando:String):Builder{
            this.bando = bando
            return this
        }
        fun build():Persona{
            return Persona(nombre, edad,vida, bando)
        }
    }
}