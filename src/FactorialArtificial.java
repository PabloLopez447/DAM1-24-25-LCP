public class FactorialArtificial {

    // Método para calcular el factorial con complejidad artificial
    public static int factorial(int n) {
        int resultado = 1;

        // Realizamos llamadas innecesarias dentro de un bucle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Simulamos un cálculo innecesario en cada iteración
                if (i == n && j == n) {
                    resultado = 1;
                    for (int k = 1; k <= i; k++) {
                        resultado *= k; // Calculamos el factorial solo al final
                    }
                }
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}

/*
 * La función tiene un problema de complejidad artificial.
 * Aqui esta una posible solucion
 * 
 * public class FactorialOptimo {

    // Método para calcular el factorial de manera eficiente
    public static int factorial(int n) {
        int resultado = 1;

        // Calculamos el factorial de manera directa
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
}

 */