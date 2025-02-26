package ud5.herenciaejercicios.EP08252728;

public class Punto3D extends Punto {
    int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Punto3D other = (Punto3D) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        if (z != other.z)
            return false;
        return true;
    }

    double distancia(Punto3D otrPunto) {
        return Math.sqrt((Math.pow((this.x - otrPunto.x), 2)) + (Math.pow((this.y - otrPunto.y), 2))
                + (Math.pow((this.z - otrPunto.z), 2)));
    }
}
