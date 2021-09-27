/*
Las funciones declaradas aquí son abstractas, obligamos a aquellas clases que las implementen a tener esos métodos definidos.
Las interfaces también pueden tener datos.
 */
interface MiInterfaz {
    fun hacerCaso():String
    fun hacerRuido():String{
        return ""
    }
    /*
    Pueden tener un cuerpo por defecto, opcional.
     */
    val valor:Int
}