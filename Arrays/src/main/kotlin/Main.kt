fun main(args: Array<String>) {

    //******************************************************************************
    //******************************** Vectores ************************************
    //******************************************************************************
    //var v = IntArray(7) {4}
    var v = IntArray(7) {(Math.random()*2).toInt()}
    println("Recorrido clásico")
    for (i in 0..v.size-1){
        println(v[i])
    }

    println("Usando la función lambda para recorrer un vector")
    v.forEach { elemento ->
        print("${elemento}  ")
        println("------")
    }

    println("Usando la función lambda para recorrer un vector con parámetro por defecto")
    v.forEach {
        print("${it}  ")
        println("****")
    }


    //******************************************************************************

    var vecString : Array<String> = Array(4){""}
    rellenarVector(vecString, "DAM2")
    mostrarVector(vecString)


    //******************************************************************************
    //******************************** Matrices ************************************
    //******************************************************************************

    val FIL = 4
    val COL = 3

    //var m = Array(6) {Array(5) {0} }
    val cont = 0
    //var m = Array(FIL) {i -> Array(COL) {j -> i+j} }
    var m = Array(FIL) {i -> Array(COL) {j -> cont+1}}


    for (i in 0..m.size - 1){
        for (j in 0..m[i].size - 1){
            print("${m[i][j]}  ")
        }
        println()
    }


    //******************************************************************************

    var m2 = Array(3) { Array(2) {"Nada"}  }
    m2[0][1] = "DAM2"
    m2[1][0] = "CIFP"
    for (i in 0 until m2.size){
        for (j in 0 until m2[i].size){
            print("${m2[i][j]}  ")
        }
        println()
    }

    println("Usando métodos")

    rellenar(m)
    mostrar(m)

    //******************************************************************************
    //*************************** ArrayList/MutableList ****************************
    //******************************************************************************

    var vPrueba = ArrayList<Int>(2)
    vPrueba.add(200) //Si comento esto inicialmente veremos que da error. El ArrayList está iniciado con una capacidad de 2 pero no tiene valores.
    vPrueba[0] = 100
    vPrueba.add(200)
    //La capacidad inicial no determina el tope. Aunque está definido como 2 se le añaden más.
    vPrueba.add(300)
    vPrueba.add(400)
    println(vPrueba)
    vPrueba.removeAt(2)
    println(vPrueba)

    //Otra forma.
    var lios = arrayListOf<Int>(2,4,6,4,5,6,7,4)
    for(x in lios){
        print("${x} ")
    }
    println()
    lios.add(24)
    lios[0] = 12
    println(lios)

    val cuant4s = lios.count { it == 4 }
    println("Cantidad de elementos con el valor 4: $cuant4s")
    lios.removeAll { it == 4 }
    println("Lista luego de borrar los elementos con el valor 4")
    println(lios)

    //Más sobre ArrayList. Usándolo para almacenar cualquier valor (Any equivale, más o menos, a Object de Java; en este caso).
    val alPolimorfismo: ArrayList<Any> = ArrayList<Any>(3)
    alPolimorfismo.add("Hola")
    alPolimorfismo.add(2)
    alPolimorfismo.add(3f)
    println(alPolimorfismo)


    //Mutables, equivale a ArrayList.
    val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)
    println("Lista de edades")
    println(edades)
    val cant = edades.count { it >= 18 }
    println(cant)
    edades.removeAll { it == 12 }
    println("Lista de edades después de borrar las que tienen 12 años")
    println(edades)
    edades.clear()
    println("Lista de edades luego de borrar la lista en forma completa")
    println(edades)


    //******************************************************************************
    //******************** Listas (ArrayLists) inmutables **************************
    //******************************************************************************

    var lista1: List<String> = listOf("lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo")
    println("Imprimir la lista completa")
    println(lista1)
    println("Imprimir el primer elemento de la lista")
    println(lista1[0])
    println("Imprimir el primer elemento de la lista")
    println(lista1.first())
    println("Imprimir el último elemento de la lista")
    println(lista1.last())
    println("Imprimir el último elemento de la lista")
    println(lista1[lista1.size-1])
    println("Imprimir la cantidad de elementos de la lista")
    println(lista1.size)
    println("Recorrer la lista completa con un for")
    for(elemento in lista1)
        print("$elemento ")
    println()
    println("Imprimir el elemento y su posición")
    for(posicion in lista1.indices)
        print("[$posicion]${lista1[posicion]} ")
    //lista1[0] = "domingo"  --> Esto no se puede hacer.
    //lista1.add("enero") --> Tampoco esto.




}