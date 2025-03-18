package ud5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    static final int MAX_NUM = 99;
    static Jugador[] jugadores;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nBINGO");
        System.out.println();

        System.out.println("Número de jugadores: ");
        int numJugadores = sc.nextInt();

        for (int i = 1; i <= numJugadores; i++) {
            sc.nextLine();
            System.out.println("\n Introduce los datos de los jugadores: ");
            System.out.println("Nombre jugador" + i + ": ");
            String nombre = sc.nextLine();
            System.out.println("Número de cartones ");
            int numCartones = sc.nextInt();
            System.out.println();

            Jugador jugador = new Jugador(nombre, numCartones);
            jugadores[i - 1] = jugador;
            System.out.println(jugador);
        }

        sc.close();
    }
}

class Jugador {
    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        this.cartones = new Carton[numCartones];
    }

    @Override
    public String toString() {
        return "Jugador" + nombre + " (" + cartones.length + " cartones";
    }

}

class Carton {
    static final int MAX_FILAS = 3;
    static final int MAX_COLS = 5;

    int[][] numeros;

    public Carton() {
        this.numeros = new int[MAX_FILAS][MAX_COLS];
    }
}