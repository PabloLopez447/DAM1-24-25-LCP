package ud2.ejercicios;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos).
 */

 import java.util.*;

public class E0212 {
    public static void main(String[] args) {
        int dia, mes, anho;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un nombre de dia: ");
        dia = sc.nextInt();
        System.out.print("Introduzca un nombre de mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca un nombre de año: ");
        anho = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28 :
                System.out.println("La fecha es correcta");
                break;
            case 29, 30:
                if (mes != 2) {
                    System.out.println("La fecha es correcta");
                }
                else {
                    System.out.println("la fecha no es correcta");
                }
            case 31: 
                if (mes == )
            default:
                break;
        }

    }
}
