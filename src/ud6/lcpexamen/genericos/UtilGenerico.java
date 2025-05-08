package ud6.lcpexamen.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Pablo López Couso

public class UtilGenerico<T> {

    public List<T> repetidos(List<T> lista) {
        Set<T> set = new HashSet<>(lista);
        List<T> listaRepetidos = new ArrayList<>(lista);
        listaRepetidos.removeAll(set);
        return listaRepetidos;
    }

    public Collection<T> filtrarMayores(Collection<T> col, T t, Comparator<T> c) {
        List<T> lista = new ArrayList<>();
        for (T t2 : col) {
            if (c.compare(t2, t) >= 0) {
                lista.add(t2);
            }
        }
        return lista;
    }

}
