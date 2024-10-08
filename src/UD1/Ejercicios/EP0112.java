package UD1.Ejercicios;

import java.util.Scanner;

/**
 * Crea un programa que pida la base y la altura de un triángulo y muestre su área. 
 * (Área Triángulo = (base * altura) / 2)
 *
*/

public class EP0112 {
    public static void main(String[] args) {
        // Declaración de variables

        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        // Entrada de datos (por teclado)

        System.out.println("Vamos a calcular el área de un triangulo");
        System.out.print("Introduce el valor de la base del triangulo: ");
        base = sc.nextDouble();
        System.out.print("Ahora introduce el valor de la altura del triangulo: ");
        altura = sc.nextDouble();

        // Proceso

        area = (base * altura) / 2;

        // Salida por pantalla

        System.out.println("El área del triangulo es: " + area);
        sc.close();
    }
}
