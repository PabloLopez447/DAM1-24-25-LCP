package ud2.lcpexamen;

import java.util.*;

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
            causa = "Horas";
        }
        if (horasEncendido * nEncendidos < nHoras) {
            causa = "Encendidos";
        }
        if (horasEncendido * nEncendidos == nHoras) {
            causa = "Horas + Encendidos";
        }
        if (horasEncendido > 10 || horasEncendido <= 0 || nEncendidos < 0) {
            causa = "Error";
        }

        return causa;

    }
}
