import java.util.Scanner;

public class MatrizMagica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Solicitar los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz 4x4:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Verificar si la matriz es mágica
        if (esMatrizMagica(matriz)) {
            System.out.println("La matriz ingresada es una matriz mágica.");
        } else {
            System.out.println("La matriz ingresada NO es una matriz mágica.");
        }

        scanner.close();
    }

    // Método para verificar si la matriz es mágica
    public static boolean esMatrizMagica(int[][] matriz) {
        int sumaReferencia = 0;

        // Calcular la suma de la primera fila como referencia
        for (int j = 0; j < matriz.length; j++) {
            sumaReferencia += matriz[0][j];
        }

        // Verificar la suma de todas las filas
        for (int i = 1; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) {
                return false;
            }
        }

        // Verificar la suma de todas las columnas
        for (int j = 0; j < matriz.length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaReferencia) {
                return false;
            }
        }

        return true; // Si todas las sumas coinciden, la matriz es mágica
    }
}