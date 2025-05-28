package lomioxd;

import java.io.*;
import java.util.*;

/**
 * Autor: [Tu Nombre y Apellidos]
 * Aplicación para gestionar un inventario con ficheros binarios.
 */
public class AppInventario {
    private static final String ARCHIVO = "inventario.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Producto> productos = cargarInventario();

        int opcion;
        do {
            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por código");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> agregarProducto(sc, productos);
                case 2 -> listarProductos(productos);
                case 3 -> buscarProducto(sc, productos);
                case 0 -> guardarInventario(productos);
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    private static List<Producto> cargarInventario() {
        List<Producto> productos = new ArrayList<>();
        File archivo = new File(ARCHIVO);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                productos = (List<Producto>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al leer inventario: " + e.getMessage());
            }
        }
        return productos;
    }

    private static void guardarInventario(List<Producto> productos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(productos);
            System.out.println("Inventario guardado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar inventario.");
        }
    }

    private static void agregarProducto(Scanner sc, List<Producto> productos) {
        try {
            System.out.print("Código: ");
            int codigo = sc.nextInt();
            sc.nextLine();
            if (buscarPorCodigo(productos, codigo) != null) {
                System.out.println("Ya existe un producto con ese código.");
                return;
            }

            System.out.print("Nombre: ");
            String nombre = sc.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacío.");
                return;
            }

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            productos.add(new Producto(codigo, nombre, cantidad, precio));
            System.out.println("Producto agregado con éxito.");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida.");
            sc.nextLine(); // limpiar buffer
        }
    }

    private static void listarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos.");
            return;
        }
        productos.stream()
                 .sorted(Comparator.comparingInt(Producto::getCodigo))
                 .forEach(System.out::println);
    }

    private static void buscarProducto(Scanner sc, List<Producto> productos) {
        System.out.print("Código del producto: ");
        int codigo = sc.nextInt();
        Producto prod = buscarPorCodigo(productos, codigo);
        if (prod != null) {
            System.out.println(prod);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static Producto buscarPorCodigo(List<Producto> productos, int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) return p;
        }
        return null;
    }
}

