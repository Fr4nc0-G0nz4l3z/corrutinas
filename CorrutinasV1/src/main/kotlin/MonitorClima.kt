package org.example

//Genera la logica de negocios
//funcion que consulte los datos del clima
// que maneje las excepciones
//genere un reporte final
//suspend -> permite pausar y reanudar su ejecucion
suspend fun consultaClima(ciudad: String): RegistroClima{
    if(ciudad.isBlank())
        throw IllegalArgumentException("El nombre de la ciudad no puede estar vacio")
    if(ciudad.length < 3)
        throw IllegalArgumentException("Nombre demaciado corto: $ciudad")
}