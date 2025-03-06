package ud5.rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {
    int dinero;
    Item[] inventario;
    int cargaMax;

    public PersonajeEx(String nombre, Raza raza, int dinero, Item[] inventario, int cargaMax) {
        super(nombre, raza);
        this.dinero = 0;
        this.inventario = new Item[0];
        this.cargaMax = 50 + 2 * this.getConstitucion();
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
