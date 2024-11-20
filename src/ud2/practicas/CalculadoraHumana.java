package ud2.practicas;

public class CalculadoraHumana {

    static int obtenerOperando2Division(int MAX, int operando1){
        int operando2D = (int) (Math.random() * (MAX - 1 + 1)) + 1;

        

        return operando2D;
    }

    public static String operador() {
        String operador = "";

        int a = (int) (Math.random() * (4 - 1 + 1)) + 1;

        switch (a) {
            case 1:
                operador = "+";
                break;
            case 2:
                operador = "-";
                break;
            case 3:
                operador = "*";
                break;
            case 4:
                operador = "/";
                break;
            default:
                break;
        }
        return operador;
    }

    public static void main(String[] args) {
        final int MAX = 200;
        int operando1 = (int) (Math.random() * (MAX - 1 + 1)) + 1;
        System.out.println(operando1);
    }
}
