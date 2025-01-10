package ud4;

import java.util.*;

public class EP0512_Desordenar {

    static void desordenar(int t[]) {
        for (int i = 1; i < t.length; i++) {
            Random rnd = new Random();
            t[i] = t[rnd.nextInt(t.length)];
        }
    }
    public static void main(String[] args) {
        int t[] = ArraysUtil.arrayAleatorio(6, 0, 9);
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        desordenar(t);
        System.out.println(Arrays.toString(t));
    }

}
