fun main(){
    var a = Animal("Rantamplán",12)
    println(a)
    a.raza = "Pástor alemán"
    println(a)

    var p = Perro("Milu",127, "Chucho", 90)
    println(p)
    println(p.comer())
    println(p.hacerCaso())
    println(p.hacerRuido())
    println(p.sacarPaseo())

    var g = Gato("Fliqui",18,"Siamés",4.toFloat())
    println(g)
    println(g.toserBolaPelo())

    var pa = Pato("Cuaqui")
    println(pa.hacerCaso())
    println("Pato haciendo ruido: " + pa.hacerRuido())

    var miZoo = ArrayList<Animal>()
    miZoo.add(p)
    miZoo.add(g)
    //miZoo.add(pa)//Si descomentas esto dará un error porque la clase del ArrayList es Animal y Pato hereda de Animal2.
    for(ob in miZoo) {
        if (ob is Gato){
            println("Se ha encontrador un gato: " + ob)
            println(ob.toserBolaPelo())
        }
        if (ob is Perro){
            println("Se ha encontrado un perro: " + ob)
            println(ob.sacarPaseo())
        }
        /*
         //Si descomentas esto dará un error porque la clase del ArrayList es Animal y Pato hereda de Animal2.
         if (ob is Pato){
            println("Se ha encontrado un perro: " + ob)
            ob.sacarPaseo()
        }*/
    }



}