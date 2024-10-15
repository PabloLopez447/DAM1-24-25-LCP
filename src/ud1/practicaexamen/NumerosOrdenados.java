package ud1.practicaexamen;

/* Escribe un programa que lea 3 números por teclado e indique si están ordenados o no, de
menor a mayor, y de mayor a menor */

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Introduce 3 números (pulsa ENTER después de cada uno): ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();
        scanner.close();

        String ordenados =  (numero1 > numero2 && numero2 > numero3) ? // No se pueden encadenar comparaciones, es necesario el &&
                                        "Ordenados de mayor a menor":
                            (numero1 < numero2 && numero2 < numero3) ? 
                                        "Ordenados de menor a mayor":
                                        "Números desordenados";

        System.out.println(ordenados);
    }   
}