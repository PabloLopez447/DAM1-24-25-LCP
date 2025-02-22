package ud4.ejercicios;

import java.util.Arrays;

public class BuscarFilaMayorSuma {
    public static void main(String[] args) {
        int[][] matriz = generarAleatorio(4, 5);

        mostrar(matriz);

        int[] fila = buscarFilaMayorSuma(matriz);

        System.out.println(Arrays.toString(fila));
    }


    static int[] buscarFilaMayorSuma(int[][] m) {
        if (m == null) 
            return null;

        if (m.length == 0)
            return new int[0];
        
        int sumaMaxima = 0;
        int filaMaxima = 0;

        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }

            // Descomentar para pruebas
            // System.out.println("Suma fila " + i + " = " + suma);

            if (i == 0 || suma > sumaMaxima) {
                sumaMaxima = suma;
                filaMaxima = i;
            }
        }

        return m[filaMaxima];
        
    }





    static int[][] generarAleatorio(int f, int c) {
        int[][] m = new int[f][c];

        for (int i = 0; i < f; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int) (Math.random() * 10);

        return m;
    }

    static void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

}
