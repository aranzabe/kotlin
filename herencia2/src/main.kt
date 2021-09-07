/*
Este ejemplo es igual que herencia, pero ahora las clases derivadas y base usan constructores primarios.
 */
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
}