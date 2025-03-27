package ud4.lcpexamenrec;

// Pablo López Couso
public class Vogais {
    public static void main(String[] args) {
        String frase = "PrOgramar en Java mentres fas piragüismo é complicado";
        char vocal = 'i';

        System.out.println(cambiaVogais(frase, vocal));
    }

    static String cambiaVogais(String str, char vogal) {
        String frase2 = "";
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚüÜ";
        for (int i = 0; i < str.length(); i++) {
            if (vocales.indexOf(str.charAt(i)) != -1) {
                if (Character.isUpperCase(str.charAt(i))) {
                    frase2 += Character.toUpperCase(vogal);

                } else {
                    frase2 += vogal;
                }
            } else {
                frase2 += str.charAt(i);
            }

        }

        return frase2;
    }
}
