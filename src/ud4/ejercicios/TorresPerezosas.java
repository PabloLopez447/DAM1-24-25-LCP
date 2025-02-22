package ud4.ejercicios;


/**
 * Ejercicio basado en https://aceptaelreto.com/problem/statement.php?id=181&cat=14
 */
public class TorresPerezosas {
    public static void main(String[] args) {
        char[][] tablero1 = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };

        char[][] tablero2 = {
                {'.', '.', '.'},
                {'X', '.', '.'},
                {'.', '.', '.'}
        };

        char[][] tablero3 = {
                {'.', '.', '.'},
                {'.', 'X', '.'},
                {'.', '.', '.'}
        };


        System.out.println(caminosDistintos(tablero1)); // 6
        System.out.println(caminosDistintos(tablero2)); // 3
        System.out.println(caminosDistintos(tablero3)); // 2

        System.out.println(caminosDistintosRecursivo(tablero1)); // 6
        System.out.println(caminosDistintosRecursivo(tablero2)); // 3
        System.out.println(caminosDistintosRecursivo(tablero3)); // 2
    }

    // SOLUCIÓN ITERATIVA
    private static int caminosDistintos(char[][] t) {
        int[][] tr = new int[t.length][t.length];

        for (int j = 0; j < t.length; j++) {
            for (int i = tr.length - 1; i >= 0; i--) {
                // Inicializamos la casilla inferior izquierda
                if (j == 0 && i == t.length - 1) {
                    tr[i][j] = 1;
                } else if (t[i][j] != 'X') {
                    // sumar casillaizquierda + casillainferior
                    if (j > 0)
                        tr[i][j] = tr[i][j-1];
                    if (i < t.length - 1)
                        tr[i][j] += tr[i+1][j];
                }
            }
        }
        // El resultado está en la casilla superior derecha
        return tr[0][tr.length - 1];
    }


    // SOLUCIÓN RECURSIVA
    private static int caminosDistintosRecursivo(char[][] t) {
        return calcularCasilla(t, 0, t.length - 1);
    }

    private static int calcularCasilla(char[][] t, int i, int j) {
        if (j == 0 && i == t.length - 1)
            return 1;
        else if (t[i][j] == 'X')
            return 0;
        else if (j == 0)
            return calcularCasilla(t, i + 1, j);
        else if (i == t.length - 1)
            return calcularCasilla(t, i, j - 1);
        else
            return calcularCasilla(t, i, j - 1) + calcularCasilla(t, i + 1, j);
    }

}
