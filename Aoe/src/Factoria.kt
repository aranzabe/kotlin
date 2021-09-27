object Factoria {
    fun factoriaCivilizacion(cod:Tipos):Civilizacion{
        return when (cod) {
            Tipos.Bizantino -> Civilizacion("Imperio Bizantino", "Constantino II")
            Tipos.Español -> Civilizacion("Imperio Español", "Isabel I")
        }
    }

    fun factoriaAldeano(salud:Int, civ:Civilizacion):Aldeano{
        return Aldeano(salud, civ)
    }
}