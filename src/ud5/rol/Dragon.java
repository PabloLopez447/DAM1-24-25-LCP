package ud5.rol;

import java.util.Random;

public class Dragon extends Monstruo {

    public Dragon(String nombre) {
        super(nombre);
        this.ataque = new Random().nextInt(100, 200) + 1;
        this.defensa = new Random().nextInt(60, 100) + 1;
        this.velocidad = new Random().nextInt(80, 120) + 1;
        this.puntosVida = new Random().nextInt(120, 250) + 1;
    }

    public Dragon() {
        this.ataque = new Random().nextInt(100, 200) + 1;
        this.defensa = new Random().nextInt(60, 100) + 1;
        this.velocidad = new Random().nextInt(80, 120) + 1;
        this.puntosVida = new Random().nextInt(120, 250) + 1;
    }
}
