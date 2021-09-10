import kotlin.random.Random

class Tablero {
    var tab:Array<Int> = Array(10,{0})
    var moscas:Int = 1

    constructor(){

    }

    constructor(tam:Int, moscas:Int){
        this.tab = Array(tam, {0})
        this.moscas = moscas
    }


    fun iniciarTablero(){
        for(i in 0..this.tab.size - 1){
            this.tab[i] = 0
        }
    }

    fun colocarTablero(){
        var moscasColocadas = this.moscas
        var pos:Int

        while(moscasColocadas > 0) {
            pos = Random.nextInt(0, this.tab.size)
            if (this.tab[pos] == 0){
                this.tab[pos] = 1
                moscasColocadas--
            }
        }
    }

    /**
     * Esta función devuelve 2 si no se ha acertado a una mosca y tampoco hay ninguna adyacente.
     * Devuelve 1 si no se ha acertado pero casi se golpea a una mosca adyacente.
     * Y 0 si se caza a una mosca.
     */
    fun darManotazo(pos:Int):Int{
        var qhp:Int = 2
        if (this.tab[pos]==1){
            qhp =  0
            this.tab[pos] = 0
            this.moscas--
        }
        else {
            if (pos - 1 >= 0){
                if (this.tab[pos - 1]==1){
                    qhp = 1
                }
            }
            if (pos + 1 < this.tab.size){
                if (this.tab[pos + 1]==1){
                    qhp = 1
                }
            }
        }
        return qhp
    }

    fun tamTablero():Int = this.tab.size

    fun todasCazadas():Boolean = this.moscas == 0

    override fun toString(): String {
        return tab.contentToString() + " moscas: " + this.moscas
    }
}