fun myFunction(fname: String, age: Int, vec: Array<String>) {
    println(fname + " is " + age)
    vec[0] = "C5"
}
fun cambiaMatriz(m:Array<Array<Int>>){
    var cont:Int = 0
    for (i in 0..m.size - 1) { //Recorremos fila a fila
        var fila = m[0]
        for (j in 0..fila.size - 1) {
            m[i][j] = cont + 100
            cont++
        }
    }
}

fun main() {
    var n2: Int = 5
    var num: Int = 2
    var sol: Float
    var cadena: String = "Hola"

    println(cadena.length)
    println(cadena[3])
    println(cadena.toUpperCase())

    sol = n2.toFloat() / num

    println("Hola a todos " + sol)

    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    var cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
    if ("Volvo" in cars) {
        println("Ok")
    } else {
        println("No encontrado")
    }

    for (nums in 5..15) {
        println(nums)
    }

    var nom: String = "Fer"
    var edad: Int = 47
    myFunction(nom, edad, cars)
    for (x in cars) {
        println(x)
    }

    var mes = 4
    when(mes){
        in 3..5 -> println("Primavera")
        in 6..8 -> println("Verano")
        in 9..11 -> println("Otoño")
        in 1..2 -> println("Invierno")
    }
    mes = 9
    var estacion = when(mes){
        in 3..5 -> "Primavera"
        in 6..8 -> "Verano"
        in 9..11 -> "Otoño"
        in 1..2 -> "Invierno"
        else -> "Nada"
    }
    println("$estacion")

    //Usando una función lambda (funciones anónimas). Si cambiamos el 1 por 0, 2, 3... O incluso el + por *, veremos la diferencia.
/*    var filas:Array<Int>  = Array(5, { i -> i + 1 })
    var cols:Array<Int> = Array(4, {j -> 0})*/
    val fila1: IntArray = intArrayOf(2, 4, 6)
    val fila2: IntArray = intArrayOf(1, 3, 5)

    val mat: Array<IntArray> = arrayOf(fila1, fila2)
    mat[0][0] = 900
    for (fila in mat){ //Recorremos fila a fila
        for(el in fila) {
            print(el)
        }
        println()
    }
    println("----------------")
    //Otra forma
    var matriz = Array(2, {i -> Array(3, {j -> 0})})
    for (fila in matriz){ //Recorremos fila a fila
        for(el in fila) {
            print(el)
            print(" ")
        }
        println()
    }

    /*var cont:Int = 0
    for (i in 0..m.size - 1) { //Recorremos fila a fila
        var fila = m[0]
        for (j in 0..fila.size - 1) {
            m[i][j] = cont + 100
            cont++
        }
    }*/
    cambiaMatriz(matriz)
    println("----------------")
    for (fila in matriz){ //Recorremos fila a fila
        for(el in fila) {
            print(el)
            print(" ")
        }
        println()
    }
}