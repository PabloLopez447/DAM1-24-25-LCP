package ud5.rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {
    int dinero = 0;
    Item[] inventario;
    int cargaMax = 50 + 2 * this.getConstitucion();

    public PersonajeEx(String nombre) {
        super(nombre);
    }

    boolean addToInventario(Item item) {
        int cargaActual = 0;
        for (int i = 0; i < inventario.length; i++) {
            cargaActual += inventario[i].peso;
        }

        if (cargaActual + item.peso < cargaMax) {
            Arrays.copyOf(inventario, inventario.length + 1);
            inventario[inventario.length] = item;
            return true;
        } else {
            return false;
        }
    }

}
