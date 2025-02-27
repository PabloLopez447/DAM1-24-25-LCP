package ud5.inmobiliaria;

public class Piso extends Inmueble {
    int planta;

    public Piso(String direccion, int m2, int nHabitaciones, int nBanos, int planta) {
        super(direccion, m2, nHabitaciones, nBanos);
        this.planta = planta;
    }

    @Override
    public String detalle() {
        if (pAlquiler != 0 && pVenta != 0) {
            return "Piso en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + planta + "ª planta.\n" + "Precio de Alquiler: " + pAlquiler + " €\n"
                    + "Precio de Venta: " + pVenta + " €\n";
        } else if (pAlquiler == 0) {
            return "Piso en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + planta + "ª planta.\n" + "Precio de Venta: " + pVenta + " €\n";
        } else if (pVenta == 0) {
            return "Piso en " + direccion + ".\n" + m2 + " m2, " + nHabitaciones + "hab, " + nBanos + " baños, "
                    + "con terreno de " + planta + "ª planta.\n" + "Precio de Alquiler: " + pAlquiler + " €\n";
        }
        return "";
    }

}
