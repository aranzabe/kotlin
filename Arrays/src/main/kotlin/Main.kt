fun main(args: Array<String>) {

    //******************************************************************************
    //******************************** Vectores ************************************
    //******************************************************************************
    println("***********************************************************************");
    println("**************************  Vectores **********************************");
    println("***********************************************************************");
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

    v.forEach { elemento ->
        print("${elemento}  ")
        println("****")
    }

    //******************************************************************************

    var vecString : Array<String> = Array(4){""}
    rellenarVector(vecString, "DAM2")
    mostrarVector(vecString)


    //******************************************************************************
    //******************************** Matrices ************************************
    //******************************************************************************
    println("******************************************************************************");
    println("**************************  Matrices *****************************************");
    println("******************************************************************************");
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
    println("*********************************************************************************************");
    println("**************************  ArrayList/MutableList  ******************************************");
    println("*********************************************************************************************");

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

    println("------------------------------")
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

    println("------------------------------")
    //Más sobre ArrayList. Usándolo para almacenar cualquier valor (Any equivale, más o menos, a Object de Java; en este caso).
    val alPolimorfismo: ArrayList<Any> = ArrayList<Any>(3)
    alPolimorfismo.add("Hola")
    alPolimorfismo.add(2)
    alPolimorfismo.add(3f)
    println(alPolimorfismo)


    println("------------------------------")
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
    println("************************************************************************************************");
    println("************************  Listas (ArrayLists) inmutables ***************************************");
    println("***********************************************************************************************");

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
    println()

    //******************************************************************************
    //********************************* Maps ***************************************
    //******************************************************************************
    println("****************************************************************");
    println("************************  Maps *********************************");
    println("****************************************************************");

    val paises: Map<String, Int> = mapOf( Pair("argentina", 40000000),
        Pair("españa", 46000000),
        Pair("uruguay", 3400000))
    println("Listado completo del Map")
    println(paises)
    for ((clave, valor) in paises)
        println("Para la clave $clave tenemos almacenado $valor")
    println("La cantidad de elementos del mapa es ${paises.size}")
    val cantHabitantes1: Int? = paises["argentina"]
    if (cantHabitantes1 != null)
        println("La cantidad de habitantes de argentina es $cantHabitantes1")
    val cantHabitantes2: Int? = paises["brasil"]
    if (cantHabitantes2 != null)
        println("La cantidad de habitantes de brasil es $cantHabitantes2")
    else
        println("brasil no se encuentra cargado en el Map")
    var suma = 0
    paises.forEach { suma += it.value }
    println("Cantidad total de habitantes de todos los paises es $suma")


    //******************************************************************************
    //***************************** MutableMaps ************************************
    //******************************************************************************
    println("***************************************************************************");
    println("************************  MutableMaps *************************************");
    println("***************************************************************************");
    val items = mutableMapOf("Cajas" to 12, "Libros" to 18, "Mesas" to 13)
    items.put("Monitores",36)
    println("Entradas: " + items.entries)
    println("Clavess:" + items.keys)
    println("Valores:" + items.values)
    items.remove("Cajas")
    println("Entradas: " + items.entries)
    for (key in items.keys) {
        println("Key = ${key}, Value = ${items[key]}")
    }
    //Obtener valores del mapa.
    println(items["Cajas"])
    //method 2
    println(items.getValue("Mesas"))
    //method 3
    println(items.getOrDefault("Libros", 0))
    // method  4
    val team = items.getOrElse("Libros" ,{ 0 })
    println(team)



    //******************************************************************************
    //*************************** Set(Mutablesets) *********************************
    //******************************************************************************
    println("***************************************************************************");
    println("**********************  Set(Mutablesets) **********************************");
    println("***************************************************************************");
    val numbersSet = setOf(1, 3, 5, 7, 9, 11)
    println(numbersSet.contains(2)) // false
    println(3 in numbersSet) // true

    val group1 = setOf(1, 3, 5, 7)
    val group2 = setOf(2, 4, 6, 8)
    println("U = ${group1 union group2}")

    // Intersección
    println("∩= ${setOf(0, 1, 3, 4)
            intersect
            setOf(2, 3, 4, 5)}")

    println("------------------------------")

    val conjunto1: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)
    println("Listado completo del conjunto")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    println("Cantidad de elementos del conjunto: ${conjunto1.size}")
    conjunto1.add(500)
    println("Listado completo del conjunto luego de agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    conjunto1.add(500)
    println("Listado completo del conjunto luego de volver a agregar el 500")
    for(elemento in conjunto1)
        print("$elemento ")
    println()
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    println("Eliminamos el elemento 500 del conjunto")
    conjunto1.remove(500)
    if (500 in conjunto1)
        println("El 500 está almacenado en el conjunto")
    else
        println("El 500 no está almacenado en el conjunto")
    val c = conjunto1.count { it >= 10 }
    println("Cantidad de elementos con valores superiores o igual a 10: $c")






}