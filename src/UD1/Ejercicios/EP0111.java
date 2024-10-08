package UD1.Ejercicios;

import java.util.Scanner;

/**
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La 
 * aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla 
 * el importe correspondiente al IVA y al total. 
*/

public class EP0111 {
    public static void main(String[] args) {
        // Declaración de variables y constantes

        Scanner sc = new Scanner(System.in);

        // Entrada de datos (por teclado)
        
        System.out.println("Hola inserte el importe inicial al que se le aplicara el IVA");
        double importeBase = sc.nextDouble();
        System.out.println("Y cuanto es el IVA que se le va a aplicar? (introduce solo el número no el porcentaje) ");
        double ivaPercent = sc.nextDouble();

        // Procesos

        double importeIva = importeBase * (ivaPercent * 0.01);
        double importeTotal = importeBase + importeIva;

        // Salida por pantalla

        System.out.println("El importe de IVA a añadir es: " + importeIva);
        System.out.println("Para un total de: " + importeTotal);
        sc.close();
    }
}
