package ud2.ejemplos;

/*
* Programa que pide una nota por teclado y muestra dos mensajes si la nota es
* mayor o igual que 5
*/

import java.util.*;

public class CondicionalSimple1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        sc.close();
        
        if (nota >= 5) {// ----------------------Inicio de la condición
            System.out.println("Enhorabuena!!");
            System.out.println("Has aprobado");
        } // -------------------------------------Fin de la condición
        System.out.println("Hasta Pronto!");
    }
}
