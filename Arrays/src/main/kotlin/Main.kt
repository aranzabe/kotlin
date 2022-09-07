fun main(args: Array<String>) {
    var v = IntArray(7) {4}
    for (i in 0..v.size-1){
        println(v[i])
    }

    val FIL = 4
    val COL = 3

    //var m = Array(6) {Array(5) {0} }
    var m = Array(FIL) {i -> Array(COL) {j -> i+j} }
    for (i in 0..m.size - 1){
        for (j in 0..m[i].size - 1){
            print("${m[i][j]}  ")
        }
        println()
    }



}