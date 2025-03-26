package ud4.cositas;

import java.util.Random;

public class asd3 {
    public static void main(String[] args) {
        
        int[] arr1 =  {1,2,3,4};

        //int[] arr2 = numeroAleatorios(arr1);  //arrRNG

        String asd = "Holafdsfffffffffffffffffffffffffffffffffffffsdfsdfsdf";
        
        cambioString(asd);
        // asd = 
        System.out.println();

        numeroAleatorios(arr1);  //arrRNG

    }

    static void cambioString(String asd){
        //String h = asd.substring(0, 1);
        String body = asd.substring(1, asd.length());

        asd = body;
    }


    static void numeroAleatorios(int[] arr){
        Random rng = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(10+1);            
        }
    }

    static int[] numeroAleatorios2(int[] arr){
        int[] arrRNG = arr.clone();
        Random rng = new Random();

        for (int i = 0; i < arrRNG.length; i++) {
            arrRNG[i] = rng.nextInt(10+1);            
        }


        return arrRNG;
    }



}
