package ud4.ejercicios;

import static org.junit.Assume.assumeNoException;

import java.util.Arrays;

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

    private static int moda(int[] numeros) {        
        Arrays.sort(numeros);
        int moda = numeros[0]; 
        int maxRepeticiones = 1;
        int repeticiones = 1;
        int numeroActual = numeros[0];
        for (int i = 1; i < numeros.length; i++) {  // Recorremos el array ordenado
            if (numeros[i] == numeroActual) { // El número en la posición i es repetido
                repeticiones++;
                if (repeticiones > maxRepeticiones) {
                    moda = numeroActual;
                    maxRepeticiones = repeticiones;
                } else if (repeticiones == maxRepeticiones)
                    moda = -1;
            } else { // El número en la posición i es nuevo
                numeroActual = numeros[i];
                repeticiones = 1;
            }
        }
        return moda;
    }  

    private static double mediana(int[] numeros) {
        Arrays.sort(numeros);
        return numeros.length % 2 == 0 ? 
            (numeros[numeros.length / 2] + numeros[numeros.length / 2 - 1]) / 2.0 : 
            numeros[numeros.length / 2];
    }    

    private static double media(int[] numeros) {
        return suma(numeros) / (double) numeros.length;
    }

    private static int minimo(int[] numeros) {
        int minimo = numeros[0];
        for (int n : numeros) {
            if (n < minimo) 
                minimo = n;
        }
        return minimo;
    }    

    private static int maximo(int[] numeros) {
        int maximo = numeros[0];
        for (int n : numeros) {
            if (n > maximo) 
                maximo = n;
        }
        return maximo;
    }

    private static int suma(int[] numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma;
    }

}