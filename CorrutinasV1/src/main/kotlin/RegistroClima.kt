package org.example
//Nos permite manipular estructuras de datos
//copy() -> crear un copia con las modificaciones que yo quiera
//toString() -> Muestra informacion de manera directa
//equals() -> permite comparar sus atributos de manera directa
data class RegistroClima(
    val ciudad: String,
    val temperatura: Double,
    val humedad: Int,
    val viento: Double
){
    val descripcion: String = when{
        temperatura < 0 -> "polar"
        temperatura < 10 -> "frio"
        temperatura < 20 -> "templado"
        temperatura < 30 -> "calido"
        else -> "caluroso"
    }
}
