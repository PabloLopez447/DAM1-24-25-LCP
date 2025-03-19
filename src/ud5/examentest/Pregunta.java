package ud5.examentest;

import java.util.Arrays;

public class Pregunta {
    String enunciado;
    String[] listaOpciones;
    int indice;

    public Pregunta(String enunciado, String[] listaOpciones, char indice) {
        if (listaOpciones == null || listaOpciones.length < 2) {
            throw new IllegalArgumentException("Debe haber al menos 2 opciones");
        }

        if (indice < 0 || indice > listaOpciones.length) {
            throw new IllegalArgumentException("Indice incorrecto");
        }
        this.enunciado = enunciado;
        this.listaOpciones = listaOpciones;
        this.indice = indice;
    }

    boolean corregir(int indiceRespuesta) {
        if (indiceRespuesta == this.indice) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String enun = enunciado + "\n";
        char letra = 'a';

        for (int i = 0; i < this.listaOpciones.length; i++) {
            enun += letra + ") " + listaOpciones[i] + "\n";
            letra++;
        }

        return enun;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pregunta other = (Pregunta) obj;
        if (enunciado == null) {
            if (other.enunciado != null)
                return false;
        } else if (!enunciado.equals(other.enunciado))
            return false;
        if (!Arrays.equals(listaOpciones, other.listaOpciones))
            return false;
        return true;
    }

}
