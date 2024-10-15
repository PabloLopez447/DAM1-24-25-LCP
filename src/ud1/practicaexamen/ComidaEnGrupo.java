package ud1.practicaexamen;

/* Un grupo de personas salen a comer juntas. Al terminar piden la cuenta conjunta. Haz un
programa que tenga como entrada el número de personas y el importe total de la comida,
que podrá tener decimales, y que tenga como salida la cantidad a pagar por cada comensal
que se presentará con hasta 2 decimales. */

import java.util.Scanner;

public class ComidaEnGrupo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Número de personas: ");
        int npersonas = scanner.nextInt();
        System.out.print("Importe total de la comida (€): ");
        double importe = scanner.nextDouble();
        scanner.close();

        double individual = importe / npersonas;

        System.out.printf("Cantidad a pagar por comensal: %.2f €", individual);


    }
}