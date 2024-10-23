package ud2.ejercicios;

/*
 * Solicitar dos números y mostrar cuál es el mayor o si son iguales.
 */

import java.util.*;

public class E0206 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el 1er numero: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el 2º numero: ");
        num2 = sc.nextDouble();
        sc.close();

        if (num1 == num2) {
            System.out.println(num1 + " es igual que " + num2);
        }
        else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }
        else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
