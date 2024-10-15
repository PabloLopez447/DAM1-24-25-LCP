package ud1.ejercicios;

import java.util.Scanner;

/**
 * Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
 * El número de hormigas capturadas (6 patas).
 * El número de arañas capturadas (8 patas).
 * El número de cochinillas capturadas (14 patas).
 * 
 * La aplicación debe mostrar el número total de patas.
 */

public class EP0117 {
    public static void main(String[] args) {
        final int PATASHORM = 6;
        final int PATASARA = 8;
        final int PATASCOCHI = 14;
        int nHorm, nAra, nCochi, patasHormTot, patasAraTot, patasCochiTot, patasTot;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nº de hormigas: ");
        nHorm = sc.nextInt();
        System.out.print("Introduce el nº de arañas: ");
        nAra = sc.nextInt();
        System.out.print("Introduce el nº de cochinillas: ");
        nCochi = sc.nextInt();
        sc.close();

        patasHormTot = nHorm * PATASHORM;
        patasAraTot = nAra * PATASARA;
        patasCochiTot = nCochi * PATASCOCHI;
        patasTot = patasHormTot + patasAraTot + patasCochiTot;

        System.out.println("nº total de patas de hormiga: " + patasHormTot);
        System.out.println("nº total de patas de hormiga: " + patasAraTot);
        System.out.println("nº total de patas de hormiga: " + patasCochiTot);
        System.out.println("nº total de patas entre todos es: " + patasTot);
    }
}
