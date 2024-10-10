package ud1.exercicios.lcp20241004;

import java.util.Scanner;

/**
 * Solicita al usuario tres distancias:
 * La primera, medida en milímetros.
 * La segunda, medida en centímetros.
 * La última, medida en metros.
 * 
 * Diseña un programa que muestre la suma de las tres longitudes introducidas
 * (medida en centimetros).
*/

public class EP0116 {
    public static void main(String[] args) {
        double d1, d2, d3;
        Scanner sc = new Scanner (System.in);

        System.out.println("Hola, vamos a sumar 3 distancias");
        System.out.print("Por favor escribe la primera discania en mm: ");
        d1 = sc.nextDouble();
        System.out.print("Bien, ahora escribe la segunda en cm: ");
        d2 = sc.nextDouble();
        System.out.print("Por último escribe la tercera en m: ");
        d3 = sc.nextDouble();

        double d1cm = d1 / 10;
        double d3cm = d3 * 100;
        double dTotal = d1cm + d2 + d3cm; 

        System.out.println("Las 3 distancias sumadas en cm dan un total de " + dTotal + "cm");
        sc.close();

    }
}
