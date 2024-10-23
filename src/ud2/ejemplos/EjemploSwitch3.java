package ud2.ejemplos;

//Programa que pide dos números y un operador y muestra el resultado de la operación
import java.util.*;
import java.io.*;

public class EjemploSwitch3 {
    public static void main(String[] args) throws IOException {
        int A, B, Resultado = 0;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        sc.close();
        System.out.print("Introduzca un operador (+,-,*,/):");
        operador = (char) System.in.read();
        switch (operador) {
            case '-':
                Resultado = A - B;
                break;
            case '+':
                Resultado = A + B;
                break;
            case '*':
                Resultado = A * B;
                break;
            case '/':
                if (B != 0) {
                    Resultado = A / B;
                } else {
                    System.out.println("\nNo se puede dividir por cero");
                    calculado = false;
                }
                break;
            default:
                System.out.println("\nOperador no valido");
                calculado = false;
        }
        if (calculado) {
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
