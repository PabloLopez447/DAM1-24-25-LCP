package ud5.inmobiliaria;

public class Casa extends Inmueble {
    int terreno;

    public Casa(String direccion, int m2, int nHabitaciones, int nBanos, int terreno) {
        super(direccion, m2, nHabitaciones, nBanos);
        this.terreno = terreno;
    }

    @Override
    public String detalle() {
        if (pAlquiler != 0 && pVenta != 0) {
            return "Casa en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + terreno + "m2.\n" + "Precio de Alquiler: " + pAlquiler + " €\n"
                    + "Precio de Venta: " + pVenta + " €\n";
        } else if (pAlquiler == 0) {
            return "Casa en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + terreno + "m2.\n" + "Precio de Venta: " + pVenta + " €\n";
        } else if (pVenta == 0) {
            return "Casa en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + terreno + "m2.\n" + "Precio de Alquiler: " + pAlquiler + " €\n";
        }
        return "";
    }
}