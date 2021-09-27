class Mina {
    var tipo:String = ""
    var items:Int = 0
    private var currantes:ArrayList<Aldeano> = ArrayList<Aldeano>(100)

    init {
        this.tipo = "ORO"
        this.items = 500
    }

    constructor(){

    }

    constructor(tipo:String, items:Int){
        this.tipo = tipo
        this.items = items
    }

    fun addAldeano(ald:Aldeano){
        this.currantes.add(ald)
    }

    /**
     * Cuantos mineros de una civilización concreta.
     */
    fun cuantosMineros(civ: Civilizacion): Int {
        var cont = 0
        for (i in 0 .. this.currantes.size-1) {
            if (this.currantes.get(i) != null) {
                if (civ.nombre == this.currantes.get(i).civ.nombre) {
                    cont++
                }
            }
        }
        return cont
    }

    /**
     * Cuantos currantes en total hay en la mina.
     */
    fun cuantosCurrantesTotal() = this.currantes.size

    fun hayMineral() = this.items > 0

    fun getMineros(i:Int):Aldeano{
        return this.currantes.get(i)
    }
}