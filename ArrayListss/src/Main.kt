fun main(){

    //Listas inmutables: listOf, setOf
    //Listas mutables: mutableListOf, arrayListOf, mutableSetOf
    var laquesa = setOf(1,2,2,2,4,5,6,6)
    print(laquesa)
    var AL = Array(3, {j -> j + 2}).toCollection(ArrayList())
    //Pedir por teclado
    /*var palabra:String
    palabra = readLine().toString()
    println(palabra)
    var entero:Int
    entero = readLine().toString().toInt()
    println(entero)*/

    //******************** Listas **************************
    var lista = ArrayList<Int>(4)
    var lios = arrayListOf<Int>(2,4,6)

    //La capacidad inicial no determina una capacidad final.
    for (i in 1..10) {
        lista.add(i)
    }

    lista[3] = 444
    lista.set(7, 888)
    for(x in lista){
        print("$x ")
        print(" ")
    }
    println()

    //var matriz: MutableList<MutableList<Int>> = ArrayList() // alternatively: = mutableListOf() seqList.add(mutableListOf<Int>(1, 2, 3))
    var matriz:ArrayList<ArrayList<Int>> = ArrayList()
    //var fila1:ArrayList<Int> = ArrayList(3)
    //var fila1 = arrayListOf<Int>(3)
    var fila1 = Array(3, {j -> j + 1}).toCollection(ArrayList()) //Recuerda repasar la inicialización de los arrays con funciones lambdas anónimas
                                                                 //para definir el arraylist en función de un array normal.
    matriz.add(fila1)
    //var fila2:ArrayList<Int> = ArrayList(3)
    var fila2 = Array(3, {j -> 0}).toCollection(ArrayList())
    matriz.add(fila2)
    var fila3:ArrayList<Int> = ArrayList(3)
    for(i in 1..3){ //Esta es la forma larga de inicar cada fila antes de añadirla a la matriz.
        fila3.add(0)
    }
    matriz.add(fila3)
    rellenar(matriz)
    mostrar(matriz)


    //******************** Conjuntos ***********************
    var conj = setOf<Int>(1,2,3,3,4,5,6,7,8,9,9,0,12,2) //Veremos que solo se almacenan elementos distintos.
    println(conj)
    /*println("Elementos del conjunto.")
    for (e in conj){
        println(e)
    }*/

    //******************* Mapas/Tablas Hash ***********************
    var mapaNumeros = mapOf<String, Int>("cod1" to 1, "cod2" to 2, "cod3" to 3, "cod4" to 4) //Mapa inmutable
    println(mapaNumeros)

    var mapaNumeros2 = mutableMapOf<String, Int>("cod1" to 1, "cod2" to 2, "cod3" to 3, "cod4" to 4) //Mapa inmutable
    mapaNumeros2["cod5"] = 5
    mapaNumeros2.put("cod6",5)
    println(mapaNumeros2)
    println("El elemento dos es: " + mapaNumeros2["cod2"])
    println("El elemento tres es ${mapaNumeros2["cod3"]}")
    mapaNumeros2.remove("cod6")
    println(mapaNumeros2)
}