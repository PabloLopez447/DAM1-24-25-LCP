package ud2.funciones;

/*
 * E0411. Escribir una función que calcule de forma recursiva el máximo común divisor de
dos números. Para ello sabemos:

mcd(a,b) =
mcd(a - b, b) si a >= b
mcd(a, b - a) si b > a
a si b = 0
b si a = 0
*/
import java.util.*;

public class E0411 {
   public static int mcd(int a, int b) {
      int mcd = 0;
      if (a >= b){
         mcd = mcd(a - b, b); 
      }
      if (b > a) {
         mcd = mcd(a, b - a);
      }
      if (a == 0) {
         mcd = b;
      }
      if (b == 0) {
         mcd = a;
      }
      return mcd;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a, b;

      System.out.print("Int 1: ");
      a = sc.nextInt();
      System.out.print("Int 2: ");
      b = sc.nextInt();
      sc.close();

      System.out.println("El MCD es: " + mcd(a, b));
   }
}
