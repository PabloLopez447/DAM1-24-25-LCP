package ud4.cositas;

import java.util.Arrays;

public class Cositas {



    public static void main(String[] args) {
        metodosParaParsearUnaString();    
    }


    static void metodosParaParsearUnaString(){
        String str1 = "Ah! Hola que tal";

        MetodoCharAt(str1);

        StringToCharArr(str1);

        BuscarLetra(str1);

    }


    @SuppressWarnings("unused")
    static void MetodoCharAt(String str){

        // Seleccionar un caracteres de la string en una posicion de 0 a str.lenght-1;
        char c1 = str.charAt(0);

        // Usando un for loop usando la longitud de la array y el metodo charAt
        for (int i = 0; i < str.length(); i++) {
            System.out.println( str.charAt(i) );
        }
    }


    static void StringToCharArr(String str){

        str = str.toLowerCase(); // Las arrays no tienen metodos para transformar a minusculas por lo que lo hacemos sobre la string antes de transformarla a una array
        char arrChar[] = str.toCharArray();
        
        int counter = 0;
        char letra = 'l';


        // Usando este tipo de loop no tenemos el indice de la letra por lo que no podemos saber su posicion.
        for (char c : arrChar) {
            if (c == letra) {
                counter++;
            }
        }

        
        int[] arrPos = new int[str.length()]; // Creamos una array con la longitud de la string pues podia ser posible que la string este completamente compuesta por la letra que buscamos
        counter = 0; // Teseteamos counter

        // Tambien podrias usar arrPos.length ya que tienen el mismo tamaño al principio
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra){
                arrPos[counter] = i;
                counter++;
            }
        }

        arrPos = Arrays.copyOf(arrPos, counter); // Recortamos la array a el numero de veces que se encontro la letra
        System.out.println(Arrays.toString(arrPos));
        
        // { 1,2,3,4,5,6,7,8,9 }

        // { 0,2,3,4,5,6,7,8,9,0 }
        int[] arrN = new int[10];
        System.arraycopy(arrChar, 2, arrPos, 1,arrPos.length-2 );

        System.out.println(Arrays.toString(arrN));

    }


    @SuppressWarnings("unused")
    static void BuscarLetra(String str){
        //        0123456789
        // str = "Ah!HolaTal";

        char letra = 'A';

        // Este metodo no altera la String, devuelve una copia por lo que debes guardarla en una variable str dentro de esta funcion no esta alterando el valor de str1 en metodosParaParsearUnaString()
        str.toUpperCase();

        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == letra ){
                System.out.printf("Encontrada letra %s en posicion: %d\n",letra,i);
            }
        }



        str = str.toLowerCase();

        

        // 012345
        // Pablo!Pablo!
        // Devuelve el solo la posicion de la primera coincidencia
        int posEM1 = str.indexOf('!');
        
        int posA1 = str.indexOf('a');
        System.out.println(str.length());
        int posL1 = str.indexOf('l',7);

        // Se pueden delimitar rangos:
        int posA3 = str.indexOf('a',3);                  // Incluye la letra en la posicion de inicio.
        int posL2 = str.indexOf('l',7, str.length()-1); // La posicion final es exclusiva
        int posL3 = str.indexOf('l',7, str.length());   // Si queremos la última letra debemos incluir el tamaño real de la String


        //             012345678
        String test = "123123123";

        int posN1 = test.indexOf('1',4, test.length()-3); // Buscamos en la cadena ignorando los primeros 4 caracteres y los 3 ultimos
        System.out.printf("%d\n",posN1);
    }

}
