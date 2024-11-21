package ud2.lcpexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.Test;

//Pablo López Couso

public class DuracionBombilla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nHoras, nEncendidos, horasEncendido;

        System.out.print("Introduce las horas que aguanta encendida la bombilla: ");
        nHoras = sc.nextInt();
        System.out.print("Introduce los encendidos que aguantala bombilla: ");
        nEncendidos = sc.nextInt();
        System.out.print("Introduce las horas que estara encendida por cada vez que enciendas la bombilla: ");
        horasEncendido = sc.nextInt();
        sc.close();

        System.out.println(causaFinBombilla(nHoras, nEncendidos, horasEncendido));
    }

    public static String causaFinBombilla(int nHoras, int nEncendidos, int horasEncendido) {
        String causa = "";

        if (horasEncendido * nEncendidos > nHoras) {
            causa = "HORAS";
        }
        if (horasEncendido * nEncendidos < nHoras) {
            causa = "ENCENDIDOS";
        }
        if (horasEncendido * nEncendidos == nHoras) {
            causa = "ENCENDIDOS + HORAS";
        }
        if (horasEncendido > 10 || horasEncendido <= 0 || nEncendidos < 0 || nHoras <= 0) {
            causa = "ERROR";
        }

        return causa;

    }

    @Test
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

}
