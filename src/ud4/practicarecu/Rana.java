package ud4.practicarecu;

import java.util.Arrays;

public class Rana {

    static char[][] lago;

    public static void main(String[] args) {

        lago = new char[5][5];
        int n = 0;
        for (int i = 0; i < lago.length; i++) {
            for (int j = 0; j < lago[i].length; j++) {
                if (n % 2 == 0) {
                    lago[i][j] = 'x';
                } else {
                    lago[i][j] = ' ';
                }
                n++;
            }
        }
        imprimirMatriz(lago);
        quitarcolizq2();
        System.out.println();
        imprimirMatriz(lago);
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (char[] fila : matriz) {
            for (char num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void quitarcolder() {
        for (int i = 0; i < lago.length; i++) {
            lago[i] = Arrays.copyOf(lago[i], lago[i].length - 1);
        }
    }

    public static void quitarcolizq() {
        char[][] lago2 = new char[lago.length][lago[0].length - 1];
        for (int i = 0; i < lago.length; i++) {
            for (int j = 0; j < lago[i].length; j++) {
                if (j > 0) {
                    lago2[i][j - 1] = lago[i][j];
                }
            }
        }
        lago = lago2;
    }

    public static void quitarcolizq2() {
        char[][] lago2 = new char[lago.length][lago[0].length - 1];
        for (int i = 0; i < lago2.length; i++) {
            for (int j = 0; j < lago2[i].length; j++) {

                if (j + 1 < lago[i].length) {
                    lago2[i][j] = lago[i][j + 1];

                }
            }
        }

        lago = lago2;
    }

}