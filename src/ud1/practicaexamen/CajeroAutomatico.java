package ud1.practicaexamen;

/* Realiza un programa que simule el funcionamiento de un cajero automático. El programa
solicitará al usuario el importe en efectivo que desea retirar, que será un número entero de
euros (€). El programa calculará el número mínimo de billetes de 50, 20, 10 y 5 euros para
obtener dicho importe y presentará la información al usuario.

Si el importe introducido por el usuario no es múltiplo de 5 se informará también al usuario
del importe que el cajero no es capaz de satisfacer por no disponer de billetes de esa
cantidad. Por ejemplo, si el usuario introduce 78 €, el programa informará de que se
retirarán 75 € en los billetes que corresponda y que 3 € no se pueden retirar por no existir
billetes tan pequeños. */

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Importe en efectivo que desea retirar (€): ");
        int efectivo = scanner.nextInt();
        scanner.close();

        int resto = efectivo % 5;

        System.out.printf("\nSe retirarán %d euros", efectivo - resto);

        int billetes50 = efectivo / 50;
        efectivo %= 50; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 50
        int billetes20 = efectivo / 20;
        efectivo %= 20; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 20
        int billetes10 = efectivo / 10;
        efectivo %= 10; // Actualiza efectivo para calcular cuánto dinero queda después de sacar los billetes de 10
        int billetes5 = efectivo / 5;



        System.out.printf("\n%d billetes de 50 euros: ", billetes50);
        System.out.printf("\n%d billetes de 20 euros: ", billetes20);
        System.out.printf("\n%d billetes de 10 euros: ", billetes10);
        System.out.printf("\n%d billetes de 5 euros: ", billetes5);

        System.out.printf("\n\n%d euros no se retirarán por no haber billetes tan pequeños.", resto);
    }
}