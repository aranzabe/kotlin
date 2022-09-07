fun rellenar(m:Array<Array<Int>>){
    var cont = 0
    for(fila in m){
        for(i in 0..fila.size-1){
            fila[i] = cont
            cont++
        }
    }
}

fun mostrar(m:Array<Array<Int>>){
    for(fila in m){
        for(i in 0..fila.size-1){
            print(fila[i])
            print(" ")
        }
        println()
    }
}


fun rellenarVector(v:Array<String>, cad:String){
    for (i in 0 until v.size){
        v[i] = cad
    }
}

fun mostrarVector(v: Array<String>){
    v.forEach { print("${it} ") }
    println()
}