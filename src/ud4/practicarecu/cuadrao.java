package ud4.practicarecu;

public class cuadrao {

    static String[][] cuadrao = new String[5][5];

    public static void main(String[] args) {
        llenar();
        paroimpar();
        esquinas();
        imprimirMatriz(cuadrao);
    }

    public static void llenar() {
        for (int i = 0; i < cuadrao.length; i++) {
            for (int j = 0; j < cuadrao[i].length; j++) {
                cuadrao[i][j] = "@";
            }
        }
    }

    public static void esquinas() {
        cuadrao[0][0] = "A";
        cuadrao[0][cuadrao[0].length - 1] = "A";
        cuadrao[cuadrao.length - 1][0] = "A";
        cuadrao[cuadrao.length - 1][cuadrao[0].length - 1] = "A";
    }

    public static void paroimpar() {
        int mitad = cuadrao.length / 2;
        if (cuadrao.length % 2 == 0) {
            cuadrao[mitad][mitad] = "x"; // abajo derecha
            cuadrao[mitad - 1][mitad] = "x"; // arriba derecha
            cuadrao[mitad][mitad - 1] = "x"; // abajo izq
            cuadrao[mitad - 1][mitad - 1] = "x"; // arriba izq

        } else {
            cuadrao[mitad][mitad] = "x";
        }
    }

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
