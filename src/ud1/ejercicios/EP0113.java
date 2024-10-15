package ud1.ejercicios;

import java.util.Scanner;

/* 
 * Dado el siguiente polinomio de segundo grado: 
 * y = ax2 + bx + c 
 * crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 * */
 
public class EP0113 {
    public static void main(String[] args) {
        double a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();
        System.out.print("Introduce el valor de x: ");
        x = sc.nextDouble();
        sc.close();

        y = a*Math.pow(x, 2) + b*x + c;

        System.out.println("y es igual a " + y);
    }
}
