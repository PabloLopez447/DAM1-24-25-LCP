package ud2.lcpexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

//Pablo López Couso

public class MenuFiguras {
    public static void main(String[] args) {
        int opcion;
        int ncol = 0, nfilas = 0;
        Scanner sc = new Scanner(System.in);

        do {
            mostrarMenu();
            System.out.print("Escoje una opcion: ");
            opcion = leerEntero(sc);
            switch (opcion) {
                case 0:
                    System.out.println("Mensaje de despedida");
                    break;
                case 1:
                    System.out.print("Introduce el numero de filas del triangulo: ");
                    nfilas = leerEntero(sc);
                    dibujarTriangulo(nfilas);
                    break;
                case 2:
                    System.out.print("Introduce el numero de filas del rectangulo: ");
                    nfilas = leerEntero(sc);
                    System.out.print("Introduce el numero de columnas del rectangulo: ");
                    ncol = leerEntero(sc);
                    dibujarRectangulo(ncol, nfilas);
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
        sc.close();

    }

    public static void mostrarMenu() {
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. Salir");
    }

    public static void dibujarTriangulo(int nfilas) {

        if (nfilas >= 2 && nfilas <= 20)
            for (int n = 0; n < nfilas; n++) {
                for (int i = 0; i <= n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        else {
            System.out.println("Mensaje de despedida");
        }
    }

    public static void dibujarRectangulo(int nfilas, int ncol) {
        if (nfilas >= 2 && nfilas <= 20 && ncol >= 2 && ncol <= 20) {

            for (int n = 0; n < ncol; n++) {
                System.out.println();
                for (int i = 0; i < nfilas; i++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        } else {
            System.out.println("Mensaje de despedida");
        }
    }

    public static int leerEntero(Scanner scanner) {
        int contadorErrores = 0;
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un número entero, no letras u otros caracteres.");
            scanner.next();
            contadorErrores++;
            System.out.println("Llevas " + contadorErrores + " errores");
            return leerEntero(scanner);
        }
    }
}
