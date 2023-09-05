/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab4problem2;
import java.util.Scanner;
/**
 * Name: Dylan DeBord
 * Programming 1
 * Lab 4
 * Course Validity checker
 * 
 */
public class DeBord_lab4Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Import Scanner
        Scanner input = new Scanner(System.in);
        
        //Ask the user for an input
        System.out.println("Enter a Course: ");
        
        // Declare Variables
        String s1 = input.next();
        String s2 = input.next();
        boolean invalidcourse = false;
        boolean invalidlevel = false;
        
        //Error Checking
        if (s1.compareToIgnoreCase("ENGL")!=0){
        if (s1.compareToIgnoreCase("MATH")!=0){
        if (s1.compareToIgnoreCase("CITC")!=0){
        invalidcourse = true;
                }
            }
        }
        
       if(s2.charAt(0) < '1' || s2.charAt (0) > '4'){
           invalidlevel = true;
        }else if(s2.length() != 3){
        invalidlevel = true;
        }

       if (invalidcourse == true){
        System.out.println("The subject is not valid for this course. Exiting now.");
        } else if (invalidlevel == true){
        System.out.println("This is not a valid course level. Exiting now.");
        } else {
        System. out.println("This is a valid course");
        }
    }
    
}
