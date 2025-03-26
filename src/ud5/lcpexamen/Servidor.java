package ud5.lcpexamen;

import java.util.Arrays;

// Pablo López Couso

public class Servidor extends Host {

    Servicio[] servicios = new Servicio[0];

    public Servidor(String nombre, String ip, String mac) {
        super(nombre, ip, mac);
    }

    @Override
    public String toString() {
        String servi = "";

        for (Servicio servicio : this.servicios) {
            servi += servicio.toString() + "\n";
        }

        return nombre + " " + "(" + ip + ")\n" + servi;
    }

    boolean addServicio(String nombre, int puerto, String tipo) {
        Servicio s = new Servicio(nombre, puerto, tipo);
        for (Servicio servicio : servicios) {
            if (servicio.puerto != s.puerto && servicio.tipo != s.tipo) {
                this.servicios = Arrays.copyOf(servicios, servicios.length + 1);
                servicios[servicios.length - 1] = s;
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("\nClase Servidor");
        System.out.println("==============\n");
        Servidor s1 = new Servidor("dam1", "192.168.0.117", "CC-11-22-33-44-AA");
        s1.addServicio("MySQL", 3306, "TCP");
        Servidor s2 = new Servidor("seixo", "192.168.0.11", "BB:11:22:33:44:55");
        s2.addServicio("HTTP", 80, "TCP");
        s2.addServicio("Proxy", 3128, "TCP");
        Servidor s3 = new Servidor("lapaman", "192.168.0.9", "AA:11:22:33:44:55");
        s3.addServicio("HTTP", 80, "TCP");
        s3.addServicio("Web", 80, "TCP");
        s3.addServicio("DNS", 53, "UDP");
        s3.addServicio("FTP", 21, "TCP");
        s3.addServicio("SSH", 22, "TCP");

        Servidor[] servidores = { s1, s2, s3 };
        for (Servidor s : servidores) {
            System.out.println(s);
        }

        // Tu código aquí

    }

    public class Servicio {
        String nombre;
        int puerto;
        String tipo;

        public Servicio(String nombre, int puerto, String tipo) {
            this.nombre = nombre;
            this.puerto = puerto;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return "* " + nombre + "(" + puerto + tipo + ")";
        }

    }
}
