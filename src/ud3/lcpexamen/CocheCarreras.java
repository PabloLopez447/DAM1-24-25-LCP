package ud3.lcpexamen;

// Pablo López Couso

public class CocheCarreras {
    private String nombre;
    private int velocidadMax;
    private int turbosMax;
    private int turbosUsed;
    private int autonomiaUsed;
    private int autonomiaMax;
    private int turbosRest;
    private int autonomiaRest;
    private int distancia;

    public CocheCarreras(String nombre, int velocidadMax, int turbosMax, int autonomiaMax) {
        this.nombre = nombre;
        if (velocidadMax >= 0 && velocidadMax <= 100) {
            this.velocidadMax = velocidadMax;
        } else {
            this.velocidadMax = 1;
        }
        if (turbosMax >= 0) {
            this.turbosMax = turbosMax;
        } else {
            this.turbosMax = 0;
        }
        if (autonomiaMax >= 0) {
            this.autonomiaMax = turbosMax;
        } else {
            this.autonomiaMax = 0;
        }
        this.distancia = 0;
        this.turbosUsed = 0;
        this.autonomiaUsed = 0;
        this.autonomiaRest = autonomiaMax;
        this.turbosRest = turbosMax;
    }

    public CocheCarreras(String nombre, int velocidadMax, int autonomiaMax) {
        this.nombre = nombre;
        if (velocidadMax >= 0 && velocidadMax <= 100) {
            this.velocidadMax = velocidadMax;
        } else {
            this.velocidadMax = 1;
        }
        if (autonomiaMax >= 0) {
            this.autonomiaMax = turbosMax;
        } else {
            this.autonomiaMax = 0;
        }
        this.turbosMax = 3;
        this.distancia = 0;
        this.turbosUsed = 0;
        this.autonomiaUsed = 0;
        this.autonomiaRest = autonomiaMax;
        this.turbosRest = turbosMax;

    }

    public String getNombre() {
        return nombre;
    }

    public int getTurbosRest() {
        this.turbosRest = this.turbosMax - this.turbosUsed;
        return turbosRest;
    }

    public int getAutonomiaRest() {
        if (this.autonomiaRest >= 0) {
            this.autonomiaRest = this.autonomiaMax - this.autonomiaUsed;
        }
        return autonomiaRest;
    }

    public int avanzar() {
        if (this.distancia <= this.autonomiaRest) {
            this.distancia = (int) (Math.random() * (this.velocidadMax - 1 + 1)) + 1;
            this.autonomiaRest = this.autonomiaMax - this.distancia;
        }

        return distancia;
    }

    public void usarTurbo() {
        if (this.turbosUsed != this.turbosMax) {
            if (this.distancia <= this.autonomiaRest) {
                this.distancia += 150 / 100 * this.velocidadMax;
                this.turbosUsed++;
                this.autonomiaRest = this.autonomiaMax - this.distancia;
            }

        }
    }

    public void repostar() {
        this.autonomiaRest = this.autonomiaMax;
        this.turbosRest = this.turbosMax;
    }

    public void reiniciarDistancia() {
        this.distancia = 0;
    }

    public void mostrar() {
        System.out.println("Coche: <" + this.nombre + ">");
        System.out.println("Velocidad Máxima: <" + this.velocidadMax + "> mps");
        System.out.println("Turbos: <" + turbosRest + ">" + "/" + "<" + turbosMax + ">");
        System.out.println("Autonomia: <" + autonomiaRest + ">" + "/" + "<" + autonomiaMax + ">");
    }

    public void turno() {
        do {
            if (turbosRest > 0) {
                usarTurbo();
                System.out.println(this.nombre + "Usa un turbo y recorre " + this.distancia + ". Quedan " + this.turbosRest + " turbos");
            } else {
                if (autonomiaRest <= 0) {
                    repostar();
                    System.out.println(this.nombre + "para a repostar");
                } else {
                    avanzar();
                    System.out.println(this.nombre + "avanza" + this.distancia);
                }
            }

        } while (this.distancia < 500);

    }

    public static void main(String[] args) {
        System.out.println("RAYO");
        System.out.println("====");
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        rayo.mostrar();
        rayo.avanzar();
        rayo.usarTurbo();
        rayo.mostrar();
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        trueno.mostrar();
        while (trueno.getAutonomiaRest() != 0)
            trueno.usarTurbo();
        trueno.mostrar();
        trueno.repostar();
        trueno.mostrar();
    }
}
