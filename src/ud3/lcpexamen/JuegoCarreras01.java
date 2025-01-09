package ud3.lcpexamen;

// Pablo López Couso

public class JuegoCarreras01 {
    public static void main(String[] args) {
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);

        rayo.mostrar();
        trueno.mostrar();

        rayo.turno();
        trueno.turno();
    
    
}
}