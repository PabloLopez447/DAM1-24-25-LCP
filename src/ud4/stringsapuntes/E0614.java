package ud4.stringsapuntes;

import java.util.Random;
import java.util.Scanner;

public class E0614 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Leer Palabra Original
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1: Introduzca una palabra: ");
        String palabra;
        do {
            palabra = sc.nextLine();
        } while (palabra.isEmpty());

        // Generar Anagrama
        char[] letras = palabra.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            Random rnd = new Random(0);
            int nuevaPosicion = rnd.nextInt(letras.length);
            char letra = letras[nuevaPosicion];
            letras[nuevaPosicion] = letras[i];
            letras[i] = letra;
        }
        String anagrama = String.valueOf(letras);
        System.out.println("Anagrama: " + anagrama);

        // System.out.println(E0612.sonAnagrama(palabra, anagrama));

        // El jugador 2 debe adivinar la palabra
        final int MAX_INTENTOS = 3;
        int intentos = 0;
        String palabraJ2;
        do {
            System.out.println("Jugador 2: Adivina la palabra original. Te quedan " + (MAX_INTENTOS - intentos) + " intentos.");
            palabraJ2 = sc.nextLine();
            intentos++;
        } while (!palabraJ2.equalsIgnoreCase(palabra) && intentos < MAX_INTENTOS);

        if (palabraJ2.equalsIgnoreCase(palabra)) {
            System.out.println("Enhorabuena!! Has acertado en " + intentos + " intentos.");
        } else {
            System.out.println("No has acertado!! y has consumido tus " + intentos + " intentos.");
        }
    }
}
