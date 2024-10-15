package ud1.ejercicios;

/* Crea un programa en Java que convierta unidades de área entre metros cuadrados, hectáreas y pies cuadrados. 
El usuario deberá ingresar la cantidad de área y especificar las unidades de origen y destino.

1 hectárea = 10,000 metros cuadrados
1 metro cuadrado = 10.7639 pies cuadrados

El programa debe realizar la conversión y mostrar el resultado al usuario. */

import java.util.Scanner;

public class EP0132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        final double HECTAREA = 10000; // 1 hectárea = 10 000 metros cuadrados
        final double METROCUADRADO = 10.7639; // 1 metro cuadrado = 10.7639 pies cuadrados

        System.out.print("Introduzca el área: ");
        double area = scanner.nextDouble();
        System.out.print("Introduzca la unidad de origen (0 = m^2, 1 = Ha, 2 = pies^2): ");
        int uOrigen = scanner.nextInt();
        System.out.print("Introduzca la unidad de destino (0 = m^2, 1 = Ha, 2 = pies^2): ");
        int uDestino = scanner.nextInt();
        scanner.close();

        // Calculos de conversión
        double areaFinal = (uOrigen == 0) ? 
                            (uDestino == 0) ? area :            // m^2 a m^2
                            (uDestino == 1) ? area / HECTAREA : // m^2 a Ha
                            area * METROCUADRADO :              // m^2 a pies^2
                            
                          (uOrigen == 1) ? 
                            (uDestino == 0) ? area * HECTAREA :  // Ha a m^2
                            (uDestino == 1) ? area :             // Ha a Ha
                            area * HECTAREA * METROCUADRADO :    // Ha a pies^2

                          (uDestino == 0) ? area / METROCUADRADO : // pies^2 a m^2
                            (uDestino == 1) ? (area / METROCUADRADO) / HECTAREA : // pies^2 a Ha
                            area; // pies^2 a pies^2

        // Unidad de origen y destino en el formato de texto
        String uOrigenStr = (uOrigen == 0) ? "metros cuadrados" :
                            (uOrigen == 1) ? "hectáreas" :
                                             "pies cuadrados";
        
        String uDestinoStr = (uDestino == 0) ? "metros cuadrados" :
                             (uDestino == 1) ? "hectáreas" :
                                              "pies cuadrados";

        System.out.printf("%.2f %s son %.2f %s", area, uOrigenStr, areaFinal, uDestinoStr);
    }
}