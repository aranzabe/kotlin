fun main(){
    println("Elementos construidos: " + Persona.getCount())
    var p = Persona("Fernando", 47)
    println("Elementos construidos: " + Persona.getCount())
    var p2 = Persona()
    println("Elementos construidos: " + Persona.getCount())
    var p3 = Persona("Urraca")
    println("Elementos construidos: " + Persona.getCount())
    var p4 = Persona2()
    var p5 = Persona2("Lisa Simpson")

    /*
    No necesitamos ninguna palabra reservada como new o algo así. Después de tener un objeto de la clase podemos llamar a los métodos de la misma.
     */

    p.edad = 9 //Si están definidos los get/set se llama automáticamente a ellos.
    p.nombre = "Fernando"

    println(p)
    println(p2)
    println(p3)
    println(p.hablame())

    println(p4)
    println(p5)

    var p6 = PersonaBuilder.Builder().
        nombre("DAM2").
        build();
    println(p6)

    var p7 = PersonaBuilder.Builder().
        nombre("DAM2 Persona 7").
        edad(30).
        build();
    println(p7)
    println("Personas creadas con buider ${PersonaBuilder.getCount()}")
}