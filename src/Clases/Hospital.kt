package Clases

class Hospital(
    var nombre: String,
    var direccion: Direccion,
    var nit: String
) {
    val medicos: MutableList<Medico> = mutableListOf()
    val pacientes: MutableList<Paciente> = mutableListOf()

    // ---------------- CRUD MÉDICOS ----------------
    fun agregarMedico(medico: Medico) = medicos.add(medico)

    fun eliminarMedico(id: Int) = medicos.removeIf { it.numeroIdentificacion == id }

    fun actualizarMedico(id: Int, nuevo: Medico) {
        val index = medicos.indexOfFirst { it.numeroIdentificacion == id }
        if (index != -1) medicos[index] = nuevo
    }

    fun obtenerMedico(id: Int): Medico? = medicos.find { it.numeroIdentificacion == id }

    // ---------------- CRUD PACIENTES ----------------
    fun agregarPaciente(paciente: Paciente) = pacientes.add(paciente)

    fun eliminarPaciente(id: Int) = pacientes.removeIf { it.numeroIdentificacion == id }

    fun actualizarPaciente(id: Int, nuevo: Paciente) {
        val index = pacientes.indexOfFirst { it.numeroIdentificacion == id }
        if (index != -1) pacientes[index] = nuevo
    }

    fun obtenerPaciente(id: Int): Paciente? = pacientes.find { it.numeroIdentificacion == id }

    // ---------------- Actividades ----------------
    fun totalSalarios(): String {
        val total = medicos.sumOf { it.salario }
        return "%,.2f".format(total) // separador de miles y 2 decimales
    }

    fun totalSalariosPorEspecialidad(): Map<String, Double> =
        medicos.groupBy { it.especialidad }
            .mapValues { entry -> entry.value.sumOf { it.salario } }

    fun cantidadPacientesPorGenero(): Map<String, Int> =
        pacientes.groupBy { it.genero }
            .mapValues { it.value.size }


    fun cantidadMedicosPorEspecialidad(): Map<String, Int> =
        medicos.groupBy { it.especialidad }
            .mapValues { it.value.size }

    fun medicoMasAntiguo(): Medico? =
        medicos.minByOrNull { it.anioIngreso }
}
