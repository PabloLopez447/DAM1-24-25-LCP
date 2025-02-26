package ud5.herenciaejercicios.EP08252728;

public class Punto {
    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto other = (Punto) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        return true;
    }

    double distancia(Punto otrPunto) {
        return Math.sqrt((Math.pow((this.x - otrPunto.x), 2)) + (Math.pow((this.y - otrPunto.y), 2)));
    }
}
