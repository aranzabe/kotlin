/*
Las funciones declaradas aquí son abstractas, obligamos a aquellas clases que las implementen a tener esos métodos definidos.
Las interfaces también pueden tener datos.
 */
interface MiInterfaz {
    fun hacerCaso():String
    //Las interfaces pueden tener cuerpo, que será el que por defecto tengan las clases que lo implementen a menos que esas clases lo sobreescriban.
    fun hacerRuido():String{
        return ""
    }
    /*
    Pueden tener un cuerpo por defecto, opcional.
     */
    val valor:Int
}