/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab6;
import java.util.Scanner;
/**
 * Dylan DeBord
 * Programming 1
 * Lab 6 for programming 1
 * due: 4/11/2023 0900
 */
public class DeBord_Lab6 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Map Printing
        int mapSize = 0;
        mapSize = readMapSize();
        String coordinates = readCoordinates();
        printTreasureMap(coordinates, mapSize);
    }

    static int readMapSize(){
        //Scanner
            Scanner input = new Scanner(System.in);
        //Map Size
        //Declare variable
        int mapSize = 0;
        //While loop
        while(mapSize <=0){
            System.out.print("What is the size of your map? ");
            mapSize = input.nextInt();
            if (mapSize <= 0){
            System.out.println("I'm sorry, you can't havea map of negitive size.");
            }
        } 
        return mapSize;
    }
    
    //Coordinates
    static String readCoordinates(){
        //Scanner
            Scanner input = new Scanner(System.in);
        //Variables
        int x = 0;
        int y = 0;
        String direction = "";
        
        //While loop
        while(direction.equalsIgnoreCase("Done") == false){
            System.out.print("What direction do you want to go?");
            direction = input.next();
            if (direction.equalsIgnoreCase("Up")){
                y -= 1;
            } else if (direction.equalsIgnoreCase("Left")){
                x -= 1;
            } else if (direction.equalsIgnoreCase("Down")){
                y += 1;
            }else if (direction.equalsIgnoreCase("Right")){
                x += 1;
            } else if(direction.equalsIgnoreCase("Done")){
                //Do Nothing
            } else {
            System.out.println("I'm sorry not a vaild direction.");
            }
        }
        return x+" "+y;
    }
// Print Map Function
    static void printTreasureMap(String coordinates, int mapSize){
        int x = 0;
        int y = 0;
        int k = coordinates.indexOf(' ');
        String xstr = coordinates.substring(0,k);
        String ystr = coordinates.substring(k+1);
        int cordx = Integer.parseInt(xstr);
        int cordy = Integer.parseInt(ystr);
        if (cordx < 0 || cordy < 0 || cordx > mapSize || cordy > mapSize){
            System.out.println("Your coordinates are outside the map, Not printing the map.");
            return;
        }
        //Coordinates
        System.out.println(coordinates);
        for(y = 0; y < mapSize; y++){
            for(x = 0; x < mapSize; x++){
                if(x == cordx && y == cordy){
                    System.out.print("X");
                } else if (x == 0 && y == 0){
                    System.out.print("!");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
//function.equalsIgnoreCase("Oak");