package ud6.apuntesstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class E1304 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            int rnd = (int) (Math.random() * 100 + 1);
            numeros[i] = rnd;
            listaNumeros.add(rnd);
        }

        System.out.println(Arrays.toString(numeros));
        Integer[] multiplos = filtrar(numeros, n -> n % 3 == 0);
        System.out.println(Arrays.toString(multiplos));

        List<Integer> pares = filtrar(listaNumeros, n -> n % 2 == 0);
        System.out.println(pares);
    }

    static <T> T[] filtrar(T[] t, Predicate<T> p) {
        T[] tn = Arrays.copyOf(t, 0);

        for (T e : t) {
            if (p.test(e)) {
                tn = Arrays.copyOf(tn, tn.length + 1);
                tn[tn.length - 1] = e;
            }
        }

        return tn;
    }

    static <T> List<T> filtrar(List<T> l, Predicate<T> p) {
        List<T> lista = new ArrayList<T>();
        for (T e : lista) {
            if (p.test(e)) {
                lista.add(e);
            }
        }
        return lista;
    }
}
