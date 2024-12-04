package ud3.ejerciciosclases;

public class EP0715 {
    public static void main(String[] args) {
        Calendario fecha = new Calendario(2024, 12, 31);
        fecha.incrementarDia();
        Calendario fecha2 = new Calendario(2025, 1, 1);
        Calendario fecha3 = new Calendario(2025, 1, 1);        
        System.out.println(fecha.iguales(fecha2));
        System.out.println(fecha.iguales(fecha3));
        System.out.println(fecha2.iguales(fecha3));

        fecha.incrementarAño(-2025);
        fecha.mostrar();
        fecha.incrementarAño(1);
        fecha.mostrar();



        System.out.println("FIN");
    }
}
