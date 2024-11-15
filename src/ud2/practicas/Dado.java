package ud2.practicas;

public class Dado {
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 100;
        int MAX = 6;
        int MIN = 1;
        int num1s = 0, num2s = 0, num3s = 0, num4s = 0, num5s = 0, num6s = 0;
        int porc1s, porc2s, porc3s, porc4s, porc5s, porc6s;

        System.out.println("Lanzando un dado " + NUM_LANZAMIENTOS + " veces");

        for (int i = 0; i <= NUM_LANZAMIENTOS; i++) {
            int cara = (int) (Math.random() * (MAX - MIN + 1)) + MIN;

            switch (cara) {
                case 1:
                    num1s++;
                    break;
                case 2:
                    num2s++;
                    break;
                case 3:
                    num3s++;
                    break;
                case 4:
                    num4s++;
                    break;
                case 5:
                    num5s++;
                    break;
                case 6:
                    num6s++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Han salido " + num1s + " unos");
        System.out.println("Han salido " + num2s + " doses");
        System.out.println("Han salido " + num3s + " treses");
        System.out.println("Han salido " + num4s + " cuatros");
        System.out.println("Han salido " + num5s + " cincos");
        System.out.println("Han salido " + num6s + " seises");
    }
}
