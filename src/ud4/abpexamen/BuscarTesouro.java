// Álvaro Barrientos Pazos

package ud4.abpexamen;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BuscarTesouro {

    static Scanner sc = new Scanner(System.in);
    static String[][] worldMap;
    static int treasureY, treasureX;

    public static void main(String[] args) {
        
        boolean isGuessing = true;

        createWorldMap();

        int nlifes = (int)((worldMap.length * worldMap[0].length)*0.1);
        //int nlifes = 20;

        System.out.println(nlifes);

        int posY;
        int posX;

        String mensaje = "Máis ao ";
        String dir ="";

        do {
            posY = inputInt("Introduce el eje Y de la coordenada: ");
            posX = inputInt("Introduce el eje X de la coordenada: ");


            if (treasureX==posX && treasureY==posY){
                System.out.println("¡¡Has acertado!!");
                isGuessing = false;
            }
            else{
                if(treasureX == posX){
                    dir = treasureY>posY?"sur":"norte";
                }
                else if (treasureY == posY){
                    dir = treasureX>posX?"este":"oeste";
                }
                else if (treasureX > posX){
                    dir = treasureY>posY?"sureste":"noreste";
                }
                else {
                    dir = treasureY>posY?"suroeste":"nordés";
                }
                nlifes--;

                if (nlifes == 0) {
                    System.out.println("Has perdido...");
                    isGuessing = false;
                }
                else{
                    System.out.println(mensaje+dir+" "+calculateDistanceTo(posY, posX));
                }

            }
            
            printWorldMap(posY, posX);


        } while (nlifes>0 && isGuessing);
        
    }

    static String calculateDistanceTo(int posY, int posX){
        double d =  Math.sqrt(Math.pow(posX - treasureX,2) + Math.pow(posY - treasureY,2));
        //double d =  Math.sqrt(Math.pow(treasureX-posX,2) + Math.pow(treasureY-posY,2));

        System.out.printf("Distancia: %.2fKm \n",d);

        if (d<=2.){
            return "preto";
        }

        return "lonxe";
    }


    static void createWorldMap(){

        int y = inputInt("Introduce el número de filas: ");
        int x = inputInt("Introduce el número de columnas");

        worldMap = new String[y][x];
        
        for (String[] row : worldMap) {
            Arrays.fill(row, "~");
        }

        Random rng = new Random();

        treasureY = rng.nextInt(y);
        treasureX = rng.nextInt(x);

        worldMap[treasureY][treasureX] = "T";
    }
    

    static void printWorldMap(){
        for (int i = 0; i < worldMap.length; i++) {
            for (int j = 0; j < worldMap[i].length; j++) {
                System.out.print(worldMap[i][j]);
            }
            System.out.println();
        }
    }

    static void printWorldMap(int posY, int posX){
        for (int i = 0; i < worldMap.length; i++) {
            for (int j = 0; j < worldMap[i].length; j++) {
                if (i == posY && j == posX){
                    worldMap[i][j] = "X";
                }
                
                System.out.print(worldMap[i][j]);
                

            }
            System.out.println();
        }
    }


    public static int inputInt(String mensaje){
        int input = -1;
        
        while (input == -1) {
            System.out.println(mensaje);
            System.out.print("Opción: ");
            try {
                input = sc.nextInt();
                sc.nextLine();
                
            }
            catch (InputMismatchException e) {
                System.out.println("Por favor introduzca un número entero valido");
                sc.nextLine();
            }

        }

        System.out.println();
        return input;
    }






}
