package ud6;

import java.util.*;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

class Jugador {
    private final String dni;
    private String nombre;
    private Posicion posicion;
    private double estatura;

    public Jugador(String dni, String nombre, Posicion posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    // Setters (solo para los campos editables)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return nombre + " (" + posicion + ", " + estatura + "m)";
    }

    // Métodos estáticos requeridos

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, jugador);
        } else {
            System.out.println("Error: El dorsal ya está asignado.");
        }
    }

    public static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNombre());
        }
    }

    public static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        try {
            Posicion pos = Posicion.valueOf(posicion.toUpperCase());
            for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
                if (entry.getValue().getPosicion() == pos) {
                    System.out.println(entry.getKey() + " - " + entry.getValue().getNombre());
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Posición no válida.");
        }
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador datosNuevos) {
        if (plantilla.containsKey(dorsal)) {
            Jugador jugadorExistente = plantilla.get(dorsal);
            jugadorExistente.setNombre(datosNuevos.getNombre());
            jugadorExistente.setPosicion(datosNuevos.getPosicion());
            jugadorExistente.setEstatura(datosNuevos.getEstatura());
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new HashMap<>();

        Jugador j1 = new Jugador("12345678A", "Pedro", Posicion.DEFENSA, 1.80);
        Jugador.altaJugador(plantilla, 4, j1);

        Jugador j2 = new Jugador("87654321B", "Luis", Posicion.DELANTERO, 1.75);
        Jugador.altaJugador(plantilla, 9, j2);

        Jugador.mostrar(plantilla);
        System.out.println("---- Delanteros ----");
        Jugador.mostrar(plantilla, "DELANTERO");

        Jugador jEditado = new Jugador("00000000X", "Luis García", Posicion.DELANTERO, 1.78);
        Jugador.editarJugador(plantilla, 9, jEditado);

        System.out.println("---- Después de edición ----");
        Jugador.mostrar(plantilla);
    }
}


