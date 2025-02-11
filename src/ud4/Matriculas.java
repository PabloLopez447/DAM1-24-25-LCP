package ud4;


public class Matriculas {
    public static void main(String[] args) {
        String matricula = "0000BBB";
        boolean esValido = validarMatricula(matricula.toLowerCase());
        if (esValido) {
            System.out.println("La matricula es valida");
        } else {
            System.out.println("La matricula no es valida");

        }
    }

    static boolean validarMatricula(String matricula) {
        final int LONGITUD = 7;
        boolean esValido = true;
        char[] partes = matricula.toCharArray();
        String invalidos = "aeiouáéíóúünq";

        if (partes.length != LONGITUD) {
            esValido = false;
        } else {
            for (int i = 0; i < partes.length; i++) {
                char ch = partes[i];
                while (i < 4) {
                    if (Character.isDigit(i)) {
                        esValido = true;
                    } else {
                        esValido = false;
                    }
                }
                if (Character.isLetter(ch) && invalidos.indexOf(ch) == -1) {
                    esValido = true;
                } else {
                    esValido = false;
                }
            }
        }

        return esValido;
    }
}
