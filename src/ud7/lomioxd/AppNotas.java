package lomioxd;

import java.io.*;
/**
 * Descripción: Lee un fichero de texto con nombres y notas de estudiantes,
 * calcula su promedio y guarda los resultados en otro fichero.
 */
public class AppNotas {

    public static void main(String[] args) {
        String archivoEntrada = "src/ud7/lomioxd/notas.txt";
        String archivoSalida = "promedios.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {

            String linea;
            boolean hayContenido = false;

            while ((linea = br.readLine()) != null) {
                hayContenido = true;
                String[] partes = linea.split(",");
                if (partes.length < 2) {
                    System.err.println("Línea con formato incorrecto: " + linea);
                    continue;
                }

                String nombre = partes[0].trim();
                double suma = 0;
                int count = 0;

                try {
                    for (int i = 1; i < partes.length; i++) {
                        suma += Double.parseDouble(partes[i].trim());
                        count++;
                    }
                    double promedio = suma / count;
                    String salida = String.format("%s: %.1f", nombre, promedio);
                    bw.write(salida);
                    bw.newLine();
                } catch (NumberFormatException e) {
                    System.err.println("Error en los datos numéricos: " + linea);
                }
            }

            if (!hayContenido) {
                System.err.println("El fichero está vacío.");
            } else {
                System.out.println("Promedios calculados correctamente en " + archivoSalida);
            }

        } catch (FileNotFoundException e) {
            System.err.println("El fichero " + archivoEntrada + " no existe.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir los ficheros.");
        }
    }
}
