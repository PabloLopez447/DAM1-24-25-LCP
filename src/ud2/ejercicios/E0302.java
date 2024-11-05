package ud2.ejercicios;

/*Implementar una aplicación para calcular datos estadísticos de las edades de los
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
de alumnos y cuántos son mayores de edad.
 */

import java.util.*;

public class E0302 {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad de un alumno: ");
        edad = sc.nextInt();
        

        while (edad >= 0) {

            

            System.out.print("Introduce la edad de un alumno: ");
            edad = sc.nextInt();
        }
        sc.close();
    }
}
