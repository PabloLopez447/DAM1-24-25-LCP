package ud1.exercicios.lcp20241010;

import java.util.Scanner;

public class EP0129 {
    public static void main(String[] args) {
        int nIntroducido, cSumar, resto, multiplo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número que desees convertir en múltiplo de 7: ");
        nIntroducido = sc.nextInt();
        sc.close();

        resto = nIntroducido % 7;
        cSumar = nIntroducido / 7 == 0 ? 0 : 7 - resto ;
        multiplo = cSumar + nIntroducido;

        System.out.println("El número a sumar es " + cSumar + " -> (" + cSumar + " + " + nIntroducido + " = " + multiplo + ")");
    }
}
