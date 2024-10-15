package ud1.ejercicios;

/* Desarrolla un programa en Java que convierta unidades de presión entre pascales (Pa), atmósferas (atm) y milímetros de mercurio (mmHg). 
El usuario deberá ingresar la presión y las unidades de origen y destino.

1 atm = 101,325 Pa
1 atm = 760 mmHg
El programa deberá realizar la conversión correcta según los datos ingresados. */

import java.util.Scanner;

public class EP0135 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double PA = 101.35; // 1 atm = Pa
        final double MMHG = 760; // 1 atm = mmHg

        System.out.print("Introduzca la presión: ");
        double presion = scanner.nextDouble();
        System.out.print("Introduzca la unidad de origen (0 = Pa, 1 = atm, 2 = mmHg): ");
        int uOrigen = scanner.nextInt();
        System.out.print("Introduzca la unidad de destino (0 = Pa, 1 = atm, 2 = mmHg): ");
        int uDestino = scanner.nextInt();
        scanner.close();

        // Calculos de conversión
        double presionFinal = (uOrigen == 0) ? 
                                (uDestino == 0) ? (presion) : // pascales a pascales
                                (uDestino == 1) ? (presion / PA) : // pascales a atmósferas
                                (presion / PA * MMHG): // pascales a milímetros de mercurio

                             (uOrigen == 1) ?
                                (uDestino == 0) ? (presion * PA) : // atmósferas a pascales
                                (uDestino == 1) ? (presion) : // atmósferas a atmósferas
                                (presion * MMHG):  // atmósferas a milímetros de mercurio

                                (uDestino == 0) ? (presion / MMHG): // mmHg a atmósferas
                                (uDestino == 1) ? (presion / MMHG * PA): // mmHg a pascales
                                (presion); // mmHg a mmHg

        // Cambiar la unidad en el print 
        String uOrigenStr = (uOrigen == 0) ? "pascales" :
                            (uOrigen == 1) ? "atmósferas" :
                                             "milímetros de mercurio";
        
        String uDestinoStr = (uDestino == 0) ? "pascales" :
                             (uDestino == 1) ? "atmósferas" :
                                              "milímetros de mercurio";

        System.out.printf("%.2f %s son %.2f %s", presion, uOrigenStr, presionFinal, uDestinoStr);
    }
}