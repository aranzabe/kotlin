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
}