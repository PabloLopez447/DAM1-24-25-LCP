package lomioxd;

import java.io.Serializable;

/**
 * Clase que representa un producto del inventario.
 */
public class Producto implements Serializable {
    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    public Producto(int codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Código: %d | Nombre: %s | Cantidad: %d | Precio: %.2f",
                codigo, nombre, cantidad, precio);
    }
}
