package ud4.ejercicios;

public class Matriculas {

    public static void main(String[] args) {
        System.out.println(esMatriculaValida("123"));
        System.out.println(esMatriculaValida("1234BBBB"));
        System.out.println(esMatriculaValida("1234BÚB"));
        System.out.println(esMatriculaValida("1234BB."));
        System.out.println(esMatriculaValida("1234BAB"));

        System.out.println(esMatriculaValida("1234BbB"));
        System.out.println(esMatriculaValida("1234BBB"));
        System.out.println(esMatriculaValida("9999BBZ"));
        System.out.println(esMatriculaValida("9999BBP"));
        System.out.println(esMatriculaValida("9999ZZZ"));

        System.out.println(siguienteMatricula("1234BbB"));
        System.out.println(siguienteMatricula("1234BBB"));
        System.out.println(siguienteMatricula("9999BBZ"));
        System.out.println(siguienteMatricula("9999BBP"));
        System.out.println(siguienteMatricula("9999ZZZ"));

        System.out.println(comparaMatriculas("1234BBB", "1234BBB"));
        System.out.println(comparaMatriculas("1234BBB", "1234BBC"));
        System.out.println(comparaMatriculas("1234BBC", "1234BBB"));
        System.out.println(comparaMatriculas("1234BBB", "1233BBB"));
        System.out.println(comparaMatriculas("1234BBB", "1235BBB"));
    }

    static int comparaMatriculas(String m1, String m2) {
        m1 = m1.toUpperCase();
        m2 = m2.toUpperCase();
        int compararLetras = m1.substring(4, 7).compareTo(m2.substring(4, 7));
        if (compararLetras < 0) { // m1 es más antigua
            return -1;
        } else if (compararLetras > 0) { // m2 es más antigua
            return 1;
        } else {
            // letras iguales => desempatamos con los números
            int compararNumeros = m1.substring(0, 4).compareTo(m2.substring(0, 4));
            if (compararNumeros < 0) { // m1 es más antigua
                return -1;
            } else if (compararNumeros > 0) { // m2 es más antigua
                return 1;
            } else {
                return 0;
            }
        }

    }

    static String siguienteMatricula(String matricula) {
        boolean meLlevoUno = false;
        Integer nuevoNum = Integer.valueOf(matricula.substring(0,4)) + 1;
        if (nuevoNum == 10000) {
            nuevoNum = 0000;
            meLlevoUno = true;
        }
        String numeros = String.format("%04d", nuevoNum);

        char[] letras = matricula.substring(4,7).toUpperCase().toCharArray();

        for (int i = 2; i >= 0; i--) {
            if (meLlevoUno) {
                String letrasValidas = "BCDFGHJKLMNPRSTVWXYZ";
                // incremento la letra
                if (letras[i] == 'Z') {
                    letras[i] = 'B';
                    meLlevoUno = true;
                } else {
                    letras[i] = letrasValidas.charAt(letrasValidas.indexOf(letras[i]) + 1);
                    meLlevoUno = false;
                }
            }
        }

        return numeros + String.valueOf(letras);

    }


    static boolean esMatriculaValida(String matricula) {
        if (matricula == null || matricula.length() != 7)
            return false;

        try {
            Integer.valueOf(matricula.substring(0,4));
        } catch (NumberFormatException e) {
            return false;
        }

        for (int i = 4; i < matricula.length(); i++) {
            if ("BCDFGHJKLMNPRSTVWXYZ".indexOf(Character.toUpperCase(matricula.charAt(i))) == -1)
                return false;
        }

        return true;
    }


}
