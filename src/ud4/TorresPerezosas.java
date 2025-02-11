package ud4;

public class TorresPerezosas {
    public static void main(String[] args) {
        char[][] tablero1 = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };

        char[][] tablero2 = {
                {'.', '.', '.'},
                {'X', '.', '.'},
                {'.', '.', '.'}
        };


        System.out.println(caminosDistintos(tablero1)); // 6
        System.out.println(caminosDistintos(tablero2)); // 3

    }

    private static int caminosDistintos(char[][] t) {
        int numCaminos = 0;



        return numCaminos;
    }


}
