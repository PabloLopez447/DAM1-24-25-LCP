package ud1.ejercicios;

/* Realice un programa que intercambie los valores de dos variables */

public class EP0127 {
    public static void main(String[] args) {
        int a, b;
        a = 5; 
        b = 7;

        System.out.println("Antes: a = " + a + ", b = " + b);

        int temp; // variable temporal auxiliar

        temp = a;
        a = b;
        b = temp;

        System.out.println("Después: a " + a + ", b = " + b);
    }
}