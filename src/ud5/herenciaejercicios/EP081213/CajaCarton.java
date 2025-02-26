package ud5.herenciaejercicios.EP081213;

public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo);
        this.unidad = Unidad.cm;
    }

    @Override
    double getVolumen() {
        double volumen = ((this.ancho * this.alto * this.fondo) * 0.8) / 1000;
        return volumen;
    }

    double getSuperficie() {
        double superficie = 2 * (this.alto + this.ancho + this.fondo);
        return superficie;
    }
}
