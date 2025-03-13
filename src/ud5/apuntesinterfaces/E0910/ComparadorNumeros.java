package ud5.apuntesinterfaces.E0910;

import java.util.Arrays;
import java.util.Comparator;

public class ComparadorNumeros {
    public static void main(String[] args) {
        Integer[] n = { 1, 3, 5, 9, 2, 4, 6, 8 };

        System.out.println(Arrays.toString(n));

        Arrays.sort(n, Comparator.reverseOrder());
        System.out.println(Arrays.toString(n));
    }

}
