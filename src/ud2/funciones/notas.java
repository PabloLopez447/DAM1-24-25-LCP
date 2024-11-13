package ud2.funciones;

/*
Función que reciba una nota entera de 0 a 10 y devuelva el equivalente en texto
según la siguiente escala:
insuficiente (de 0 a 4)
suficiente (5)
bien (6)
notable (7 y 8)
sobresaliente (9 y 10)
*/

public class notas {

    public static String notaTexto(int nota) {
        String notaTexto = "";
        switch (nota) {
            case 1, 2, 3, 4:
                notaTexto = "Suspeso";
                break;
            case 5:
                notaTexto = "Suficiente";
                break;
            case 6:
                notaTexto = "Bien";
                ;
                break;
            case 7, 8:
                notaTexto = "Notable";
                break;
            case 9, 10:
                notaTexto = "Sobresaliente";
                break;
            default:
                break;
        }
        return notaTexto;
    }
    public static void main(String[] args) {
        System.out.println(notaTexto(9));
    }
}
