package ud5.rol;

import java.util.Random;

public class Monstruo {
    String nombre;
    int ataque;
    int defensa;
    int velocidad;
    int puntosVida;

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }

    public Monstruo() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        if (nombre != null) {
            return nombre + " - " + getClass() + " (" + puntosVida + ") ";
        } else {
            return getClass() + " (" + puntosVida + ") ";
        }
    }

    private static int generarValor() {
        return new Random().nextInt(100) + 1;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Puntos de vida: " + puntosVida);
    }

    boolean perderVida(int puntos) {
        this.puntosVida -= puntos;
        if (!estaVivo()) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaVivo() {
        if (this.puntosVida > 0) {
            return true;
        } else {
            return false;
        }
    }

    int atacar(Personaje enemigo) {
        int dmg = 0;
        int atq = generarValor() + this.ataque;
        int def = generarValor() + enemigo.getAgilidad();
        int puntos = atq - def;

        if (puntos > 0) {
            dmg = puntos;
            if (puntos > enemigo.getPuntosVida()) {
                dmg = enemigo.getPuntosVida();
            }
            enemigo.perderVida(dmg);
        }
        return dmg;
    }

    Monstruo generarMonstruoAleatorio() {
        Monstruo monstruo = new Monstruo();
        int dado = generarValor();

        if (dado <= 40) {
            monstruo = new Orco();
        } else if (dado > 40 && dado <= 70) {
            monstruo = new Arana();
        } else if (dado > 70 && dado <= 90) {
            monstruo = new Troll();
        } else if (dado > 90 && dado <= 100) {
            monstruo = new Dragon();
        }
        return monstruo;
    }
}
