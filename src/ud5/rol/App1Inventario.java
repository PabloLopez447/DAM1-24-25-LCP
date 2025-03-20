package ud5.rol;

public class App1Inventario {
    public static void main(String[] args) {
        PersonajeEx p = new PersonajeEx("Manin", Raza.HUMANO, 12);

        Item i1 = new Item("Espada de tal", 2, 2);
        Item i2 = new Item("Escudo de cual", 3, 2);
        Item i3 = new Item("Arco del man", 1, 2);

        p.addToInventario(i1);
        p.addToInventario(i2);
        p.addToInventario(i3);

        System.out.println("1. Inventario de personaje");
        System.out.println("======================================");
    }

    public void mostrarInventario(PersonajeEx p) {
        System.out.println("Invenrario de " + p.getNombre());
        for (int i = 0; i < p.inventario.length; i++) {
            System.out.println(p.inventario[i]);
        }
    }
}
