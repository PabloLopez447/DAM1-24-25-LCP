package ud5.rol;

import java.util.Random;

public class Arana extends Monstruo{

    public Arana(String nombre) {
        super(nombre);
        this.ataque = new Random().nextInt(10, 50) + 1;
        this.defensa = new Random().nextInt(20, 40) + 1;
        this.velocidad = new Random().nextInt(40, 70) + 1;
        this.puntosVida = new Random().nextInt(30, 80) + 1;
    }

    public Arana() {
        this.ataque = new Random().nextInt(10, 50) + 1;
        this.defensa = new Random().nextInt(20, 40) + 1;
        this.velocidad = new Random().nextInt(40, 70) + 1;
        this.puntosVida = new Random().nextInt(30, 80) + 1;
    }
}
