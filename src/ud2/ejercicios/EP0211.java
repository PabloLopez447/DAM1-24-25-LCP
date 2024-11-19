package ud2.ejercicios;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = sc.nextInt();

        String numStr = Integer.toString(numero);
        String reverseStr = new StringBuilder(numStr).reverse().toString();

        if (numStr.equals(reverseStr)) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }
        sc.close();
    }
}