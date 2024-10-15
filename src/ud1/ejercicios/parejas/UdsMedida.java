// Eloy Eidon Loira (piloto) y Saul Fernandez Salgado (copiloto)
package ud1.ejercicios.parejas;

import java.util.Scanner;

/**
 * UdsMedida
 */
public class UdsMedida {

    public static void main(String[] args) {
        double ht;
        double m2CamposFutbol = 105 * 70;
        double m2CanchasBaloncesto = 28 * 15;
        double m2PistasTenis = 23.77 * 10.97;
        double m2ParquesRetiro = 125 * 10000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de hectareas");
        ht = sc.nextDouble();
        sc.close();
        double m2 = ht * 10000;

        double numCamposFutbol = m2 / m2CamposFutbol;
        double numCanchasBaloncesto = m2 / m2CanchasBaloncesto;
        double numPistasTenis = m2 / m2PistasTenis;
        double numParquesRetiro = m2 / m2ParquesRetiro;

        System.out.printf("%.2f hectáreas es igual a ");
        System.out.printf("%.2f campos de fútbol\n", ht, numCamposFutbol);
        System.out.printf("%.2f canchas de baloncesto\n", ht, numCanchasBaloncesto);
        System.out.printf("%.2f pistas de tenis\n", ht, numPistasTenis);
        System.out.printf("%.2f parques de retiro\n", ht, numParquesRetiro);
    }
}