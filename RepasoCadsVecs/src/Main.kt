import java.util.Arrays

fun compara(c:String, c2:String):Boolean{
    return c.equals(c2)
}

fun main(){
    var cad1 = "hola a todos y a todas"
    var cad2 = "todes"
    var cad3:String =""

    println(cad1.indexOf(cad2))

    /*print("Dame la primera cadena: ")
    cad1 = readLine().toString()
    print("Dame la segunda cadena: ")
    cad2 = readLine().toString()*/
    for (i in 0..cad2.length-1){
        cad3 += (cad2[i] + 1).toChar()
    }
    println("cesar: " + cad3)
    println(cad1.reversed().toUpperCase())
    var cont=0
    for (i in 0..cad1.length-1){
        when(cad1[i]){
            'a','e','i','o','u' -> cont++
        }
    }
    var palabras = cad1.split(" ")
    var may=""
    for (e in palabras){
       if (e.length > may.length){
           may = e
       }
    }
    println("La mayor es: $may")



    println("Cantidad de vocales en '$cad1' $cont")

    if (cad1.equals(cad2)){
        println("Son iguales")
    }
    else {
        println("No lo son")
    }

    if (cad1.length == cad2.length){
        println("Tienen el mismo tamaño")
    }
    else {
        println("No lo tienen")
    }

    //Print an Array using standard library Arrays (import java.util.Arrays)
    var vef:Array<Int> = Array<Int>(4,{x  -> x + 1});
    println("---------------")
    //Array(10, { (it + 1) * 2 }).forEach { print("$it ") }
    println(Arrays.toString(vef))

    var vec = Array<Int>(4,{i -> i})
    print("Antes de barajar: ")
    for(i in 0..vec.size-1){
        print(vec[i].toString() + " ")
    }
    println()
    vec.shuffle()
    print("Después: ")
    for(i in 0..vec.size-1){
        print(vec[i].toString() + " ")
    }
    println()
    var v3 = vec.reversed()
    println(v3.toString())
    var vec4 = vec.sliceArray(1..2)
    for(i in 0..vec4.size-1){
        println(vec4[i].toString() + " ")
    }

    //Print a Multi-dimenstional Array.
    val matriz = arrayOf(intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6, 7))
    matriz[1][0]=108;
    for(fila in matriz){
        for(i in 0..fila.size-1){
            print(fila[i])
            print(" ")
        }
        println()
    }
    println(Arrays.deepToString(matriz))
}