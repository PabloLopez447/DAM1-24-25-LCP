package ud6.apuntesgenericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class E1204 {
    public static void main(String[] args) {
        Collection<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Integer num = 0;
        while (num != -1) {
            num = sc.nextInt();
            if (num >= 0) {
                lista.add(num);
            }
            sc.nextLine();
        }
        sc.close();
    }
}
