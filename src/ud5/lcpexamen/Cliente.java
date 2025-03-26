package ud5.lcpexamen;

import java.util.Arrays;
import java.util.Comparator;

// Pablo López Couso

public class Cliente extends Host {

    enum SO {
        WINDOWS, LINUX, MAC, ANDROID, IOS,
    }

    SO so;
    String resolucion;
    String soString;
    int resolucionInt;

    public Cliente(String nombre, String ip, String mac, SO so, String resolucion) {
        super(nombre, ip, mac);
        this.so = so;
        this.resolucion = resolucion;
        switch (so) {
            case WINDOWS:
                this.soString = "Windows";
                break;
            case LINUX:
                this.soString = "Linux";
                break;
            case MAC:
                this.soString = "Mac";
                break;

            case ANDROID:
                this.soString = "Android";
                break;

            case IOS:
                this.soString = "iOS";
                break;

            default:
                break;
        }
    }

    @Override
    public String toString() {
        switch (so) {
            case WINDOWS:
                return nombre + " (Windows " + resolucion + ")";

            case LINUX:
                return nombre + " (Linux " + resolucion + ")";

            case MAC:
                return nombre + " (Mac " + resolucion + ")";

            case ANDROID:
                return nombre + " (Android " + resolucion + ")";

            case IOS:
                return nombre + " (iOS " + resolucion + ")";

            default:
                return "";
        }
    }

    public String getSoString() {
        return soString;
    }

    public static void main(String[] args) {
        System.out.println("\nClase Cliente");
        System.out.println("=============\n");
        Cliente cWin1 = new Cliente("Cliente1", "192.168.1.2", "02:1A:2B:3C:4D:5E", SO.WINDOWS, "1920x1080");
        Cliente cLin2 = new Cliente("Cliente2", "192.168.1.3", "01:1A:2B:3C:4D:5F", SO.LINUX, "1366x768");
        Cliente cMac3 = new Cliente("Cliente3", "192.168.1.4", "04:1A:2B:3C:4D:60", SO.MAC, "2560x1440");
        Cliente cAnd4 = new Cliente("Cliente4", "192.168.1.5", "03:1A:2B:3C:4D:61", SO.ANDROID, "1080x2340");
        Cliente cIos5 = new Cliente("Cliente5", "192.168.1.6", "05:1A:2B:3C:4D:62", SO.IOS, "1170x2532");

        Cliente[] clientes = { cWin1, cLin2, cMac3, cAnd4, cIos5 };
        Arrays.sort(clientes);
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        System.out.println();

        Arrays.sort(clientes, Comparator.comparing(Cliente::getSoString));
        for (Cliente c : clientes) {
            System.out.println(c);
        }

        System.out.println();
        /*
         * Arrays.sort(clientes, Comparator.comparing(Cliente::getresolucionInt));
         * for (Cliente c : clientes) {
         * System.out.println(c);
         * }
         */
    }

}
