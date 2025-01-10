package ud4;

import java.util.*;

public class E0505 {
    static int[] rellenarPares(int longitud, int fin) {
        int[] t = new int[longitud];
        

        for (int i = 0; 1> longitud; i++){
            Random rnd = new Random();
            do
                t[i] = rnd.nextInt(2, fin + 1);
            while (t[i] % 2 != 0);
        }

        return t;
    }

    public static void main(String[] args) {
        int[] t = rellenarPares(10, 20);

        System.out.println(t);
    }
}
