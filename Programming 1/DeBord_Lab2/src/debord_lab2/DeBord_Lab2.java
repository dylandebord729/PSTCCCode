/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab2;
import java.util.Scanner;
/**
 *Dylan DeBord
 * Programming 1
 * 2/8/2023
 * Description: Lab number 2
 */
public class DeBord_Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Import Scanner
        Scanner input = new Scanner(System.in);
         //Declare variables
         double x1;
         double y1;
         double x2;
         double y2;
         
         //Print Statements
         System.out.print("Enter the first X coordinate: ");
         x1 = input.nextDouble();
         System.out.print("Enter the first Y coordinate: ");
         y1 = input.nextDouble();
         System.out.print("Enter the second X coordinate: ");
         x2 = input.nextDouble();
         System.out.print("Enter the second Y coordinate: ");
         y2 = input.nextDouble();
         
         //Declare variables for midpoint
         double midx = (x1+x2)/2;
         double midy = (y1+y2)/2;
         double distance = Math.pow(y2-y1, 2)+ Math.pow(x2-x1, 2);
         
         //Results
         System.out.println("The distance is SQRT("+distance+")");
         System.out.println("");
         System.out.println("The midpoint is ("+midx+","+midy+")");

    }
    
}
