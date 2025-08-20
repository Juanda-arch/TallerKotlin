package Clases

class Medico(
    nombre: String,
    numeroIdentificacion: Int,
    genero: String,
    correoElectronico: String,
    var licencia: String,
    var especialidad: String,
    var anioIngreso: Int,
    var salario: Double
) : Persona(nombre, numeroIdentificacion, genero, correoElectronico) {

    val pacientesAsignados: MutableList<Paciente> = mutableListOf()
}
