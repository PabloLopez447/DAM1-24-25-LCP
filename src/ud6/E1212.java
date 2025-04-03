package ud6;

import java.util.Set;
import java.util.TreeSet;

public class E1212 {
    public static void main(String[] args) {

    }

    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> union = new TreeSet<>();

        union.addAll(conjunto1);
        union.addAll(conjunto2);

        return union;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> interseccion = new TreeSet<>();
        interseccion.addAll(conjunto1);
        interseccion.retainAll(conjunto2);
        return interseccion;
    }

    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> excepcion = new TreeSet<>();

        excepcion.addAll(conjunto1);
        excepcion.removeAll(conjunto2);

        return excepcion;
    }


}
