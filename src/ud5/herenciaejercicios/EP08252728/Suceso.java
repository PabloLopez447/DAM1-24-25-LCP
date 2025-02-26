package ud5.herenciaejercicios.EP08252728;

public class Suceso extends Punto3D {
    int tiempo;
    String descripcion;

    public Suceso(int x, int y, int z, int tiempo, String descreipcion) {
        super(x, y, z);
        this.tiempo = tiempo;
        this.descripcion = descreipcion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Suceso other = (Suceso) obj;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        if (z != other.z)
            return false;
        if (tiempo != other.tiempo)
            return false;
        if (descripcion == null) {
            if (other.descripcion != null)
                return false;
        } else if (!descripcion.equals(other.descripcion))
            return false;
        return true;
    }
}