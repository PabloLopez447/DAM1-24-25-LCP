package ud4;

public class StringFunctionsExample {
    public static void main(String[] args) {

        // 1. valueOf() - Convierte un valor a String
        int numero = 42;
        String strNumero = String.valueOf(numero);
        System.out.println("valueOf(): " + strNumero);

        // 2. equals() - Compara si dos cadenas son exactamente iguales (distingue mayúsculas)
        String str1 = "Hola";
        String str2 = "hola";
        System.out.println("equals(): " + str1.equals(str2)); // false

        // 3. equalsIgnoreCase() - Compara dos cadenas sin distinguir mayúsculas
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); // true

        // 4. regionMatches() - Compara una parte de dos cadenas
        String texto1 = "Hola Mundo";
        String texto2 = "Mundo";
        boolean regionIgual = texto1.regionMatches(5, texto2, 0, 5);
        System.out.println("regionMatches(): " + regionIgual); // true

        // 5. compareTo() - Compara cadenas lexicográficamente (según ASCII)
        System.out.println("compareTo(): " + str1.compareTo(str2)); // Devuelve negativo porque 'H' < 'h'

        // 6. compareToIgnoreCase() - Igual que compareTo, pero ignora mayúsculas
        System.out.println("compareToIgnoreCase(): " + str1.compareToIgnoreCase(str2)); // 0

        // 7. charAt() - Obtiene el carácter en una posición específica
        System.out.println("charAt(): " + str1.charAt(1)); // 'o'

        // 8. substring() - Extrae una parte de la cadena
        System.out.println("substring(): " + texto1.substring(5, 10)); // "Mundo"

        // 9. strip() - Elimina espacios en blanco al inicio y al final (Unicode-friendly)
        String textoConEspacios = "  Hola  ";
        System.out.println("strip(): '" + textoConEspacios.strip() + "'");

        // 10. stripLeading() - Elimina solo los espacios iniciales
        System.out.println("stripLeading(): '" + textoConEspacios.stripLeading() + "'");

        // 11. stripTrailing() - Elimina solo los espacios finales
        System.out.println("stripTrailing(): '" + textoConEspacios.stripTrailing() + "'");

        // 12. length() - Devuelve la cantidad de caracteres en la cadena
        System.out.println("length(): " + str1.length()); // 4

        // 13. indexOf() - Devuelve la primera posición de un carácter o cadena
        System.out.println("indexOf(): " + texto1.indexOf('o')); // 1

        // 14. lastIndexOf() - Devuelve la última posición de un carácter o cadena
        System.out.println("lastIndexOf(): " + texto1.lastIndexOf('o')); // 9

        // 15. isEmpty() - Verifica si una cadena está vacía
        String vacio = "";
        System.out.println("isEmpty(): " + vacio.isEmpty()); // true

        // 16. contains() - Verifica si una cadena contiene otra cadena
        System.out.println("contains(): " + texto1.contains("Mundo")); // true

        // 17. startsWith() - Verifica si una cadena empieza con otra
        System.out.println("startsWith(): " + texto1.startsWith("Hola")); // true

        // 18. endsWith() - Verifica si una cadena termina con otra
        System.out.println("endsWith(): " + texto1.endsWith("Mundo")); // true

        // 19. toLowerCase() - Convierte la cadena a minúsculas
        System.out.println("toLowerCase(): " + str1.toLowerCase()); // "hola"

        // 20. toUpperCase() - Convierte la cadena a mayúsculas
        System.out.println("toUpperCase(): " + str1.toUpperCase()); // "HOLA"

        // 21. replace() - Reemplaza caracteres en la cadena
        System.out.println("replace(): " + texto1.replace("Hola", "Hi")); // "Hi Mundo"

        // 22. split() - Divide la cadena en un array usando un delimitador
        String[] palabras = texto1.split(" ");
        System.out.println("split(): " + palabras[0] + ", " + palabras[1]); // "Hola, Mundo"
        // reglas generales:
        //
        //"" - indicar que una cadena contiene un numero de símbolos fijo.
        //         patrón "aaa" > cadenas con 3 a.
        //
        //
        //[] - opcionalidad > sólo un simbolo de los siguientes: ("[xyz]")
        //         patrón "aaa[xy]" > valida aaax y aaay
        //
        //
        //("[a-Z]","[A-Z]","[a-zA-Z]") admite cualquier caracter de esos
        //
        //
        //? puede aparecer una vez o ninguna
        //      a? aparece 0 o 1 veces
        //
        //
        //0, 1 o N veces
        // a* > aa, a, aaaaaaaa
        //
        //
        //+ - al menos 1, N
        //     a+ > al menos una a
        //
        //
        //{} - número mín y máx que un símbolo podrá repetirse. ("a{1,4}") "a" debe aparecer al menos una vez y como máximo 4
        //
        //
        //{2,} - sólo el mínimo
        //
        //
        //{5}  - numero exacto
        //
        //indicadores de repetición - "[a-z]{1,4}[0-9]+" > 1-4 letras minúsculas + un numero.
        // 23. toCharArray() - Convierte la cadena en un array de caracteres
        char[] caracteres = texto1.toCharArray();
        System.out.println("toCharArray(): " + caracteres[0] + ", " + caracteres[1]); // 'H', 'o'
    }
}
