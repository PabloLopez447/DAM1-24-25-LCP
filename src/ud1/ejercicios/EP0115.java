package ud1.ejercicios;

import java.util.Scanner;

/** 
 * Convertir un número de segundos introducido por teclado en horas, minutos y segundos.
*/

public class EP0115 {
    public static void main(String[] args) {
        double nSec, nHour, nMin, secIni;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce nº de segundos: ");
        secIni = sc.nextDouble();
        sc.close();

        nHour = secIni / 3600;
        nMin = (secIni % 3600) / 60;
        nSec = secIni % 60;

        System.out.println(nHour +  " horas" + nMin + " minutos" +  nSec + " segundos");
    }
}
