package ud1.ejercicios;

import java.util.Scanner;

/**
 * Solicita al usuario tres distancias:
 * La primera, medida en milímetros.
 * La segunda, medida en centímetros.
 * La última, medida en metros.
 * 
 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
 * centimetros).
 */

public class EP0116 {
    public static void main(String[] args) {
        double dMetros, dCentimetros, dMilimetros, cmTotales;
        Scanner sc = new Scanner (System.in);

        System.out.print("Introduce el nº de metros: ");
        dMetros = sc.nextDouble();
        System.out.print("Introduce el nº de centimetros: ");
        dCentimetros = sc.nextDouble();
        System.out.print("Introduce el nº de milimetros: ");
        dMilimetros = sc.nextDouble();
        sc.close();

        cmTotales = dCentimetros + (dMetros * 100) + (dMilimetros / 10);

        System.out.println("El total de cm es: " + cmTotales);
    }
}
