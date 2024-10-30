package ud2.ejemplos;

//Programa que muestra los números del 1 al 10 todos en la misma fila y separados por un espacio en blanco.

public class EjemploDoWhile3 {
    public static void main(String[] args) {
        int i = 1;
        do { // inicio del do .. while
            System.out.print(i + " ");
            i++;
        } while (i <= 10); // fin del do .. while
        System.out.println("\nFin programa");
    }
}
