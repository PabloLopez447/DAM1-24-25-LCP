package ud2.ejercicios;

/*
Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador
tendrá que introducir la solución de la suma de dos números aleatorios comprendidos
entre 1 y 100. Mientras la solución sea correcta, el juego continuará. En caso contrario, el
programa terminará y mostrará el número de operaciones realizadas correctamente.
 */

import java.time.LocalTime;
import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {
        int MAX = 100;
        int MIN = 1;

        int num1 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
        int num2 = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

        Scanner sc = new Scanner(System.in);
        LocalTime horaInicial = LocalTime.now();

        
        System.out.printf("Escribe el resultado de sumar %d y %d: ", num1, num2);
        int sumaUsuario = sc.nextInt();
        sc.close();
        LocalTime horaFinal = LocalTime.now();

        do {
            if (sumaUsuario == num1 + num2) {
                System.out.println("Enhorabuena!! Has acertado!!");
                System.out.printf("Has tardado %d segundos %n", horaFinal.toSecondOfDay() - horaInicial.toSecondOfDay());
            } else {
                System.out.printf("ERROR!! El resultado era %d%n", num1 + num2);
            }
        } while (sumaUsuario == num1 + num2);
    }
}
