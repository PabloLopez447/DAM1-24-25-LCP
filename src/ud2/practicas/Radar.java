package ud2.practicas;

import java.util.Scanner;

public class Radar {

    public static void main(String[] args) {
        final double DISTANCIA_KM = 10;
        final int VELOCIDAD_MAXIMA = 120;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los segundos que tardó en recorrer la distancia:");
        int tiempoSegundos = sc.nextInt();
        sc.close();

        int multaAplicada = calcularMulta(VELOCIDAD_MAXIMA,
                calcularExcesoVelocidad(DISTANCIA_KM, tiempoSegundos, VELOCIDAD_MAXIMA));
        if (multaAplicada == 0) {
            System.out.println("Velocidad dentro del límite.");
        } else {
            System.out.println("¡Infracción por exceso de velocidad! Multa de " + multaAplicada + " euros.");
        }
    }

    public static int calcularExcesoVelocidad(double distanciaKm, int tiempoSegundos, int velocidadLimite) {
        int excesoVelocidad = 0;
        double velocidad = distanciaKm / (tiempoSegundos / 3600.0);
        if (velocidad > velocidadLimite) {
            excesoVelocidad = (int) (velocidad - velocidadLimite);
        }
        return excesoVelocidad;
    }

    public static int calcularMulta(int velocidadLimite, int excesoVelocidad) {
        int multa = 0;
        if (velocidadLimite <= 50 && excesoVelocidad > 0) {
            if (excesoVelocidad <= 20) {
                multa = 100;
            } else if (excesoVelocidad <= 30) {
                multa = 300;
            } else if (excesoVelocidad <= 40) {
                multa = 400;
            } else if (excesoVelocidad <= 50) {
                multa = 500;
            } else {
                multa = 600;
            }
        } else if (velocidadLimite >= 60 && excesoVelocidad > 0) {
            if (excesoVelocidad <= 30) {
                multa = 100;
            } else if (excesoVelocidad <= 50) {
                multa = 300;
            } else if (excesoVelocidad <= 60) {
                multa = 400;
            } else if (excesoVelocidad <= 70) {
                multa = 500;
            } else {
                multa = 600;
            }
        }
        return multa;
    }
}
