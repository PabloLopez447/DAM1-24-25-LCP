package ud2.ejercicios;

/**
 * Escribe un programa para emitir la factura de compra de un producto, introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100 euros se aplicará un descuento del 5%.

Ejemplos para pruebas:
Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €

 */

import java.util.*;

public class Factura {
    public static void main(String[] args) {
        double precio, precioTot, dinDescuento, precioFinal;
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;
        int nUds;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del artículo: ");
        precio = sc.nextDouble();
        System.out.print("Introduce el nº de unidades a comprar: ");
        nUds = sc.nextInt();
        sc.close();

        precioTot = (precio * nUds) + ((precio * nUds) * IVA);
        dinDescuento = precioTot * DESCUENTO;

        if (precioTot > 100) {
            precioFinal = precioTot - dinDescuento;
        } else {
            precioFinal = precioTot;
        }

        System.out.println("El precio a pagar es: " + precioFinal + " euros");
    }
}
