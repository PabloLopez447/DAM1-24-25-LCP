package ud4.abpexamen;

//Pablo López Couso

public class ComplejidadCiclomatica {
    public static void main(String[] args) {
        int[][] grafo1 = {
                { 1 },
                { 3, 5 },
                { 1 },
                { 2, 4 },
                { 6 },
                { 6 },
                {}
        };
        int[][] grafo2 = {
                { 1, 6 },
                { 2, 5 },
                { 3, 4 },
                { 4 },
                { 1 },
                { 0 },
                {}
        };

        System.out.println(complejidadCiclomatica(grafo1));
        System.out.println(complejidadCiclomatica(grafo2));
    }

    static int complejidadCiclomatica(int[][] grafo) {
        int complejidadCiclomatica = 0;
        int nNodosP = 0;

        for (int i = 0; i < grafo.length; i++) {
            if (grafo[i].length >= 2) {
                nNodosP++;
            }
        }
        complejidadCiclomatica = nNodosP + 1;
        return complejidadCiclomatica;
    }
}