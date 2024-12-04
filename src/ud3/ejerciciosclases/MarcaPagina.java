package ud3.ejerciciosclases;

public class MarcaPagina {
    
    int pagina;
    String libro;

    public void incrementarPagina(){
        pagina++;
    }

    public int pagLeidas(){
        return pagina;
    }

    public void reempezarLibro(){
        pagina = 0;
    }
}
