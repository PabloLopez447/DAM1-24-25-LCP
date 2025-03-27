package ud4.lcpexamenrec;

import java.util.Arrays;

// Pablo López Couso
public class Sumas {
    public static void main(String[] args) {
        int[] t = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(t));
        System.out.println();
        System.out.println(Arrays.toString(sumas(t)));
    }

    static int[] sumas(int t[]) {
        if (t == null) {
            return null;
        }
        int[] sumas = new int[3];
        int suma = 0;
        int sumapar = 0;
        int sumaimpar = 0;

        for (int i = 0; i < t.length; i++) {
            if (t[i] % 2 == 0) {
                sumapar += t[i];
            } else {
                sumaimpar += t[i];
            }
            suma += t[i];
        }

        sumas[0] = suma;
        sumas[1] = sumapar;
        sumas[2] = sumaimpar;
        return sumas;
    }
}
