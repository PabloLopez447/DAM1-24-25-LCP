package ud2.ejercicios;

/*
 *  Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
    fecha correspondiente al día siguiente.
 */

 import java.util.*;

public class E0214 {
    public static void main(String[] args) {
        int dia, mes, anho;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dia: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        anho = sc.nextInt();
        sc.close();

        dia++;
        switch (mes) {
            case 1,3,5,7,8,10:
                if (dia > 31){
                    dia = 1;
                    mes++;
                }
                break;
            case 2:
                if (dia > 28) {
                    dia = 1;
                    mes++;
                }
            case 4, 6, 9, 11:
                if (dia > 30) {
                    dia = 1;
                    mes++;
                }
            case 12:
                if (dia > 31) {
                    dia = 1;
                    mes = 1;
                    anho++;
                }
            default:
                break;
        }
        System.out.println("DIA: " + dia);
        System.out.println("MES: " + mes);
        System.out.println("AÑO: " + anho);
    }
}
