package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {
    @Test
    void testValidSpecialtyCreation() {
        Especialidad especialidad = new Especialidad("ESP01", "Cardiología");

        assertEquals("ESP01", especialidad.getCodigo());
        assertEquals("Cardiología", especialidad.getNombre());
    }

    @Test
    void testRequiredNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Especialidad("ESP01", null);
        });
    }
}