package ud1.ejercicios;

/* Repite el programa anterior para que, indicando dos números n y m, diga que cantidad hay que sumarle a n para que sea múltiplo de m. 

    A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7
    A 13 hay que sumarle 1 para que el resultado (2+5=7) sea múltiplo de 7
    A 14 no hay que sumarle nada (0) para que sea múltiplo de 7 */

    import java.util.Scanner; 

    public class EP0130 {
        public static void main(String[] args) {
    
            // Cantidad que hay que sumarle para que el resultado sea múltiplo de 7
            int n, m, resto, suma;
            Scanner scanner = new Scanner (System.in);
    
            System.out.print("Introduzca un número entero: ");
            n = scanner.nextInt();
            System.out.print("Introduzca otro número entero para comprobar si es o no múltiplo: ");
            m = scanner.nextInt();
            scanner.close();
    
            resto = n % m;
            suma = (resto == 0) ? 0 : (m - resto);
    
    
            String mensaje = (resto  != 0) 
            ? String.format("\nA %d hay que sumarle %d para que el resultado (%d+%d=%d) sea múltiplo de %d\n", n, suma, n, suma, n + suma, m) 
            : String.format("\nA %d no hay que sumarle nada (0) para sea múltiplo de %d\n", n, m);
            System.out.println(mensaje);
        }
    }