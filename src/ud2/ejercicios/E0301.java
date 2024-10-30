package ud2.ejercicios;

/*
 * Diseñar un programa que muestre, para cada número introducido por teclado, si
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0.
 */

 import java.util.*;

public class E0301 {
    public static void main(String[] args) {
        double numeroI, cuadrado;
        String par, positivo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        numeroI = sc.nextDouble();

        while (numeroI != 0) {
            cuadrado = Math.pow(numeroI, 2);
            par = numeroI % 2 == 0 ? "es par" : "es impar";
            positivo = numeroI > 0 ? "es positivo" : "es negativo";
            System.out.println("Para el numero " + numeroI);
            System.out.println("Su cuadrado es " + cuadrado);
            System.out.println("y " + par);
            System.out.println("y " + positivo);

            System.out.print("Introduce el número: ");
            numeroI = sc.nextDouble();
        }
        sc.close();
    }
}
