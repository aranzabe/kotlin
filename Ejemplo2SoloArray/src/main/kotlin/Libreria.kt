fun rellenaVector(ve:Array<Int>){
    for(i in ve.indices){
        ve.set(i,i+1)
    }
}

fun rellenaVector(ve:Array<Int>, valor:Int){
    for(i in ve.indices){
        ve.set(i,valor)
    }
}

fun mostrarVector(ve: Array<Int>){
    for(i in ve.indices){
        println("v[${i}]=${ve[i]}")
    }
}

fun rellenarMatriz(m:Array<Array<Int>>){
    var cont = 0
    for(fila in m){
        for(i in 0..fila.size-1){
            fila[i] = cont
            cont++
        }
    }
}

fun rellenarMatriz(m:Array<Array<Int>>, valor:Int){
    var cont = 0
    for(fila in m){
        for(i in 0..fila.size-1){
            fila[i] = valor
        }
    }
}

fun mostrarMatriz(m:Array<Array<Int>>){
    for(fila in m){
        for(i in 0..fila.size-1){
            print(fila[i])
            print(" ")
        }
        println()
    }
}