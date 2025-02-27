package ud5.inmobiliaria;

public abstract class Inmueble {
    String direccion;
    int m2;
    int nHabitaciones;
    int nBanos;
    int pAlquiler;
    int pVenta;

    public Inmueble(String direccion, int m2, int nHabitaciones, int nBanos) {
        this.direccion = direccion;
        this.m2 = m2;
        this.nHabitaciones = nHabitaciones;
        this.nBanos = nBanos;
    }

    public void setPrecioAlquiler(int pAlquiler) {
        this.pAlquiler = pAlquiler;
    }

    public void setPrecioVenta(int pVenta) {
        this.pVenta = pVenta;
    }

    @Override
    public String toString() {
        return "Inmueble en " + direccion + " (" + m2 + " m2, " + nHabitaciones + "hab" + ")";
    }

    abstract String detalle();

}
