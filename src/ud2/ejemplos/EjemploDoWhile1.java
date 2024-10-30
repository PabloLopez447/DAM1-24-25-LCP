package ud2.ejemplos;

//Programa que pide un número menor o igual que 100
import java.util.Scanner;

public class EjemploDoWhile1 {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        do { // inicio del do .. while
            System.out.print("Introduce un número entero <= 100: ");
            valor = sc.nextInt();
            if (valor > 100) {
                System.out.println("Número no válido");
            }
        } while (valor > 100); // fin del do .. while
        System.out.println("Ha introducido: " + valor);
        sc.close();
    }
}
