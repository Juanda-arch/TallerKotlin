import Clases.*

fun main() {
    val direccionHospital = Direccion("Calle 10", "20", "Centro", "Armenia", 630001)
    val hospital = Hospital("Hospital Quindío", direccionHospital, "123456789")

    val medico1 = Medico("Ana López", 101, "Femenino", "ana@hospital.com", "LIC123", "Cardiología", 2010, 5000000.0)
    val medico2 = Medico("Carlos Pérez", 102, "Masculino", "carlos@hospital.com", "LIC456", "Neurología", 2005, 6000000.0)

    val paciente1 = Paciente("María Gómez", 201, "Femenino", "maria@gmail.com", "3001234567", Direccion("Calle 5", "15", "Norte", "Armenia", 630002))
    val paciente2 = Paciente("Juan Torres", 202, "Masculino", "juan@gmail.com", "3107654321", Direccion("Carrera 8", "22", "Sur", "Cali", 760001))

    hospital.agregarMedico(medico1)
    hospital.agregarMedico(medico2)
    hospital.agregarPaciente(paciente1)
    hospital.agregarPaciente(paciente2)

    medico1.pacientesAsignados.add(paciente1)
    medico2.pacientesAsignados.add(paciente2)

    println("Total salarios: ${hospital.totalSalarios()}")
    println("Salarios por especialidad: ${hospital.totalSalariosPorEspecialidad()}")
    println("Pacientes por género: ${hospital.cantidadPacientesPorGenero()}")
    println("Médicos por especialidad: ${hospital.cantidadMedicosPorEspecialidad()}")
    println("Médico más antiguo: ${hospital.medicoMasAntiguo()?.nombre} - Especialidad: ${hospital.medicoMasAntiguo()?.especialidad}")
}
