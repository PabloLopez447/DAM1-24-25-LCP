package ud1.practicaexamen;

/* Diseña un programa que lea una medida de peso en kilogramos y la devuelva en libras. Una
libra equivale a 0.453592 kilogramos. */


import java.util.Scanner;

public class KilosALibras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        final double LIBRA = 0.453592;

        System.out.print("Introduzca el peso en kilogramos: ");
        double kilogramos = scanner.nextDouble();
        scanner.close();

        double resultado = kilogramos/LIBRA;

        System.out.printf("\n%.2f kilogramos equivalen a %.2f libras", kilogramos, resultado);

    }
}
