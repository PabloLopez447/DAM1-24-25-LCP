package ud4.cositas;

import java.util.Arrays;

public class asd2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int[] arr = new int[2];
        int[][] arr2 = new int[4][2]; // 0 1 2
        
        System.out.println();


        // -> {1,2,3,4,5} = I@4517d9a3
        // -> 1 = 1
        // -> 2 = 2

        // { {1,2,3}, {4,5,6}  }  new int[2][3]  -> Arrays.deepToString() -> "[ [1,2,3], [4,5,6] ]"
        // int[i]

        // -> {1,2,3} = I@4517d9a3  -> Arrays.toString -> "{1,2,3}"
        // -> {4,5,6} = I@4517d9a3

        // int[i][j]
        // -> 1 = 1
        // -> 2 = 2

        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
            

            for (int j = 0; j < arr2[i].length; j++) {
                System.out.println(arr2[i][j]);
            }
            
            
        }
        

    }
}
