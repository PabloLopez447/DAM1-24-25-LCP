package ud1.lcpexamen;

/**
 * Tres amig@s deciden juntar el dinero en efectivo que llevan encima para comprar un
 * artículo para compartir (por ejemplo, una pelota, un libro, un disco, etc.). Haz un programa
 * que permita introducir el precio del artículo (en euros) y el dinero que aporta cada amig@ y
 * que informe si el dinero aportado es suficiente o no para adquirir el artítulo.
 * 
 * Si el dinero no es suficiente el programa informará de cuánto falta, y si sobra, se indicará el
 * importe del dinero sobrante que guardará como bote para futuras compras conjuntas.
 */

// Pablo López Couso

import java.util.Scanner;

public class CompraConjunta {
    public static void main(String[] args) {
        double precioArt, din1, din2, din3, precioTot, dinSobra, dinFalta;
        String suficiente, dinExtra;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del artículo a comprar: ");
        precioArt = sc.nextDouble();
        System.out.print("Intoduce lo que pagará el primero de vosotros: ");
        din1 = sc.nextDouble();
        System.out.print("Intoduce lo que pagará el segundo de vosotros: ");
        din2 = sc.nextDouble();
        System.out.print("Intoduce lo que pagará el tercero de vosotros: ");
        din3 = sc.nextDouble();
        sc.close();

        precioTot = din1 + din2 + din3;
        suficiente = precioTot >= precioArt ? "Teneis suficiente dinero" : "No teneis suficiente dinero";

        dinSobra = precioTot - precioArt;
        dinFalta = precioArt - precioTot;
        dinExtra = precioTot >= precioArt ? "Os sobran " + dinSobra + " euros" : "Os faltan " + dinFalta + " euros";

        System.out.println(suficiente);
        System.out.println(dinExtra);

    }
}
