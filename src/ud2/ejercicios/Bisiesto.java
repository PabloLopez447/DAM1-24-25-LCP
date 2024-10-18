package ud2.ejercicios;

/*
 * Haz un programa que pida por teclado un número de año y que muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.

“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo caso también ha de ser divisible entre 400.”

Ejemplos:
Son bisiestos: 4, 40, 120, 144, 400, 800, 2024. 
No son bisiestos: 3, 100, 2100

 */

import java.util.*;

public class Bisiesto {
    public static void main(String[] args) {
        int nAno;
        boolean esBisiesto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del año que quieras: ");
        nAno = sc.nextInt();
        sc.close();

        boolean div4 = nAno % 4 == 0;
        boolean div100 = nAno % 100 == 0;
        boolean div400 = nAno % 400 == 0;

        if (div400 || div4 && !div100) {
            esBisiesto = true;
        }
        else {
            esBisiesto = false;
        }
        
/*      if (div4) {
            if (div100) {
                if (div400) {
                    esBisiesto = true;
                } else {
                    esBisiesto = false;
                }
            } else {
                esBisiesto = true;
            }
        } else {
            esBisiesto = false;
        }
*/ 
        if (esBisiesto) {
            System.out.println("El año " + nAno + " es año bisiesto");
        } else {
            System.out.println("El año " + nAno + " no es año bisiesto");
        }
 
    }
}
