package ud4;

public class MontanaRusa {
    public static void main(String[] args) {
        int[] t = { 4, 10, 10, 3, 2 };
        System.out.println(contarPicos(t));

    }

    static int contarPicos(int[] alturas) {
        int nPicos = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (i == 0) {
                if (alturas[0] > alturas[1] && alturas[0] > alturas[alturas.length]) {
                    nPicos++;
                }
            } else if (i == alturas.length - 1) {
                if (alturas[alturas.length - 1] > alturas[alturas.length - 2]
                        && alturas[alturas.length - 1] > alturas[0]) {
                    nPicos++;
                }
            } else if (alturas[i] > alturas[i + 1] && alturas[i] > alturas[i - 1]) {
                nPicos++;
            }
        }

        return nPicos;
    }

}
