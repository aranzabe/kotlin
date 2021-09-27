import Factoria.factoriaAldeano
import Factoria.factoriaCivilizacion
import kotlin.random.Random

fun asignacionAldeano(): Int {
    var cod = 0
    val alea = Random.nextInt(0, 100)
    if (alea < 40) {
        cod = 1
    } else if (alea < 60) {
        cod = 2
    }
    return cod
}

fun extraerRecursos(m: Mina, civ: Civilizacion): Int {
    var recursosExtraidos = 0
    for (i in 0 .. m.cuantosCurrantesTotal()-1) {
        if (m.getMineros(i) != null) {
            var al:Aldeano = m.getMineros(i)
            if (al.civ.nombre.equals(civ.nombre)) {
                if (m.hayMineral()) {
                    m.items = m.items - 1
                    when (m.tipo) {
                        "ORO" -> civ.almacenOro = civ.almacenOro + 1
                        "PIEDRA" -> civ.almacenPiedra = civ.almacenPiedra + 1
                    }
                    recursosExtraidos++
                }
            }
        }
    }
    return recursosExtraidos
}

fun wololo(m: Mina, esp: Civilizacion, biz: Civilizacion): Boolean {
    var conseguido = false
    while (!conseguido && m.cuantosMineros(esp) > 0) {
        val alea = Random.nextInt(0, m.cuantosCurrantesTotal())
        if (m.getMineros(alea) != null && m.getMineros(alea).civ.equals(esp)) {
            m.getMineros(alea).civ = biz
            conseguido = true
        }
    }
    return conseguido
}


fun main(args: Array<String>) {
    var t: Int
    var codAld: Int
    val esp = factoriaCivilizacion(Tipos.Español)
    val biz = factoriaCivilizacion(Tipos.Bizantino)
    var ald: Aldeano
    val mina:Mina = Mina()
    println(esp)
    println(biz)
    t = 0
    while (t < 60) {

        //Los aldeanos se unen a la mina
        if (t % 2 == 0) {
            codAld = asignacionAldeano()
            when (codAld) {
                1 -> {
                    ald = factoriaAldeano(200, esp)
                    esp.addAldeano(ald)
                    mina.addAldeano(ald)
                    println("Se ha añadido un aldeano del Imperio Español a la mina")
                }
                2 -> {
                    ald = factoriaAldeano(250, biz)
                    biz.addAldeano(ald)
                    mina.addAldeano(ald)
                    println("Se ha añadido un aldeano del Imperio Bizantino a la mina")
                }
            }
        }

        //Los aldeanos pican recursos
        println("El Imperio Español ha extraído " + extraerRecursos(mina, esp) + " items de " + mina.tipo)
        println("El Imperio Bizantino ha extraído " + extraerRecursos(mina, biz) + " items de " + mina.tipo)

        //Ataque del cura bizantino
        if (t % 5 == 0) {
            if (wololo(mina, esp, biz)) {
                println("Un cura bizantino ha convertido a uno de los mineros españoles")
            }
        }
        println("Estado de la partida:")
        println(esp)
        println(biz)
        Thread.sleep(1000)
        t++
    }
    println("Fin de la simulación.")
}