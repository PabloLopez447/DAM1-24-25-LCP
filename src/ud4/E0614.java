package ud4;

import java.util.*;

public class E0614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la palabra a desordenar: ");
        String palabra = sc.nextLine();
        String anagrama = desordenar(palabra);
        System.out.println(anagrama);
        System.out.println("Conociendo estas letras determina la palabra");
        String guess = sc.nextLine();
        comprobar(palabra, guess);
        sc.close();

    }

    static String desordenar(String palabra){
        char[] letras = palabra.toCharArray();
        Random rnd = new Random();
        for (int i = 0; i < letras.length; i++) {
            int nuevaPosicion = rnd.nextInt(letras.length);
            if (i != nuevaPosicion) {
                char aux = letras[i];
                letras[i] = letras[nuevaPosicion];
                letras[nuevaPosicion] = aux;
            }
        }
        String anagrama = String.valueOf(letras)
        return anagrama;
    }

    static void comprobar(String palabra, String intento) {
        if (palabra == intento) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Has fallado");
        }
    }
}
