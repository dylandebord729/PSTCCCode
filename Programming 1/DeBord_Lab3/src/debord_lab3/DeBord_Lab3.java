/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab3;
import java.util.Scanner;
/**
 *Dylan DeBord
 * 2/17/2023
 * Programming 1
 * Desc: Lab 3 Running calculator.
 */
public class DeBord_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Import Scanner
        Scanner input = new Scanner(System.in);
        
        //Menu Set up
        System.out.println("Welcome to the Running Pace Calculator!");
        System.out.println("1- Enter Pace and Time");
        System.out.println("2- Enter Time and Distance");
        System.out.println("3- Enter Distance and Pace");
        
        //Variables
        int choice = input.nextInt();
        double pacepermile = 0;
        double timeinminutes = 0;
        double distanceinmiles = 0;
        
        //If statements for the applicable choice chosen by user.
        if (choice == 1){
        System.out.print("Enter Time in minutes: ");
        timeinminutes = input.nextDouble();
        System.out.print("Enter pace in minutes per mile: ");
        pacepermile = input.nextDouble();
        } else if (choice == 2){
       System.out.print("Enter Time in minutes: ");
       timeinminutes = input.nextDouble();
       System.out.print("Enter distance in miles: ");
       distanceinmiles = input.nextDouble(); 
        } else if (choice == 3){
       System.out.print("Enter distance in miles: ");
       distanceinmiles = input.nextDouble();
       System.out.print("Enter pace in minutes per mile: ");
       pacepermile = input.nextDouble();
        } else {
            System.out.println("This is an invalid option");
            choice = 0;
        }
        
        //Switch Statement  pace = distance/time;
        switch (choice) {
            case 0: System.out.println("No calculations were done because you entered an invalid option."); break;
            case 1: 
                distanceinmiles = timeinminutes / pacepermile;
                System.out.println("Total Distance: "+distanceinmiles+" Miles"); break;
            case 2: 
                pacepermile =  timeinminutes / distanceinmiles;
                System.out.println("Average pace: "+pacepermile+" Minutes Per Mile"); break;
            case 3: 
                timeinminutes = distanceinmiles * pacepermile;
                System.out.println("Total time run: "+timeinminutes+" Minutes"); break;
        }
    }
    
}
