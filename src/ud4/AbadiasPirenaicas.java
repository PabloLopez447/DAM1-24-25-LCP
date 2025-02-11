package ud4;

import java.util.*;

public class AbadiasPirenaicas {
    public static void main(String[] args) {
        int[] montanasCordillera = new int[0];
        int montanasValidas = 0;
        getMontanasAbadias(montanasCordillera);

        for (int i = montanasCordillera.length; i >= 0; i--){

        }
    }

    static int[] getMontanasAbadias(int[] montanasCordillera) {
        Scanner sc = new Scanner(System.in);
        int montaña = 0, numMontañas = 0;
        do {
            System.out.print("Introduce la altura de la montaña: ");
            montaña = sc.nextInt();
            montanasCordillera = Arrays.copyOf(montanasCordillera, montanasCordillera.length + 1);
            montanasCordillera[montanasCordillera.length - 1] = montaña;
            numMontañas++;
        } while (montaña != -1 || numMontañas >= 1000);
        sc.close();
        return montanasCordillera;
    }
}
