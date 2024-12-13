package ud3.ejercicios;

public class Jugador {

    private String nombre;
    private String DNI;
    private String posicion;
    private double estatura;

    enum posicion {
        Portero, Defensa, Centrocampista, Delantero
    }

    Jugador(String nombre, String DNI, String posicion, double estatura) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    
}
