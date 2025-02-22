package rol;

import java.util.Random;

public class AppCombateSingular {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Aaron97", Raza.ORCO);
        Personaje p2 = new Personaje("Rit", Raza.ENANO);

        System.out.println("------------------------------------");
        p1.mostrar();
        System.out.println("------------------------------------");
        p2.mostrar();
        System.out.println("------------------------------------");

        while (p1.estaVivo() && p2.estaVivo()) {
            if (p1.getAgilidad() > p2.getAgilidad()) {
                p1Atq(p1, p2);
                if (p2.estaVivo()) {
                    p2Atq(p2, p1);
                }
            } else if (p1.getAgilidad() < p2.getAgilidad()) {
                p2Atq(p2, p1);
                if (p1.estaVivo()) {
                    p1Atq(p1, p2);
                }
            } else if (p1.getAgilidad() == p2.getAgilidad()) {
                Random rnd = new Random();
                int moneda = rnd.nextInt(100);
                if (moneda >= 50) {
                    p1Atq(p1, p2);
                    if (p2.estaVivo()) {
                        p2Atq(p2, p1);
                    }
                } else {
                    p2Atq(p2, p1);
                    if (p1.estaVivo()) {
                        p1Atq(p1, p2);
                    }
                }
            }
        }
        System.out.println("------------------------------------");
        p1.mostrar();
        System.out.println("------------------------------------");
        p2.mostrar();
        System.out.println("------------------------------------");
    }

    public static void p1Atq(Personaje p1, Personaje p2) {
        int dmg = p1.atacar(p2);
        System.out.printf("%s (%d) ataca a %s (%d)\n", p1.getNombre(), p1.getPuntosVida(), p2.getNombre(),
                p2.getPuntosVida());
        if (dmg > 0) {
            System.out.printf("%s ha perdido %d puntos de vida\n", p2.getNombre(), dmg);
        } else {
            System.out.printf("%s ha evitado el ataque\n", p2.getNombre());
        }
        if (!p2.estaVivo()) {
            System.out.printf("%s ha muerto, la victoria es de %s\n", p2.getNombre(), p1.getNombre());
        }
    }

    public static void p2Atq(Personaje p2, Personaje p1) {
        int dmg = p2.atacar(p1);
        System.out.printf("%s (%d) ataca a %s (%d)\n", p2.getNombre(), p2.getPuntosVida(), p1.getNombre(),
                p1.getPuntosVida());
        if (dmg > 0) {
            System.out.printf("%s ha perdido %d puntos de vida\n", p1.getNombre(), dmg);
        } else {
            System.out.printf("%s ha evitado el ataque\n", p1.getNombre());
        }
        if (!p1.estaVivo()) {
            System.out.printf("%s ha muerto, la victoria es de %s\n", p1.getNombre(), p2.getNombre());
        }
    }
}