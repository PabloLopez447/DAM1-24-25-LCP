package ud5.rol;

import java.util.Random;

enum Raza {
    HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL
}

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int inteligencia;
    private int intuicion;
    private int presencia;
    private int nivel;
    private int experiencia;
    private int puntosVida;

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int inteligencia,
            int intuicion, int presencia, int nivel, int experiencia, int puntosVida) {
        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || inteligencia < 1 || intuicion < 1 || presencia < 1) {
            throw new IllegalArgumentException("Las características físicas deben ser mayores o iguales a 1");
        }
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.intuicion = intuicion;
        this.presencia = presencia;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosVida = constitucion + 50;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int inteligencia,
            int intuicion, int presencia) {
        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || inteligencia < 1 || intuicion < 1 || presencia < 1) {
            throw new IllegalArgumentException("Las características físicas deben ser mayores o iguales a 1");
        }
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.inteligencia = inteligencia;
        this.intuicion = intuicion;
        this.presencia = presencia;
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50 + constitucion;
    }

    public Personaje(String nombre, Raza raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = generarValor();
        this.agilidad = generarValor();
        this.constitucion = generarValor();
        this.inteligencia = generarValor();
        this.intuicion = generarValor();
        this.presencia = generarValor();
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50 + constitucion;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.raza = Raza.HUMANO;
        this.fuerza = generarValor();
        this.agilidad = generarValor();
        this.constitucion = generarValor();
        this.inteligencia = generarValor();
        this.intuicion = generarValor();
        this.presencia = generarValor();
        this.nivel = 1;
        this.experiencia = 0;
        this.puntosVida = 50 + constitucion;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Agilidad: " + agilidad);
        System.out.println("Constitución: " + constitucion);
        System.out.println("Inteligencia: " + inteligencia);
        System.out.println("Intuición: " + intuicion);
        System.out.println("Presencia: " + presencia);
        System.out.println("Nivel: " + nivel);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Puntos de vida: " + puntosVida + "/" + (50 + constitucion));
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getIntuicion() {
        return intuicion;
    }

    public int getPresencia() {
        return presencia;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setIntuicion(int intuicion) {
        this.intuicion = intuicion;
    }

    public void setPresencia(int presencia) {
        this.presencia = presencia;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    @Override
    public String toString() {
        return nombre + " (" + puntosVida + "/" + (50 + constitucion) + ")";
    }

    private static int generarValor() {
        return new Random().nextInt(100) + 1;
    }

    byte sumarExperiencia(int puntos) {
        byte nNiveles = 0;
        this.experiencia += puntos;
        do {
            if (experiencia > (nivel * 1000)) {
                subirNivel();
                nNiveles++;
                this.experiencia -= (this.nivel * 1000);
            }
        } while (experiencia > (nivel * 1000));
        return nNiveles;
    }

    void subirNivel() {
        this.nivel++;
        this.fuerza += 1 + ((this.fuerza * 5) / 100);
        this.agilidad += 1 + ((this.agilidad * 5) / 100);
        this.constitucion += 1 + ((this.constitucion * 5) / 100);
        this.inteligencia += 1 + ((this.inteligencia * 5) / 100);
        this.intuicion += 1 + ((this.intuicion * 5) / 100);
        this.presencia += 1 + ((this.presencia * 5) / 100);
    }

    void curar() {
        if (this.puntosVida < 50 + this.constitucion) {
            this.puntosVida = 50 + this.constitucion;
        }
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
        int atq = generarValor() + this.fuerza;
        int def = generarValor() + enemigo.agilidad;
        int puntos = atq - def;

        if (puntos > 0) {
            dmg = puntos;
            if (puntos > enemigo.puntosVida) {
                dmg = enemigo.puntosVida;
            }
            enemigo.perderVida(dmg);
            sumarExperiencia(puntos);
            enemigo.sumarExperiencia(puntos);
        }
        return dmg;
    }
}