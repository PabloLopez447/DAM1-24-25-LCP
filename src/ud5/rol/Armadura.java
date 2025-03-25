package ud5.rol;

public class Armadura extends Item {
    enum Tipo {
        YELMO, ARMADURA, ESCUDO
    }

    int defensa;
    Tipo tipo;

    public Armadura(String nombre, double peso, int precio, int defensa, Tipo tipo) {
        super(nombre, peso, precio);
        this.defensa = defensa;
        this.tipo = tipo;
    }

    
}
