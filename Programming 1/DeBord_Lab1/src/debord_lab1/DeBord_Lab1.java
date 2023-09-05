/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab1;
import java.util.Scanner;
/**
 * Dylan DeBord
 * Programming 1
 * Desc: Lab 1 for programming 1
 * 
 */
public class DeBord_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Import Scanner
       Scanner input = new Scanner(System.in);
       //tution in state
      double tution = 2052;  
      double hourcost = tution / 12;
      double totalclasscost = hourcost * 4;
      double classcost = totalclasscost / 24;
      double credithours = 4;
      double tutionpercent = 100*credithours/12;
       //in state numbers
        System.out.println("Cost per class for in-state students:$ "+classcost);
       
       System.out.println("Percent of total tution for in-state students:"+tutionpercent+"%");
       
       //Out of state
       tution = 8460;  
       hourcost = tution / 12;
       totalclasscost = hourcost * 4;
       classcost = totalclasscost / 24;
       credithours = 4;
       tutionpercent = 100*credithours/12;
       //out of state numbers
        System.out.println("Cost per class for in-state students:$ "+classcost);
       
       System.out.println("Percent of total tution for in-state students:"+tutionpercent+"%");
    }
    
}
