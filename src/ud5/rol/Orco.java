package ud5.rol;

import java.util.Random;

public class Orco extends Monstruo {

    public Orco(String nombre) {
        super(nombre);
        this.ataque = new Random().nextInt(30, 80) + 1;
        this.defensa = new Random().nextInt(30, 50) + 1;
        this.velocidad = new Random().nextInt(30, 60) + 1;
        this.puntosVida = new Random().nextInt(30, 100) + 1;
    }

    public Orco() {
        this.ataque = new Random().nextInt(30, 80) + 1;
        this.defensa = new Random().nextInt(30, 50) + 1;
        this.velocidad = new Random().nextInt(30, 60) + 1;
        this.puntosVida = new Random().nextInt(30, 100) + 1;
    }
}
