package ud1.ejercicios;

import java.util.Scanner;

/**
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:
 * A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
 * A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
 * A 14 no hay que sumarle nada (0) para que sea múltiplo de 7
 *  
 * Pista: El operador módulo puede ser muy útil para solucionar esta actividad.
 */

public class EP0129 {
    public static void main(String[] args) {
        int nIntroducido, cSumar, resto, multiplo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que desees convertir en múltiplo de 7: ");
        nIntroducido = sc.nextInt();
        sc.close();

        resto = nIntroducido % 7;
        cSumar = resto == 0 ? 0 : 7 - resto;
        multiplo = cSumar + nIntroducido;

        System.out.println("El número a sumar es " + cSumar + " -> (" + cSumar + " + " + nIntroducido + " = " + multiplo + ")");
    }
}