package ud4;

import java.util.*;

public class ConceptosProgramacion {
    public static void main(String[] args) {
        String[] concept = {
            "Algoritmo",
            "Lenguaje de programación",
            "Entorno de desarrollo",
            "Compilación",
            "Ejecución",
            "Código fuente",
            "Bytecode",
            "Código objeto"
        };

        System.out.println(Arrays.toString(concept));
        System.out.println();
        System.out.println(fraseRnd(concept));
    }

    static String fraseRnd (String concept[] ){
        String fraseRnd;
        Random rnd = new Random();

        fraseRnd = concept[rnd.nextInt(concept.length)];

        return fraseRnd;
    }

}