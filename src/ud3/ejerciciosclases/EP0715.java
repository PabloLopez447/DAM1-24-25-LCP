package ud3.ejerciciosclases;

public class EP0715 {
    @SuppressWarnings("unused")
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

        try {
            Calendario fecha4 = new Calendario(0, -1, 1);            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIN");
    }
}
