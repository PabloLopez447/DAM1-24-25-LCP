package ud2.ejemplos;

/*
* Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
* para valores de x desde 1 hasta 10
*/

public class EjemploBuclesAnidados3 {
    public static void main(String[] args) {
        int x, n;
        // mostrar la cabecera de la tabla
        System.out.printf("%10s%10s%10s%10s%n", "x", "x^2", "x^3", "x^4");
        for (x = 1; x <= 10; x++) { // filas
            for (n = 1; n <= 4; n++) { // columnas
                System.out.printf("%10.0f", Math.pow(x, n));
            } // fin del for para las columnas
            System.out.println();
        } // fin del for para las filas
    }
}
