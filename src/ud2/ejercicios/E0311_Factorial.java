package ud2.ejercicios;

import java.util.Scanner;

public class E0311_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número: ");
        int n = sc.nextInt();
        sc.close();

        int factorial = 1;
        for (int i = n; i > 1; i--){
            factorial *= i;
        }

        System.out.printf("El factorial de %s es %s %n", n, factorial);

    }
}
