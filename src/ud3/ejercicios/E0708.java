package ud3.ejercicios;

import org.junit.Test;

public class E0708 {
    public static void main(String[] args) {
        Sintonizador miRadio = new Sintonizador(80.5);
        miRadio.display();
        miRadio.downThin();
        miRadio.down();  
        miRadio.display();
        miRadio.fijarMemoria1();
        miRadio.up();
        miRadio.upThin();
        miRadio.display();
        miRadio.sintonizarMemoria1();
        miRadio.display();

        Sintonizador miRadioError = new Sintonizador(200);
        

    }

    @Test
    public void testSintonizador() {
        //assertEquals(0, 0);
    }

}
