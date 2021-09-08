/*
Los objects de Kotlin son otro de los elementos del lenguaje al que no estamos acostumbrados los desarrolladores en Android, porque no hay nada parecido en Java.
En realidad un object no es más que un tipo de datos con una única implementación. Por lo que si queremos sacarle algún parecido, éste sería el patrón Singleton de Java.
https://devexperto.com/object-kotlin-singleton/
 */
object UserFactory {
    fun getUser(userType: UserType, name: String, surname: String): User {
        return when (userType) {
            UserType.Normal -> Normal(name = name, surname = surname)
            UserType.Premium -> Premium(name = name, surname = surname)
        }
    }

}