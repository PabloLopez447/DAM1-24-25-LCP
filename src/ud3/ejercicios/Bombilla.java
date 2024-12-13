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
}
