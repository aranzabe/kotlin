fun main(){
    //var p = Personaje("Yoda",727)
    //println(p)
    //println(p.hablar())
    var al:ArrayList<Personaje> = ArrayList<Personaje>()

    var ob = Jedi("Obiguan",34,90)
    //println(ob)
    var s = Sith("Vader",120,90)

    //println(ob.hablar())
    //println(s)
    //println(s.hablar())
    var n = Nadie("No os aburrais mucho")
    println(n)
    al.add(ob)
    al.add(s)
    //al.add(n)
    for (pers in al){
        if (pers is Jedi){
            println(pers.empalagar())
        }
        if (pers is Sith){
            println(pers.serMalotes())
        }
    }

    var unJedi = al.get(0) as Jedi //Casting duro
    println(unJedi.empalago)

    println("Valor de la variable estática desde personaje: ${Personaje.N}")
    println("Valor de la variable estática desde Sith: ${Sith.pe.N}")
    println("Variable estática propia de los Sith: ${Sith.ESTSITH}")
    Sith.pe.N = 9999
    println("Acceso a la variable estática común desde los Jedi: ${Jedi.pe.N}")
}