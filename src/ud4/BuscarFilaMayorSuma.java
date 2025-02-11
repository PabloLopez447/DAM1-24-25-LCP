package ud4;

import java.util.*;

//Pablo López Couso

public class BuscarFilaMayorSuma {
    public static void main(String[] args) {
        int[][] m = generarAleatorio(4, 5);

        int[] fila = buscarFila(m);

        System.out.println(Arrays.toString(fila));

    }

    public static int[][] generarAleatorio(int x, int y) {

        int[][] m = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                m[x][y] = (int) (Math.random() * 10);
            }
        }
        return m;
    }

    public static int[] buscarFila(int[][] m) {
        int sumaMaxima = 0;
        int filaMaxima = 0;

        if (m == null) {
            return null;
        }
        if (m.length == 0) {
            return new int[0];
        }

        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            if (i == 0 || suma > sumaMaxima) {
                sumaMaxima = suma;
                filaMaxima = i;
            }
        }
        return m[filaMaxima];
    }
}