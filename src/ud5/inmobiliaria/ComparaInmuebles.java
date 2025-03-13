package ud5.inmobiliaria;

import java.util.Comparator;

public class ComparaInmuebles implements Comparator {
    @Override
    public int compare(Object ob1, Object ob2) {
        return ((Inmueble) ob1).m2 - ((Inmueble) ob2).m2;
    }
}
