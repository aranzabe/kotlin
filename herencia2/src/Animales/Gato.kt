package Animales

import Animales.Animal

class Gato: Animal {
    var lealtadGatuna:Float = 0.toFloat()

    /*
    Usando constructores secundarios.
     */
    constructor(nombre: String, edad:Int, lealtadGatuna:Float) : super(nombre, edad){
        this.lealtadGatuna = lealtadGatuna
    }

    constructor(nombre: String, edad:Int, raza:String, lealtad:Float) : super(nombre, edad, raza){
        this.lealtadGatuna = lealtad
    }


    //Esta función es exclusica del gato.
    fun toserBolaPelo():String{
        return "El gato " + this.nombre + " tose una bola de pelo."
    }

    override fun hacerRuido(): String {
        return "El gato " + this.nombre + " hace MIAU."
    }

    override fun hacerCaso(): String {
        var lohace:String = "no hace caso"
        if (this.lealtadGatuna >= 10){
            lohace = "haciendo caso"
        }
        return "El gato " + this.nombre + " " + lohace
    }

    override fun toString(): String {
        return "Animales.Gato:{" + super.toString() + " ,lealtad gatuna: " + this.lealtadGatuna + "}"
    }

}
