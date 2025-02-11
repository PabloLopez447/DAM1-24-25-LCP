package ud3.ejerciciosclases;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalendarioTest {

    @Test
    public void testDiasMesFebreroBisiesto() {
        assertEquals(29, Calendario.diasMes(2, 2020));
    }

    @Test
    public void testDiasMesFebreroNoBisiesto() {
        assertEquals(28, Calendario.diasMes(2, 2019));
    }

    @Test
    public void testDiasMesAbril() {
        assertEquals(30, Calendario.diasMes(4, 2021));
    }

    @Test
    public void testDiasMesJunio() {
        assertEquals(30, Calendario.diasMes(6, 2021));
    }

    @Test
    public void testDiasMesSeptiembre() {
        assertEquals(30, Calendario.diasMes(9, 2021));
    }

    @Test
    public void testDiasMesNoviembre() {
        assertEquals(30, Calendario.diasMes(11, 2021));
    }

    @Test
    public void testDiasMesEnero() {
        assertEquals(31, Calendario.diasMes(1, 2021));
    }

    @Test
    public void testDiasMesMarzo() {
        assertEquals(31, Calendario.diasMes(3, 2021));
    }

    @Test
    public void testDiasMesMayo() {
        assertEquals(31, Calendario.diasMes(5, 2021));
    }

    @Test
    public void testDiasMesJulio() {
        assertEquals(31, Calendario.diasMes(7, 2021));
    }

    @Test
    public void testDiasMesAgosto() {
        assertEquals(31, Calendario.diasMes(8, 2021));
    }

    @Test
    public void testDiasMesOctubre() {
        assertEquals(31, Calendario.diasMes(10, 2021));
    }

    @Test
    public void testDiasMesDiciembre() {
        assertEquals(31, Calendario.diasMes(12, 2021));
    }

    @Test
    public void testDiasMesInvalido() {
        assertEquals(-1, Calendario.diasMes(13, 2021));
    }

    @Test
    public void testIncrementarAñoPositivo() {
        Calendario calendario = new Calendario(2021, 1, 1);
        calendario.incrementarAño(5);
        assertEquals(2026, calendario.getAnho());
    }

    @Test
    public void testIncrementarAñoNegativo() {
        Calendario calendario = new Calendario(2021, 1, 1);
        calendario.incrementarAño(-5);
        assertEquals(2016, calendario.getAnho());
    }

    @Test
    public void testIncrementarAñoCero() {
        Calendario calendario = new Calendario(1, 1, 1);
        calendario.incrementarAño(-1);
        assertEquals(-1, calendario.getAnho());
    }

    @Test
    public void testIncrementarAñoNegativoCero() {
        Calendario calendario = new Calendario(-1, 1, 1);
        calendario.incrementarAño(1);
        assertEquals(1, calendario.getAnho());
    }

    @Test
    public void testIncrementarMesAñoCero() {
        Calendario calendario = new Calendario(-1, 12, 1);
        calendario.incrementarMes();
        assertEquals(1, calendario.getAnho());
    }    
}