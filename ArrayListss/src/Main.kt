fun main(){
    var lista = ArrayList<Int>(4)
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
    var fila1 = Array(3, {j -> 0}).toCollection(ArrayList()) //Recuerda repasar la inicialización de los arrays con funciones lambdas anónimas
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

    //MIRAR recorridos de listas.

    rellenar(matriz)
    mostrar(matriz)

    var palabra:String
    palabra = readLine().toString()
    println(palabra)
    var entero:Int
    entero = readLine().toString().toInt()
    println(entero)

}