package ud6.apuntesstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class E1305 {
    public static void main(String[] args) {
                Random rng = new Random();

        List<Double> l1 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            l1.add(rng.nextDouble(100)+1);
        }

        Function<Double,Double> f = i -> Math.sqrt(i);

        List<Double> l2 = new ArrayList<>(transformar(l1, f));
        System.out.println(l2);
    }

    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {
        List<V> lista = new ArrayList<>();
        for (T n : t) {
            lista.add(f.apply(n));
        }
        return lista;
    }

}
