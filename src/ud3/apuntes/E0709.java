<<<<<<< HEAD:src/ud3/ejercicios/E0709.java
package ud3.ejercicios;

public class E0709 {

    public static void main(String[] args) {
        Bombilla b1 = new Bombilla(false);
        Bombilla b2 = new Bombilla(false);
        Bombilla b3 = new Bombilla(false);

        
    }

=======
package ud3.apuntes;

public class E0709 {
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        System.out.println(b1.estado());
        System.out.println(Bombilla.estado(b2));

        b1.encender();
        b3.encender();
        System.out.println(b1.estado() + " - " + b2.estado() + " - " + b3.estado());            
        
        Bombilla.encenderInterruptorGeneral();
        System.out.println(b1.estado() + " - " + b2.estado() + " - " + b3.estado());            

        b3.apagar();
        System.out.println(b1.estado() + " - " + b2.estado() + " - " + b3.estado());                    

        Bombilla.apagarInterruptorGeneral();
        System.out.println(b1.estado() + " - " + b2.estado() + " - " + b3.estado());            
    }
>>>>>>> 53e0324b6607121d6bf49b7f0c91040748bf98bf:ud3/apuntes/E0709.java
}
