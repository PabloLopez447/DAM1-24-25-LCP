package ud2.ejercicios;

/*
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos).
 */

 import java.util.Scanner;

 public class E0212 {
     public static void main(String[] args) {
         // Declaración de variables y constantes
         int dia, mes, anho;
         boolean fechaCorrecta = true;
 
         // Entrada de datos
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce el día del mes (1-31): ");
         dia = sc.nextInt();
         System.out.println("Introduce el número de mes (1-12): ");
         mes = sc.nextInt();
         System.out.println("Introduce el año: ");
         anho = sc.nextInt();
         sc.close();
 
         // Proceso
         /* // SOLUCIÓN CON SWITCH TRADICIONAL
         switch (mes) {
             case 1:
             case 3:
             case 5:
             case 7:
             case 8:
             case 10:
             case 12:
                 if (dia < 1 || dia > 31) {
                     fechaCorrecta = false;
                 }
                 break;
             case 4:
             case 6:
             case 9:
             case 11:
                 if (dia < 1 || dia > 30) {
                     fechaCorrecta = false;
                 }
                 break;
             case 2:
                 if (dia < 1 || dia > 28) {
                     fechaCorrecta = false;
                 }
                 break;
             default:
                 fechaCorrecta = false;
         }
         */        
 
         // Otra opción más comprimida del switch
         switch (mes) {
             case 1, 3, 5, 7, 8, 10, 12:
                 fechaCorrecta = dia >= 1 && dia <= 31;
                 break;
             case 4, 6, 9, 11:
                 fechaCorrecta = dia >= 1 && dia <= 30;
                 break;
             case 2:
                 fechaCorrecta = dia >= 1 && dia <= 28;
                 break;
             default:
                 fechaCorrecta = false;
         }
 
         // Salida
         if (fechaCorrecta) {
             System.out.printf("La fecha es correcta: %d/%d/%d%n", dia, mes, anho);
         } else {
             System.out.println("La fecha NO es correcta");
         }
     }
 
 }
