package pe.saludpublica.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    @Test
    void testValidDoctorCreation() {
        Doctor doctor = new Doctor("73123456", "Ana", "Lopez", "CMP12345", "Cardiologia");

        assertEquals("73123456", doctor.getDocumento());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("Ana", doctor.getNombres());
        assertEquals("Lopez", doctor.getApellidos());
        assertEquals("Cardiologia", doctor.getEspecialidad());
    }

    @Test
    void testRequiredDocumentValidation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor(null, "Ana", "Lopez", "CMP12345", "Cardiologia");
        });
    }

    @Test
    void testRequiredLicenseValidation() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("73123456", "Ana", "Lopez", null, "Cardiologia");
        });
    }
}