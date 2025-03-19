package ud5.examentest;

import java.util.Arrays;
import java.util.Comparator;

public class Examen {
    String titulo;
    Pregunta[] preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
    }

    void addPregunta(Pregunta p) {
        if (Arrays.binarySearch(preguntas, p, Comparator.comparing(Pregunta::toString)) >= 0) {
            System.out.println("La pregunta ya está en el examen.");
            return;
        }
        preguntas = Arrays.copyOf(preguntas, preguntas.length + 1);
        preguntas[preguntas.length - 1] = p;
    }

    int numPreguntas(Pregunta[] p) {
        return p.length;
    }

    @Override
    public String toString() {
        String enun = titulo + "\n";

        for (int i = 0; i < this.preguntas.length; i++) {
            enun += preguntas[i] + "\n";
        }
        return enun;
    }

}