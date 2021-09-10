import kotlin.random.Random

fun pedirPosicion(t:Tablero):Int {
    var pos:Int
    do {
        pos = readLine().toString().toInt()
        if (pos <0 || pos >= t.tamTablero()){
            println("Posición elegida incorrecta")
        }
    }while(pos < 0 || pos >= t.tamTablero())
    return pos
}

fun main(){
    var t = Tablero(10,3)
    var pos:Int
    var qhp:Int
    var intentos:Int = 10

    println(t)

    t.colocarTablero()
    println(t)
    while(!t.todasCazadas() && intentos > 0){
        print("Posición donde golpear: ")
        pos = pedirPosicion(t)
        intentos--
        qhp = t.darManotazo(pos)
        if (qhp == 0){
            println("Has acertado")
        }
        if (qhp == 1){
            println("Casi le das a una. Se han asustado y han cambiado de posición.")
            t.iniciarTablero()
            t.colocarTablero()
        }
        if (qhp == 2){
            println("Ni te has acercado")
        }
        println(t)
    }
    if (t.todasCazadas()){
        println("Enhorabuena!!!!")
    }
    else {
        println("Este es el tablero con las moscas: $t")
    }
}