package ud1.ejercicios;

/* Convertir una temperatura introducida por teclado en grados Celsius o centígrados a grados Farenheit, 
mostrando el resultado por pantalla. */

import java.util.Scanner;

public class EP0121 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca los grados celsius: ");
        celsius = scanner.nextDouble();
        scanner.close();
        fahrenheit = celsius * (9.0/5.0) + 32;
        System.out.println(celsius + " ºC son " + fahrenheit + " ºF");
    } 
}
