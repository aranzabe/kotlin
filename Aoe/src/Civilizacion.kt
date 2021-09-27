class Civilizacion {
    var nombre:String = ""
    var monarca:String = ""
    var almacenOro:Int = 0
    var almacenPiedra:Int = 0
    private var poblacion:ArrayList<Aldeano> = ArrayList<Aldeano>(100)

    constructor(nombre:String, monarca:String){
        this.nombre = nombre
        this.monarca = monarca
    }

    override fun toString(): String {
        var cad:String = ""
        cad += this.nombre + ", gobernado con mano de hierro por " + this.monarca + ":\n"  + "   Almacén de oro: " +
                this.almacenOro  + "\n   Almacén de piedra: " + this.almacenPiedra + "\n   "   + "Aldeanos: " +
                this.poblacion.size
        return cad
    }

    fun addAldeano(ald:Aldeano){
        this.poblacion.add(ald)
    }

    fun extraerAldeano():Aldeano? {
        var al:Aldeano? = null
        if (this.poblacion.size > 0){
            al = this.poblacion.get(0)
            this.poblacion.removeAt(0)
        }
        return al
    }

}