package ud3.examen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CocheCarrerasTest {
    private CocheCarreras coche;

    @BeforeEach
    public void setUp() {
        coche = new CocheCarreras("TestCar", 50, 5, 100);
    }

    @Test
    public void testConstructorValidParameters() {
        CocheCarreras coche = new CocheCarreras("ValidCar", 50, 5, 100);
        assertEquals("ValidCar", coche.getNombre());
        assertEquals(50, coche.getVelocidadMaxima());
        assertEquals(5, coche.getTurbosRestantes());
        assertEquals(100, coche.getAutonomiaRestante());
        assertEquals(0, coche.getDistanciaRecorrida());
    }


    // PRUEBAS CONSTRUCTORES
    // La velocidad máxima debe estar entre 1 y 100. Aquí se prueban los límites con una excepción
    // Estas pruebas fallan si se han corregido valores inválidos al implementar el constructor

    @SuppressWarnings("unused")
    @Test
    public void testConstructorInvalidVelocidadMaximaLow() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CocheCarreras("InvalidCar", 0, 5, 100);
        });
        // Si se comprueba que el mensaje de la excepción es el esperado
        //assertEquals("La Velocidad Máxima debe estar entre 1 y 100", exception.getMessage());
    }

    @SuppressWarnings("unused")
    @Test
    public void testConstructorInvalidVelocidadMaximaHigh() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CocheCarreras("InvalidCar", 101, 5, 100);
        });
        // Si se comprueba que el mensaje de la excepción es el esperado
        //assertEquals("La Velocidad Máxima debe estar entre 1 y 100", exception.getMessage());
    }

    // Prueba que la velocidadMáxima está entre 1 y 100 sin excepción
    // Esta prueba falla si se ha usado una excepción para implementar el método
    @Test  
    public void testConstructorInvalidVelocidadMaximaLow2() {
        CocheCarreras coche = new CocheCarreras("InvalidCar", -1, 5, 100);
        assertTrue(coche.getVelocidadMaxima() >= 1 && coche.getVelocidadMaxima() <= 100);
        coche = new CocheCarreras("InvalidCar", 101, 5, 100);
        assertTrue(coche.getVelocidadMaxima() >= 1 && coche.getVelocidadMaxima() <= 100);
    }

    @Test
    public void testConstructorNegativeMaxTurbos() {
        CocheCarreras coche = new CocheCarreras("NegativeTurbosCar", 50, -1, 100);
        assertEquals(0, coche.getTurbosRestantes());
    }

    @Test
    public void testConstructorNegativeMaxAutonomia() {
        CocheCarreras coche = new CocheCarreras("NegativeAutonomiaCar", 50, 5, -1);
        assertEquals(0, coche.getAutonomiaRestante());
    }


    // PRUEBAS GETTERS
    @Test
    public void testGetNombre() {
        assertEquals("TestCar", coche.getNombre());
    }

    // No se exige explícitamente en el enunciado, pero se añade para completar la cobertura
    @Test
    public void testGetVelocidadMaxima() {
        assertEquals(50, coche.getVelocidadMaxima());
    }

    @Test
    public void testGetTurbosRestantes() {
        assertEquals(5, coche.getTurbosRestantes());
    }

    @Test
    public void testGetAutonomiaRestante() {
        assertEquals(100, coche.getAutonomiaRestante());
    }

    @Test
    public void testGetDistanciaRecorrida() {
        assertEquals(0, coche.getDistanciaRecorrida());
    }




    // PRUEBAS AVANZAR
    @Test
    public void testAvanzarWithinAutonomia() {
        int initialAutonomia = coche.getAutonomiaRestante();
        int metros = coche.avanzar();
        assertTrue(metros > 0 && metros <= coche.getVelocidadMaxima());
        assertEquals(initialAutonomia - metros, coche.getAutonomiaRestante());
        assertEquals(metros, coche.getDistanciaRecorrida());
    }

    @Test
    public void testAvanzarExceedsAutonomia() {
        coche = new CocheCarreras("TestCar", 50, 5, 10);
        int initialAutonomia = coche.getAutonomiaRestante();
        int metros = coche.avanzar();
        assertTrue(metros <= initialAutonomia);

        assertEquals(0, coche.getAutonomiaRestante());
        assertEquals(metros, coche.getDistanciaRecorrida());
    }

    @Test
    public void testAvanzarWithZeroAutonomia() {
        coche = new CocheCarreras("TestCar", 50, 5, 0);
        int metros = coche.avanzar();
        assertEquals(0, metros);
        assertEquals(0, coche.getAutonomiaRestante());
        assertEquals(0, coche.getDistanciaRecorrida());
    }


    // PRUEBAS USAR TURBO
    @Test
    public void testUsarTurboWithTurbosRemaining() {
        int initialTurbos = coche.getTurbosRestantes();
        int initialAutonomia = coche.getAutonomiaRestante();
        int metros = coche.usarTurbo();
        assertTrue(metros > 0 && metros <= coche.getVelocidadMaxima() * 1.5);
        assertEquals(initialTurbos - 1, coche.getTurbosRestantes());
        assertEquals(initialAutonomia - metros, coche.getAutonomiaRestante());
        assertEquals(metros, coche.getDistanciaRecorrida());
    }

    @Test
    public void testUsarTurboWithNoTurbosRemaining() {
        coche = new CocheCarreras("TestCar", 50, 0, 100);
        int metros = coche.usarTurbo();
        assertEquals(0, metros);
        assertEquals(0, coche.getTurbosRestantes());
        assertEquals(100, coche.getAutonomiaRestante());
        assertEquals(0, coche.getDistanciaRecorrida());
    }

    @Test
    public void testUsarTurboExceedsAutonomia() {
        coche = new CocheCarreras("TestCar", 50, 5, 10);
        int initialTurbos = coche.getTurbosRestantes();
        int metros = coche.usarTurbo();
        assertTrue(metros <= 10);
        assertEquals(initialTurbos - 1, coche.getTurbosRestantes());
        assertEquals(0, coche.getAutonomiaRestante());
        assertEquals(metros, coche.getDistanciaRecorrida());
    }


    // PRUEBAS REPOSTAR
    @Test
    public void testRepostarResetsTurbosAndAutonomia() {
        coche.avanzar();
        coche.usarTurbo();
        coche.repostar();
        assertEquals(coche.getTurbosRestantes(), 5);
        assertEquals(coche.getAutonomiaRestante(), 100);
    }

    @Test
    public void testRepostarWithNoAutonomiaAndTurbos() {
        coche = new CocheCarreras("TestCar", 50, 0, 0);
        coche.repostar();
        assertEquals(coche.getTurbosRestantes(), 0);
        assertEquals(coche.getAutonomiaRestante(), 0);
    }


    // PRUEBAS REINICIAR DISTANCIA
    @Test
    public void testReiniciarDistanciaAfterAvanzar() {
        coche.avanzar();
        coche.reiniciarDistancia();
        assertEquals(0, coche.getDistanciaRecorrida());
    }

    @Test
    public void testReiniciarDistanciaAfterUsarTurbo() {
        coche.usarTurbo();
        coche.reiniciarDistancia();
        assertEquals(0, coche.getDistanciaRecorrida());
    }

    @Test
    public void testReiniciarDistanciaWithoutMoving() {
        coche.reiniciarDistancia();
        assertEquals(0, coche.getDistanciaRecorrida());
    }
}