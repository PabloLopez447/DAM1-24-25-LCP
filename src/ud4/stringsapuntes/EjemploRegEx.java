package ud4.stringsapuntes;

import java.util.*;

class EjemploRegEx {

    @SuppressWarnings("resource")
    public static void main(String[ ] args) {

        String respuesta;
        boolean siguePatron;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Escribe una matrícula: ");
            respuesta = sc.nextLine();
            siguePatron = respuesta.matches("[0-9]{4}[BCDFGHJKLMNPRSTVWXYZ]{3}");
            if(!siguePatron)
                System.out.println("La expresion no encaja con el patrón: --[0-9]{3}[A-Z]+");
        } while(!siguePatron);

        System.out.println("Expresión correcta!");
    }
}

