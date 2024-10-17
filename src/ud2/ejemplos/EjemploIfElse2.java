package ud2.ejemplos;

/*
* Programa que pide un número por teclado y muestra si es par o impar
*/
import java.util.*;

public class EjemploIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número entero: ");
        num = sc.nextInt();
        sc.close();
        
        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
