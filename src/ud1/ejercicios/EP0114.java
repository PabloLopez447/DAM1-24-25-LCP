package ud1.ejercicios;

import java.util.Scanner;

/*
 * Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.
 */

public class EP0114 {
    public static void main(String[] args) {
        double nSec, nMin, nHour, secTot;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nº de segundos: ");
        nSec = sc.nextDouble();
        System.out.print("Introduce el nº de minutos: ");
        nMin = sc.nextDouble();
        System.out.print("Introduce el nº de horas: ");
        nHour = sc.nextDouble();
        sc.close();

        secTot = nSec + (nMin*60) + (nHour*3600);

        System.out.println("Todo pasado a segundos serian " + secTot + " segundos.");
    }
}
