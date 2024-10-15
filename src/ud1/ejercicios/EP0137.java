package ud1.ejercicios;

/* Repite el programa anterior intentando generalizar su aplicación a conversiones entre euros y cualquier otra moneda cuyo 
nombre y valor deberá introducir por teclado el usuario. */

import java.util.Scanner;

public class EP0137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("\nIntroduzca la cantidad de dinero: ");
        double dinero = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer y evitar problemas al leer cadenas

        System.out.print("\nIntroduzca la moneda de origen (en singular y minúsculas): " );
        String monedaOrigen = scanner.nextLine();
        System.out.print("\nIntroduzca la moneda de destino (en singular y minúsculas): " );
        String monedaDestino = scanner.nextLine();

        String moneda = (monedaOrigen.equals("euro")) ? monedaDestino : monedaOrigen;

        System.out.printf("\nIntroduzca cuántos %s son 1 euro: ", moneda);
        double valor = scanner.nextDouble();
        scanner.close();

        double conversion = (monedaOrigen.equals("euro")) ? (dinero * valor) : (dinero / valor);

        System.out.printf("\n%.2f %s son %.2f %s", dinero, monedaOrigen, conversion, monedaDestino);
    }
}