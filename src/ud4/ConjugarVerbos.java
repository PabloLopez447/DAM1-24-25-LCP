package ud4;

import java.util.Arrays;

public class ConjugarVerbos {
    public static void main(String[] args) {
        String vebo = "saltar";
        System.out.println(Arrays.toString(conjugarPresente(vebo)));

    }

    static String[] conjugarPresente(String verbo) {
        String[] cad = { "" };
        String term1 = "ar";
        String term2 = "er";
        String term3 = "ir";
        String subString = verbo.substring(verbo.length() - 2);
        String subString2 = verbo.substring(0, verbo.length() - 2);

        if (!subString.equalsIgnoreCase(term1) && !subString.equalsIgnoreCase(term2)
                && !subString.equalsIgnoreCase(term3)) {
            return null;
        }

        if (subString.equalsIgnoreCase(term1)) {
            String[] tConjug = { subString2 + "o", subString2 + "as", subString2 + "a",
                    subString2 + "amos", subString2 + "áis", subString2 + "an" };

            return tConjug;
        }

        if (subString.equalsIgnoreCase(term2)) {
            String[] tConjug = { subString2 + "o", subString2 + "es", subString2 + "e",
                    subString2 + "emos", subString2 + "éis", subString2 + "en" };

            return tConjug;
        }

        if (subString.equalsIgnoreCase(term3)) {
            String[] tConjug = { subString2 + "o", subString2 + "es", subString2 + "e",
                    subString2 + "imos", subString2 + "ís", subString2 + "en" };

            return tConjug;
        }
        return cad;
    }
}
