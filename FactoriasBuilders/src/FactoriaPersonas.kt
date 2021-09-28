import kotlin.random.Random

object FactoriaPersonas {
    fun generarPersonajesDAW(nombre:String, edad:Int):Persona{
        var vida = Random.nextInt(1,100)
        //var p:Persona = Persona(nombre, edad, vida, "DAW")
        var p:Persona = Persona.Builder().nombre(nombre).edad(edad).vida(vida).bando("DAW").build()
        return p
    }

    fun generarPersonaAzar():Persona {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Alvaro"
            2 -> "Elena"
            3 -> "Mario"
            else -> "Sin nombre"
        }
        var vida = Random.nextInt(1,100)
        var edadAzar:Int = Random.nextInt(1,200)
        //var p:Persona = Persona(nombre, edadAzar, vida, "DAW")
        var p:Persona = Persona.Builder().nombre(nombre).edad(edadAzar).bando("DAW").vida(vida).build()
        return p
    }

    fun generarPersonaDAM():Persona {
        var nomAzar:Int = Random.nextInt(1,3)
        var nombre:String = when(nomAzar){
            1 -> "Alonso"
            2 -> "Antonio"
            3 -> "Daniel"
            else -> "Sin nombre"
        }
        var vida = Random.nextInt(1,100)
        var edadAzar:Int = Random.nextInt(1,200)
        //var p:Persona = Persona(nombre, edadAzar, vida, "DAM")
        var p:Persona = Persona.Builder().nombre(nombre).edad(edadAzar).vida(vida).bando("DAM").build()
        return p
    }
}