package ud5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static final int MAX_NUM = 99;
    static Jugador[] jugadores;
    static int[] numeros = new int[0];
    static boolean linea = false;
    static boolean bingo = false;

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBINGO");
        System.out.println("=====\n");

        System.out.print("Número de jugadores: ");
        int numJugadores = sc.nextInt();
        jugadores = new Jugador[numJugadores];

        System.out.println("\nIntroduce los datos de los jugadores:");

        for (int i = 1; i <= numJugadores; i++) {
            sc.nextLine(); // Limpio el buffer de entrada de teclado
            System.out.print("Nombre jugador" + i + ": ");
            String nombre = sc.nextLine();
            System.out.print("Número de cartones: ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores[i - 1] = jugador;
            System.out.println(jugador);
        }

        // Comienza el Juego
        System.out.println("Comienza el juego");
        System.out.println("-----------------");
        // Dos Modalidades
        System.out.println("Que modalidad prefieres? (N - Número a número)  (A - Automática)");
        sc.nextLine(); // Limpio el buffer de entrada de teclado
        int opcion = sc.nextLine().toUpperCase().charAt(0);
        switch (opcion) {
            case 'N':
                modoNumeroANumero();
                break;
            case 'A':
                modoAutomatico();
                break;
            default:
                System.out.println("Opción incorrecta. Fin del programa");
        }
    }

    private static void modoAutomatico() {
        throw new UnsupportedOperationException("Unimplemented method 'modoAutomatico'");
    }

    private static void modoNumeroANumero() {
        // El programa saca un bola aleatoria, no repetida
        int numero = sortearNumero();
        System.out.println("Número que sale del bombo: " + numero);
        // Revisar Cartones

    }

    /**
     * Sortea un nuevo número y lo añade al array de números sorteados
     * 
     * @return
     */
    private static int sortearNumero() {
        Random rnd = new Random();
        int numRandom;
        boolean repetido;
        do {
            numRandom = rnd.nextInt(MAX_NUM) + 1;
            repetido = false;
            int i = 0;
            while (i < numeros.length && !repetido) {
                if (numeros[i] == numRandom)
                    repetido = true;
                i++;
            }
        } while (repetido);

        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numRandom;
        return numRandom;
    }
}

class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        cartones = new Carton[numCartones];
        for (int i = 0; i < cartones.length; i++) {
            cartones[i] = new Carton();
        }
    }

    @Override
    public String toString() {
        String str = "Jugador: " + nombre + " (" + cartones.length + " cartones)\n\n";
        for (int i = 0; i < cartones.length; i++) {
            str += cartones[i] + "\n";
        }
        return str;
    }
}

class Carton {
    static final int MAX_FILAS = 3;
    static final int MAX_COLS = 5;

    int[][] numeros;

    public Carton() {
        this.numeros = new int[MAX_FILAS][MAX_COLS];
        // Rellenar con números aleatorios distintos.
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                // Genera un número aleatorio
                Random rnd = new Random();
                boolean repetido;
                int numRandom;
                do {
                    numRandom = rnd.nextInt(Bingo.MAX_NUM) + 1;
                    repetido = false;
                    int ii = 0;
                    while (ii < MAX_FILAS && !repetido) {
                        int jj = 0;
                        while (jj < MAX_COLS && !repetido) {
                            if (numeros[ii][jj] == numRandom)
                                repetido = true;
                            jj++;
                        }
                        ii++;
                    }
                } while (repetido);

                numeros[i][j] = numRandom;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                str.append(numeros[i][j] + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }

    /**
     * Revisa el cartón comparando los números del mismo con los números sorteados
     * que se pasan como parámetro
     * Devuelve 0 sin tras la revisión no hay línea ni bingo
     * Devuelve 1 si hay línea pero no bingo
     * Devuelve 2 si hay bingo
     * 
     * @param numerosSorteo
     * @return
     */
    public int revisarCarton(int[] numerosSorteo) {
        boolean fila = false;
        boolean bingo = false;
        Arrays.sort(numerosSorteo);
        for (int i = 0; i < MAX_FILAS; i++) {
            for (int j = 0; j < MAX_COLS; j++) {
                if (1 == Arrays.binarySearch(numerosSorteo, numeros[i][j])) {
                    fila = true;
                }
            }
        }

        if (fila == false && bingo == false) {
            return 0;
        } else if (fila == true && bingo == false) {
            return 1;
        } else if (fila == true && bingo == true) {
            return 2;
        }
        return 0;
    }

}
