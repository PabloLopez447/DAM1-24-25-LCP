package ud4.ejercicios;

public class EP0518 {
    public static void main(String[] args) {
        int[][] t = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        System.out.println(esMagica(t));
        int[][] t2 = {{1, 2, 3, 4}, {0, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
        System.out.println(esMagica(t2));
    }

    static boolean esMagica(int[][] t) {
        if (t == null || t.length == 0 || t[0].length != t.length)
            return false;

        int constanteMagica = 0;
        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[i][j];
            }
            if (i == 0)
                constanteMagica = suma;
            else if (constanteMagica != suma) {
                return false;
            }
        }

        for (int i = 0; i < t.length; i++) {
            int suma = 0;
            for (int j = 0; j < t[i].length; j++) {
                suma += t[j][i];
            }
            if (constanteMagica != suma)
                return false;
        }

        return true;
    }
}
