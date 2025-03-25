package ud5.rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {
    int dinero;
    Item[] inventario;
    int cargaMax;
    Item itemManoIzq;
    Item itemManoDch;
    Armadura armaduraCabeza;
    Armadura armaduraCuerpo;

    public PersonajeEx(String nombre, Raza raza, int dinero) {
        super(nombre, raza);
        this.dinero = 0;
        this.inventario = new Item[0];
        this.cargaMax = 50 + 2 * this.getConstitucion();
    }

    boolean addToInventario(Item item) {
        int cargaActual = 0;
        for (int i = 0; i < inventario.length; i++) {
            if (this.inventario[i] != null) {
                cargaActual += inventario[i].peso;
            }

        }

        if (cargaActual + item.peso < cargaMax) {
            this.inventario = Arrays.copyOf(inventario, inventario.length + 1);
            inventario[inventario.length - 1] = item;
            return true;
        } else {
            return false;
        }
    }

    boolean equipar(Item i) {
        if (i instanceof Armadura) {
            Armadura armadura = (Armadura) i;
            switch (armadura.tipo) {
                case YELMO:
                    if (armaduraCabeza == null) {
                        armaduraCabeza = armadura;
                        return true;
                    }
                    break;
                case ARMADURA:
                    if (armaduraCuerpo == null) {
                        armaduraCuerpo = armadura;
                        return true;
                    }
                    break;
                case ESCUDO:
                    if (itemManoDch == null) {
                        itemManoDch = armadura;
                        return true;
                    } else if (itemManoIzq == null) {
                        itemManoIzq = armadura;
                        return true;
                    }
                    break;
            }
        } else if (i instanceof Arma) {
            Arma arma = (Arma) i;
            if (arma.dosManos) {
                if (itemManoDch == null && itemManoIzq == null) {
                    itemManoDch = arma;
                    itemManoIzq = arma;
                    return true;
                }
            } else {
                if (itemManoDch == null) {
                    itemManoDch = arma;
                    return true;
                } else if (itemManoIzq == null) {
                    itemManoIzq = arma;
                    return true;
                }
            }
        }
        return false;
    }

}
