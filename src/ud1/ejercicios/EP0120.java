package ud1.ejercicios;

import java.util.Scanner;

/**
 * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €.
 * En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
 */

public class EP0120 {
    public static void main(String[] args) {
        int nMenores, nMayores;
        double precioTot, precioDesc;
        final double PRECIOMENORES = 15.50;
        final double PRECIOMAYORES = 20;
        final double DESCUENTO = 0.05;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de entradas infantiles: ");
        nMenores = sc.nextInt(); 
        System.out.print("Introduzca el numero de entradas de adultos: ");
        nMayores = sc.nextInt();
        sc.close();

        precioTot = (PRECIOMENORES*nMenores) + (PRECIOMAYORES*nMayores);

        precioDesc = precioTot >= 100 ? precioTot * (precioTot * DESCUENTO) : precioTot;

        System.out.println("El precio a pagar es: " + precioDesc);
    }
}
