/*
Para probar esta clase, comentamos de Animal2 los métodos abstractos: veremos como
se me exige implementar los métodos de la interfaz.
 */
class Pato:Animal2,MiInterfaz {

    constructor(nombre: String) : super(nombre)
    constructor(nombre: String, edad:Int) : super(nombre, edad)

    override fun hacerCaso(): String {
        return "El pato hace caso"
    }

    override fun hacerRuido(): String {
        return "El pato hace CUA"
    }

}