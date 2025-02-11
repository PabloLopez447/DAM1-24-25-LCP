package ud4;

import java.util.*;

public class EP0518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizMagica = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizMagica[i][j] = sc.nextInt();
            }
        }
        sc.close();

        mostrar(matrizMagica);

    }

    static void mostrar(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }
}
