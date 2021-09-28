fun main(){
    var p:Persona = FactoriaPersonas.generarPersonaAzar()
    var p2 : Persona = FactoriaPersonas.generarPersonajesDAW("Jorge",30)
    var p3 : Persona = FactoriaPersonas.generarPersonaDAM()
    println(p)
    println(p2)
    println(p3)

  /*  var p4:Persona = Persona.Builder().nombre("Cristian").bando("DAM2").build()
    var p5:Persona = Persona.Builder().nombre("Antonio").edad(12).build()*/
}