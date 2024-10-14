package ud1.exercicios.LCP20241004;

import java.util.Scanner;

/**
 * Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 * Formula : C = 5 / 9 * (F - 32)
 */

public class EP0122 {
    public static void main(String[] args) {
        
        double tempFare, tempCel;
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a convertir la temperatura de F a C ");
        System.out.print("Introduce la temperatura en Farenheit: " );
        tempFare = sc.nextDouble();

        tempCel = 5 / 9.0 * (tempFare - 32);

        System.out.println("Esta es la temperatura convertida a Celsius: " + tempCel + " ºC");
        sc.close();
    }
}
