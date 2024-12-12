package ud2.practicas;

import java.util.Scanner;

public class CalculadoraHumana {

    public static final int NUM_OPERACIONES = 7;
    public static final int NUM_FALLOS_MAX = 3;
    public static final int LIMITE_OPERANDOS = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aciertos = 0;
        int fallos = 0;
        int operando1 = generarNumeroAleatorio(1, LIMITE_OPERANDOS);

        while (aciertos < NUM_OPERACIONES && fallos < NUM_FALLOS_MAX) {
            char operador = generarOperadorAleatorio();
            int operando2 = generarOperando2(operando1, operador);
            if (operando2 == -1)
                continue;

            int resultadoCorrecto = calcularResultado(operando1, operando2, operador);
            System.out.printf("Resuelve: %d %c %d = ?%n", operando1, operador, operando2);

            while (true) {
                try {
                    System.out.print("Tu respuesta: ");
                    int respuesta = sc.nextInt();
                    if (respuesta == resultadoCorrecto) {
                        System.out.println("¡Correcto!");
                        aciertos++;
                        operando1 = resultadoCorrecto;
                        break;
                    } else {
                        System.out.println("Incorrecto. Intenta nuevamente.");
                        fallos++;
                        if (fallos >= NUM_FALLOS_MAX) {
                            break;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingresa un número entero.");
                    sc.next();
                }
            }
        }

        if (aciertos == NUM_OPERACIONES) {
            System.out.println("¡Felicidades! Has completado el juego.");
        } else {
            System.out.println("Juego terminado. Demasiados errores.");
        }
        sc.close();
    }

    public static char generarOperadorAleatorio() {
        int operador = generarNumeroAleatorio(0, 3);
        switch (operador) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/';
            default:
                return ' ';
        }
    }

    public static int generarOperando2(int operando1, char operador) {
        switch (operador) {
            case '+':
                return obtenerOperando2Suma(operando1);
            case '-':
                return obtenerOperando2Resta(operando1);
            case '*':
                return obtenerOperando2Multiplicacion(operando1);
            case '/':
                return obtenerOperando2Division(operando1);
            default:
                return 0;
        }
    }

    public static int calcularResultado(int operando1, int operando2, char operador) {
        switch (operador) {
            case '+':
                return operando1 + operando2;
            case '-':
                return operando1 - operando2;
            case '*':
                return operando1 * operando2;
            case '/':
                return operando1 / operando2;
            default:
                return 0;
        }
    }

    public static int obtenerOperando2Suma(int operando1) {
        return generarNumeroAleatorio(1, LIMITE_OPERANDOS - operando1);
    }

    public static int obtenerOperando2Resta(int operando1) {
        return generarNumeroAleatorio(1, operando1);
    }

    public static int obtenerOperando2Multiplicacion(int operando1) {
        int limite = LIMITE_OPERANDOS / operando1;
        return (limite > 0) ? generarNumeroAleatorio(1, limite) : -1;
    }

    public static int obtenerOperando2Division(int operando1) {
        for (int i = LIMITE_OPERANDOS; i > 0; i--) {
            if (operando1 % i == 0 && operando1 / i <= LIMITE_OPERANDOS) {
                return i;
            }
        }
        return 0;
    }

    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
