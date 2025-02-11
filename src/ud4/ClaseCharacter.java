package ud4;

import java.util.*;

public class ClaseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un caracter: ");
        Character chara = sc.nextLine().charAt(0);
        sc.close();

        if (Character.isDigit(chara)) {
            System.out.println(chara + " es un digito");
        } else if (Character.isLetter(chara)) {
            System.out.println(chara + " es una letra");
        } else if (Character.isWhitespace(chara)) {
            System.out.println(" es un espacio en blanco");
        }

        if (Character.isLetter(chara) && Character.isUpperCase(chara)) {
            System.out.println(chara + " es mayúscula este es su equivalente minúscula: " + Character.toLowerCase(chara));
        } else if (Character.isLetter(chara) && Character.isLowerCase(chara)) {
            System.out.println(chara + " es minúscula este es su equivalente mayúscula: " + Character.toUpperCase(chara));
        }
    }
}
