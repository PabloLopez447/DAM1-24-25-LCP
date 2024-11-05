package ud2.ejemplos;

// Rectángulo sólido de asteriscos.
import java.util.Scanner;

public class EjemploBuclesAnidados1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        // leer número de filas hasta que sea un número > 1
        do {
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        } while (filas < 2);
        // leer número de columnas hasta que sea un número > 1
        do {
            System.out.print("Introduce número de columnas: ");
            columnas = sc.nextInt();
        } while (columnas < 2);
        for (int i = 1; i <= filas; i++) { // for para las filas
            for (int j = 1; j <= columnas; j++) { // for para las columnas
                System.out.print(" * ");
            } // fin del for para las columnas
            System.out.println();
        } // fin del for para las filas
        sc.close();
    }
}