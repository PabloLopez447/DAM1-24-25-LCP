package ud1.ejercicios;
/* Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando el nombre cualificado de las clases,
en lugar de utilizar ninguna importación. */

public class EP0126 {
    public static void main(String[] args) {

        double raiz, numero;

        // No utilizar ninguna importación
        java.util.Scanner entrada;
        entrada = new java.util.Scanner(System.in);

        System.out.print("Introduzca un número real: ");
        numero = entrada.nextDouble();
        entrada.close();

        raiz = Math.sqrt(numero);

        System.out.println("Raíz cuadrada: " + raiz);
    }
}