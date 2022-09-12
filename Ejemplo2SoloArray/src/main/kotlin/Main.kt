fun main(args: Array<String>) {
    var v: Array<Int> = Array<Int>(4) { i -> i + 1 }   //int [] v = new v[4];
    var m: Array<String> = Array(3) { "" }    //String m[] = new String[4];

    var v2: IntArray = IntArray(2) { 18 }
    var vf2: FloatArray = FloatArray(3) { i -> i + 1f }

    m[0] = "Una"; m[1] = "Dos"

    for (i in v2.indices) {
        println("v[${i}]=${v2[i]}")
    }

    for (elemento in vf2) {
        println("Elemento ${elemento} ")
    }

    for (i in 0 until m.size) {
        if (!m[i].isEmpty()) {
            println(m[i])
        } else {
            println("Posición vacía")
        }
    }

    for (i in 0..v.size - 1) {
        println("Valores $i = ${v[i]}")
    }

    println("---------------------")
    rellenaVector(v, 108)
    mostrarVector(v)


    var matriz = Array(4) { Array<String>(3) { "" } }
    var ma2 = Array(3) { Array<Int>(3) { 0 } }
    var m3 = Array(2) { Array<Float>(4) { 0f } }
    var m4 = Array(5) { Array<Boolean>(3) { true } }

    m4[0][2] = false
    for (i in m4.indices) {
        for (j in m4[i].indices) {
            print("${m4[i][j]}  ")
        }
        println()
    }

    rellenarMatriz(ma2,99)
    mostrarMatriz(ma2)
}