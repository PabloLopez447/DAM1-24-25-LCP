package ud1.parejas;

import java.util.Scanner;

/** 
 * Pablo López Couso - Piloto 
 * Antonio Besada Ramilo - Copiloto
*/

public class RecetasIngredientes {
    public static void main(String[] args) {
        double nPersonas, manzana1p, agua1p, azucar1p, manzanaT, azucarT, aguaT;

        Scanner sc = new Scanner(System.in);

        manzana1p = 1500 / 6;
        agua1p = 330 / 6;
        azucar1p = 120 / 6;

        System.out.println("RECETA COMPOTA DE MANZANA");
        System.out.println("(https://www.recetasderechupete.com/compota-de-manzana-casera/12509/)");
        System.out.print("Introduzca el nº de personas para el que esta destinada la receta: ");
        nPersonas = sc.nextDouble();
        sc.close();
        
        manzanaT = manzana1p * nPersonas;
        aguaT = agua1p * nPersonas;
        azucarT = azucar1p * nPersonas;

        System.out.println("Para " + nPersonas + " personas necesitara: ");
        System.out.println(manzanaT + " g. de manzanas");
        System.out.println(aguaT + " ml. de agua");
        System.out.println(azucarT + " g. de azucar");

    }
}
