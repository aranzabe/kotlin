fun rellenar(m:ArrayList<ArrayList<Int>>){
    var cont = 0
    for(fila in m){
        for(i in 0..fila.size-1){
            fila[i] = cont
            cont++
        }
    }
}

fun mostrar(m:ArrayList<ArrayList<Int>>){
    for(fila in m){
        for(i in 0..fila.size-1){
            print(fila[i])
            print(" ")
        }
        println()
    }
}
