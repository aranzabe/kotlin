/*
El operador ? permite que esas variables alamecenen un valor null.
 */
class Account(var name:String?, var tipo:String){
    var otroAtributo:Int = 0
        //Los get/set se pueden implementar, pero solo será necesario si queremos personalizar alguno.
        get() = field
        set(valor){
            field = valor + 100
        }

    constructor(name:String):this(name,""){
        this.otroAtributo = 100
    }
    override fun toString(): String {
        return "Cuenta: " + this.name + ", " + this.tipo + ", " + this.otroAtributo;
    }
}

fun sencilla(n:Int):Int = n + 9

/*
Son clases que se componen de atributos, sin más. Crea automáticamente el toString.
 */
data class Estudiante(var nombre:String, var nota:Double) {
    fun calculaMedia():Int{
        return 9
    }
}

/*
Es para definir un tipo de clase parecida a las Singleton de Java. Es una clase estática que no se puede instanciar.
 */
object Robot{
    var nombre:String = "R2D2"

    fun iniciar():String {
        return "El robot $nombre está iniciado"
    }
}

//*******************************************************************************************
fun main(){
    val account = Account(null, "type")

    /*
    El operador !! considera que todo lo que está a su izquierda no es nulo, por lo que, en este caso,
    se considera que name es una String no nula. Si el resultado de la expresión a la izquierda es nulo,
    tu app arroja una NullPointerException. Este operador es rápido y fácil, pero debe usarse con moderación,
    ya que puede volver a introducir instancias de NullPointerException en tu código.
     */
    try {
        val accountName = account.name!!.trim()
        println(accountName)
    } catch (e: Exception) {
        println("Ha ocurido el siguiente error: " + e.message)
    }
    val n:String? = null
    account.otroAtributo = 300
    println(n)
    println(account)

    println(sencilla(10))

    var est = Estudiante("Fer",1.toDouble())
    println("Estudiante: ${est.nombre} nota obtenida ${est.nota}")
    println(est)

    println(Robot.iniciar())
}