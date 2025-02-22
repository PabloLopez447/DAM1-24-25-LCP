package ud4.ejercicios;

/**
 * ConceptosProgramacion.java
 * Los siguientes términos corresponden a conceptos que el alumnado de
 * programación en
 * Java debe conocer:
 * "Algoritmo",
 * "Lenguaje de programación",
 * "Entorno de desarrollo",
 * "Compilación",
 * "Ejecución",
 * "Código fuente",
 * "Bytecode",
 * "Código objeto"
 * Realiza un programa que almacene los términos anteriores en un array de datos
 * de tipo
 * String y que muestre uno de ellos por pantalla elegido al azar.
 * Para ello implementa una función que devuelva uno de los términos del array
 * elegido al
 * azar, con el siguiente prototipo:
 * static String fraseAleatoria(String[] t
 */

public class ConceptosProgramacion {

    public static void main(String[] args) {

        String conceptos[] = { "Algoritmo",
                "Lenguaje de programación",
                "Entorno de desarrollo",
                "Compilación",
                "Ejecución",
                "Código fuente",
                "Bytecode",
                "Código objeto"
        };

        for (int i = 0; i < 100; i++) {
            System.out.println(fraseAleatoria(conceptos));
        }
    }

    static String fraseAleatoria(String[] t) {
        return (t[(int) (Math.random() * t.length)]);
    }

}
