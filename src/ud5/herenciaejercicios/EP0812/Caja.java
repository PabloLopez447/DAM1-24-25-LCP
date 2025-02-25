package ud5.herenciaejercicios.EP0812;

enum Unidad {
    cm, m
}

public class Caja {
    int ancho;
    int alto;
    int fondo;
    String etiqueta;
    Unidad unidad;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public Caja(int ancho, int alto, int fondo) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }

    double getVolumen() {
        double volumen = 0;

        if (this.unidad == Unidad.m) {
            volumen = this.alto * this.ancho * this.fondo;
        } else {
            volumen = (this.alto / 1000) * (this.ancho / 1000) * (this.fondo / 1000);
        }

        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + ", alto=" + alto + ", fondo=" + fondo + ", etiqueta=" + etiqueta + ", unidad="
                + unidad + "]";
    }

}
