package org.example

//Las clases selladas permiten al compilador conocer todos los subtipos posibles
//obligar a declararlos en el when para cubrirlos todos sin usar el else
sealed class EstadoConsulta {
    object Consultando: EstadoConsulta() //singletton
    data class Exitos(val registro: RegistroClima): EstadoConsulta()
    data class Error(val mensaje: String): EstadoConsulta()
}