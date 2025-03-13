package ud5.apuntesinterfaces;

import java.util.Arrays;

public class Socio implements Comparable {
    int id;
    String nombre;

    public Socio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return id + "-" + nombre;
    }

    public static void main(String[] args) {
        Socio s = new Socio(1, "María");
        Socio s2 = new Socio(2, "Lolo");

        if (s.compareTo(s2) == 0) {
            System.out.println("Son iguales");
        } else if (s.compareTo(s2) < 0) {
            System.out.println(s.nombre + " es menor que " + s2.nombre);
        } else {
            System.out.println(s.nombre + " es mayor que " + s2.nombre);
        }

        System.out.println("ARRAY DE SOCIOS ORDENADO");
        Socio[] socios = {
                s,
                s2,
                new Socio(5, "Paco"),
                new Socio(4, "Laura"),
                new Socio(3, "Jose"),
                new Socio(8, "Jose"),
        };

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios);

        System.out.println(Arrays.toString(socios));

    }

    @Override
    public int compareTo(Object o) {
        Socio otroSocio = ((Socio) o);
        int res = nombre.compareTo(otroSocio.nombre);
        if (res == 0) {
            res = otroSocio.id - id;
        }
        return res;
    }

    /*@Override
    public int compareTo(Object o) {
        Socio otroSocio = ((Socio) o);
        int res = id - otroSocio.id;
        return res;
    }*/



}

