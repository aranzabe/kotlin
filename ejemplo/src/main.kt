fun main(){
    var a = 12

    if (a > 0){
        println("Mayor que 0")
    }
    else {
        println("Menor")
    }

    for (i in 1..a)
    {
        print("$i ")
    }
    println()

    var cont : Int = 1
    while(cont <= 3){
        println(cont)
        cont++
    }

    print("Dame una palabra: ")
    val palabra = readLine()
    println("Palabra leída: ${palabra}")

    var numFinal = 2
    try {
         numFinal = readLine()!!.toInt()
    }
    catch (e:Exception){
        println("Error: '${e.message}'")
    }

    cont = 1
    do{
        println(cont)
        cont++
    }while(cont <= numFinal)

    val opcion = 21
    val resultado = when(opcion){
        0,2 -> "Pares"
        1,3 -> "Impares"
        else -> "Indeterminado"
    }

    println(resultado)


}