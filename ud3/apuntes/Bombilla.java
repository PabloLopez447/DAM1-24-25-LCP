<<<<<<< HEAD:src/ud3/ejercicios/Bombilla.java
package ud3.ejercicios;

public class Bombilla {

    private boolean estaEncendida;

    static boolean interruptorGeneral;

    public Bombilla (boolean estaEncendida){
        this.estaEncendida = estaEncendida;
    }

    public void encender(){
        estaEncendida = true;
    }

    public void apagar(){
        estaEncendida = false;
    }

    public void estado(){
        if (estaEncendida){
            System.out.println("Esta encendida");
        }
        else{
            System.out.println("Esta apagada");
        }
    }

    public static void encenderInterruptorGeneral(){
        interruptorGeneral = true;
    }

    public static void apagarInterruptorGeneral(){
        interruptorGeneral = false;
    }    
=======
package ud3.apuntes;

public class Bombilla {
    private boolean interruptor;

    private static boolean interruptorGeneral;

    public void encender() {
        interruptor = true;
    }

    public void apagar() {
        interruptor = false;
    }

    public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public boolean estado() {
        return interruptor && interruptorGeneral;
    }

    public static boolean estado(Bombilla b2) {
        return b2.interruptor && interruptorGeneral;
    }



>>>>>>> 53e0324b6607121d6bf49b7f0c91040748bf98bf:ud3/apuntes/Bombilla.java
}
