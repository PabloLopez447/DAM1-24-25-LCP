package ud1.lcpexamen;

/**
 * Diseña un programa que calcule el área y el perímetro de un terreno con la forma de la
 * figura a partir de los datos de largo y ancho que se introducirán por teclado en metros.
 * Utiliza para los cálculos las fórmulas de área y perímetro de un círculo:
 * 
 * Área círculo = PI x R^2
 * Perímetro círculo = 2 X PI x R
 * 
 * Siendo R el radio del círculo
 * 
 * En dicho terreno se pretende organizar una media maratón, es decir, una carrera en la que
 * los participantes deberán correr una distancia de 21.097 metros. El programa deberá
 * calcular y mostrar el número de vueltas completas que deberán dar los participantes y el
 * número de metros “sobrantes” redondeando hacia arriba.
 */

// Pablo López Couso

import java.util.Scanner;

public class AreaPerimetroVueltas {
    public static void main(String[] args) {
        double largo, ancho, radio, baseRec, aCirc, aRec, aTot, pCirc, pTot, nVueltas, mRest, aprox;
        final double mMaraton = 21.097;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el largo del terreno: ");
        largo = sc.nextDouble();
        System.out.print("Introduce el ancho del terreno: ");
        ancho = sc.nextDouble();
        sc.close();

        radio = ancho / 2;
        baseRec = largo - radio;
        aRec = ancho * baseRec;
        aCirc = Math.PI * Math.pow(radio, 2);
        aTot = aRec + aCirc;

        pCirc = 2 * Math.PI * radio;
        pTot = pCirc + (2 * baseRec);

        nVueltas = (int) pTot / mMaraton;
        mRest = pTot % mMaraton;
        aprox =  Math.round(mRest * 100) / 100;

        System.out.printf("El área del terreno es de %.2f metros", aTot);
        System.out.printf(" y el perímetro del terreno es de %.2f metros", pTot);
        System.out.println("Se podran dar " + nVueltas + " y sobraran " + aprox);

    }
}
