package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class CitaMedicaTest {
    @Test
    void testValidAppointmentCreation() {
        Paciente paciente = new Paciente("73123456", "Juan", "Perez", "987654321", "juan@test.com");
        Doctor doctor = new Doctor("12345678", "Ana", "Lopez", "CMP12345", "Cardiología");
        LocalDateTime fechaHora = LocalDateTime.of(2026, 12, 1, 10, 30);

        CitaMedica cita = new CitaMedica(paciente, doctor, fechaHora);

        assertEquals(paciente, cita.getPaciente());
        assertEquals(doctor, cita.getDoctor());
        assertEquals(fechaHora, cita.getFechaHora());
    }
}