/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab4problem1;
import java.util.Scanner;
/**
 * Name: Dylan DeBord
 * Programming 1
 * Lab 4
 * Random word Generator
 */
public class DeBord_lab4Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);
        //Welcome line
        System.out.println("Welcome to The random word generator");
        //Declare variables
       char Letter1 = (char)(65 + (int)(Math.random() * 26));
       char Letter2 = (char)(65 + (int)(Math.random() * 26));
       char Letter3 = (char)(65 + (int)(Math.random() * 26));
       char Letter4 = (char)(65 + (int)(Math.random() * 26));
       char Letter5 = (char)(65 + (int)(Math.random() * 26));
       
       //Print Statement
       System.out.println("Random Word: "+Letter1+Letter2+Letter3+Letter4+Letter5);
    }
    
}
