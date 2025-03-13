package ud5.rol;

public class Arma extends Item {
    int ataque;
    boolean dosManos;

    public Arma(String nombre, double peso, int precio, int ataque, boolean dosManos) {
        super(nombre, peso, precio);
        this.ataque = ataque;
        this.dosManos = dosManos;
    }

    
}
