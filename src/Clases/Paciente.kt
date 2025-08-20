package Clases

class Paciente(
    nombre: String,
    numeroIdentificacion: Int,
    genero: String,
    correoElectronico: String,
    var telefono: String,
    var direccion: Direccion
) : Persona(nombre, numeroIdentificacion, genero, correoElectronico)
