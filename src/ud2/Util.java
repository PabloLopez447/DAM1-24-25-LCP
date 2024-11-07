package ud2;

import java.util.Scanner;

public class Util {

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esBisiesto(int anho) {
        return anho % 400 == 0 || (anho % 4 == 0 && anho % 100 != 0);
    }

    static int mayor(int a, int b) {
        return a > b ? a : b;
    }

    static String notaEnTexto(int nota) {
        String notaEnTexto = "";

        switch (nota) {
            case 0, 1, 2, 3, 4:
                notaEnTexto = "insuficiente";
                break;
            case 5:
                notaEnTexto = "suficiente";
                break;
            case 6:
                notaEnTexto = "bien";
                break;
            case 7, 8:
                notaEnTexto = "notable";
                break;
            case 9, 10:
                notaEnTexto = "sobresaliente";
                break;
        }

        return notaEnTexto;
    }

    static String notaEnTexto(double nota) {

        String notaEnTexto = "";

        if (nota >= 0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if (nota >= 5 && nota < 6) {
            notaEnTexto = "suficiente";
        } else if (nota >= 6 && nota < 7) {
            notaEnTexto = "bien";
        } else if (nota >= 7 && nota < 9) {
            notaEnTexto = "notable";
        } else if (nota >= 9 && nota <= 10) {
            notaEnTexto = "sobresaliente ";
        }

        return notaEnTexto;
    }

    public static void main(String[] args) {
        double notaDouble = 6.7;
        System.out.println(notaEnTexto((int) notaDouble));
        int notaInt = 8;
        System.out.println(notaEnTexto(notaInt));

        Scanner sc = new Scanner(System.in);
        System.out.print("Número / Anho: ");
        int n = sc.nextInt();
        sc.close();

        if (esPar(n))
            System.out.println("Es Par");
        else
            System.out.println("Es Impar");

        if (esBisiesto(n))
            System.out.println("Es Bisiesto");
        else
            System.out.println("NO es bisiesto");

        System.out.println(mayor(4, 17));
        System.out.println(mayor(8, 1));

    }

}
