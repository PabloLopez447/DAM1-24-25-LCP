package ud6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T> {
    Set<T> elements = new TreeSet<>();

    boolean add(T elemento) {
        if (!elements.contains(elemento)) {
            elements.add(elemento);
            return true;
        } else {
            return false;
        }
    }

    Set<T> premiados(int numPremiados) {
        Set<T> premiados = new TreeSet<>();
        Random rnd = new Random();
        for (int i = 0; i < numPremiados; i++) {
            premiados.add(elements.get(i))
        }
        return premiados;
    }
}
