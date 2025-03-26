package ud5.lcpexamen;

import java.util.Arrays;

// Pablo López Couso

public class Host implements Comparable<Host> {

    String nombre;
    String ip;
    String mac;
    String mascara;
    String gateway;
    String dns;

    public Host(String nombre, String ip, String mac) {
        if (nombre == null) {
            throw new IllegalArgumentException("El valor de nombre no puede ser nulo");
        }
        if (!validarMAC(mac)) {
            throw new IllegalArgumentException("Dirección MAC invalida");
        }
        if (!validarIP(ip)) {
            throw new IllegalArgumentException("Dirección IP invalida");

        }
        this.nombre = nombre;
        this.ip = ip;
        this.mac = mac;
        this.mascara = "255.255.0.0";
        this.gateway = "192.168.0.11";
        this.dns = "192.168.0.9";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Host other = (Host) obj;
        if (mac == null) {
            if (other.mac != null)
                return false;
        } else if (!mac.equalsIgnoreCase(other.mac)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + " (" + ip + mac + ") ";
    }

    @Override
    public int compareTo(Host other) {
        return this.nombre.compareTo(other.nombre);
    }

    boolean validarIP(String ip) {
        return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    boolean validarMAC(String mac) {
        return mac.matches("([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})");
    }

    public static void main(String[] args) {
        System.out.println("\nClase Host");
        System.out.println("==========\n");
        Host h100 = new Host("host100", "192.168.117.100", "00:11:22:33:44:55");
        Host h101 = new Host("equipo101", "192.168.117.101", "00:11:22:33:44:55");
        Host h102 = new Host("nodo100", "192.168.117.100", "00-11-22-33-44-AA");
        Host h103 = new Host("host103", "192.168.117.103", "00-11-22-33-44-55");

        Host[] hosts = { h100, h101, h102, h103 };
        Arrays.sort(hosts);
        for (Host h : hosts) {
            System.out.println(h);
        }

        System.out.println(h100.nombre + " = " + h101.nombre + "? " + h100.equals(h101)); // true
        System.out.println(h100.nombre + " = " + h102.nombre + "? " + h100.equals(h102)); // false
        System.out.println(h100.nombre + " = " + h103.nombre + "? " + h100.equals(h103)); // true
    }
}
