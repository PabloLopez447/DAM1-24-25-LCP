package ud4.lcpexamenrec;

// Pablo López Couso
public class DiagonalesIguales {
    public static void main(String[] args) {
        int[][] t = new int[][] {
                { 1, 0, 1 },
                { 0, 1, 0 },
                { 1, 0, 1 },
        };
        System.out.println(diagonalesIguales(t));
    }

    static boolean diagonalesIguales(int[][] t) {
        if (t == null) {
            return false;
        }
        if (t.length != t[0].length) {
            return false;
        }
        if (t.length <= 0) {
            return false;
        }

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (i == j) {
                    suma1 += t[i][j];
                }
            }
        }

        for (int i = t.length - 1; i >= 0; i--) {
            for (int j = t.length - 1; j >= 0; j--) {
                if (i == j) {
                    suma2 += t[i][j];
                }
            }
        }

        if (suma1 == suma2) {
            return true;
        } else {
            return false;
        }
    }
}
