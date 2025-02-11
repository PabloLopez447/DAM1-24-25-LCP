package ud4;

import java.util.*;

public class ArraysEstadisticas {

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }

    static int suma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    static int minimo(int[] numeros) {
        int minimo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        return minimo;
    }

    static int maximo(int[] numeros) {
        int maximo = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        return maximo;
    }

    static double media(int[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double media = suma / (numeros.length - 1);
        return media;
    }

    static double mediana(int[] numeros) {
        Arrays.sort(numeros);
        double mediana = numeros[(numeros.length - 1) / 2];
        return mediana;
    }

    static int moda(int[] numeros) {
        int frMax = 0;
        int moda = -1;
        int frActual = 1;
        boolean hayempate = false;
        Arrays.sort(numeros);
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] == numeros[i - 1]) {
                frActual++;
            } else if (frActual > frMax) {
                frMax = frActual;
                moda = numeros[i - 1];
                hayempate = false;
            } else if (frActual == frMax) {
                hayempate = true;
            }
            frActual = 1;
        }
        if (frActual > frMax) {
            moda = numeros[numeros.length - 1];
        } else if (frActual == frMax) {
            hayempate = true;
        }
        return hayempate ? -1 : moda;
    }

}