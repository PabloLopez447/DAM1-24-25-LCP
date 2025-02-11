package ud4;

import java.util.*;

public class E0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase1 = sc.nextLine();
        System.out.print("Introduce otra frase: ");
        String frase2 = sc.nextLine();
        sc.close();

        if (frase1.length() == frase2.length()) {
            System.out.println("Las dos frases son igual de largas");
        } else if (frase1.length() < frase2.length()) {
            System.out.println("La segunda frase es más larga");
        } else{
            System.out.println("La primera frase es más larga");

        }
    }
}
