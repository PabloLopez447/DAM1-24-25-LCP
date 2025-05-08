package ud6.lcpexamen.festivalmeigas;

import java.util.Arrays;
import java.util.Comparator;

//Pablo López Couso

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        Comparator<Meiga> m = (m1, m2) -> m1.getFeitizos().size() - m2.getFeitizos().size();
        Arrays.sort(meigasExemplo, m);

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");

        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
