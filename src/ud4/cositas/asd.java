package ud4.cositas;

import java.util.Arrays;

public class asd {


    @SuppressWarnings("unused")
    public static void main(String[] args) {

        String str = " Hola Que tal  ";
        char strEnd = '\0';
        //  String[] strArr = 

        //                                              "DAM1", "ChanDoMonte","Oscar"
        String[] estudiante = { "Alvaro", "Barrientos", "DAM1", "ChanDoMonte","Oscar", "asd", "yolo" };

        //int[][] intArr = new int[2][2];

        String[] newArr = Arrays.copyOfRange(estudiante,2,5);


        System.out.println(Arrays.toString(newArr));
        System.out.println();


        final int NOMBRE = 0;
        final int APELLIDO = 1;
        final int CURSO = 2;

        //estudiante[0]
        System.out.println( estudiante[NOMBRE] );


        String mensaje = String.format("Nombre: %s Apellido: %s",estudiante[NOMBRE],estudiante[APELLIDO]);

        mensaje = String.format(mensaje+" Curso: %s",estudiante[CURSO]);

        System.out.println(mensaje);

        if ("A" == "A")
            System.out.println(true);
        else
            System.out.println(false);


        "A".equals("A");



        String[] strArr = str.split(" ");
        String palabra = strArr[1];
        palabra.length();

        System.out.println(str.split(" ")[1]);

        System.out.println(palabra.length());

        //                          0 1 2 3 4 5 6 7 8 9
        int[] arrChar = new int[] { 3,4,5,6,7,8,9,10 };
        int[] arrN = new int[10];
        System.arraycopy(arrChar, 2, arrN, 1,arrChar.length-2 );

        System.out.println(Arrays.toString(arrN));
        

    }
}
