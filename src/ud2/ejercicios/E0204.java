package ud2.ejercicios;

/*
 *  Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números casi-cero son el 0,3, el -0,99 o el 0,123; algunos números que no se consideran casi-ceros son: el 12,3, el 0 o el -1.
 */

 import java.util.*;

public class E0204 {
    public static void main(String[] args) {
        double nIntro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nº que quieres saber si es casi 0: ");
        nIntro = sc.nextDouble();
        sc.close();

        if (nIntro > -1 && nIntro < 1 && nIntro != 0){
            System.out.println("Tu número es casi 0");
        }
        else {
            System.out.println("Tu número no es casi 0");
        }
    }
}
