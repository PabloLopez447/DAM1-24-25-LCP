package ud5.rol;

import java.util.Random;

public class Troll extends Monstruo {

    public Troll(String nombre) {
        super(nombre);
        this.ataque = new Random().nextInt(60, 120) + 1;
        this.defensa = new Random().nextInt(50, 70) + 1;
        this.velocidad = new Random().nextInt(20, 40) + 1;
        this.puntosVida = new Random().nextInt(100, 200) + 1;
    }

    public Troll() {
        this.ataque = new Random().nextInt(60, 120) + 1;
        this.defensa = new Random().nextInt(50, 70) + 1;
        this.velocidad = new Random().nextInt(20, 40) + 1;
        this.puntosVida = new Random().nextInt(100, 200) + 1;
    }
}
