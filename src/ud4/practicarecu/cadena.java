package ud4.practicarecu;

import java.util.Arrays;

public class cadena {

    static String nombre = "Pablbo";
    static char[][] c = new char[nombre.length() / 2 + 2][2];

    public static void main(String[] args) {
        llenar();
        partir4();
        nombre = nombre.replace(nombre.charAt(2), 'z');
        System.out.println(nombre);
    }

    public static void partir1() {
        String nombre = "Pablo";
        char[] nom = nombre.toCharArray();

        for (int i = 0; i < nom.length; i++) {
            if (i % 2 == 0) {
                System.out.println();
            }
            System.out.print(nom[i]);

        }
    }

    public static String partir2() {
        String nombre = "Pablo";
        String resuString = "";

        for (int i = 0; i < nombre.length(); i++) {
            if (i % 2 == 0) {
                resuString += "\n";
            }
            resuString += nombre.charAt(i);

        }
        return resuString;
    }

    public static void partir3() {
        int n = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (i != 1) {
                    if (n < nombre.length()) {
                        c[i][j] = nombre.charAt(n);
                        n++;
                    }
                }
            }
        }
        imprimirMatriz(c);
    }

    public static void partir4() {
        int n = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (n < nombre.length()) {
                    if ((int) nombre.charAt(n) % 2 != 0) {
                        int ch = (int) (nombre.charAt(n)) + 1;
                        c[i][j] = (char) ch;
                    } else {
                        c[i][j] = nombre.charAt(n);
                    }

                    n++;
                }
            }
        }

        imprimirMatriz(c);
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void llenar() {
        for (int i = 0; i < c.length; i++) {
            Arrays.fill(c[i], '@');
        }
    }
}
