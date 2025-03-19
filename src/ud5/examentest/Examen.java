package ud5.examentest;

import java.util.Arrays;

public class Examen {
    String titulo;
    Pregunta[] preguntas;

    public Examen(String titulo) {
        this.titulo = titulo;
    }

    void addPregunta(Pregunta p) {
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