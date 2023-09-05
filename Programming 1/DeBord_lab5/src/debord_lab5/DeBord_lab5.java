/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab5;
import java.util.Scanner;
/**
 *Name: Dylan DeBord
 * Programming 1
 * Desc: Tree counter for oak, pine, etc.
 */
public class DeBord_lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make Scanner
        Scanner input = new Scanner(System.in);re
        
        //variables
        int numTrees = 0;
        int treeCount = 0;
        int pineTree = 0;
        int pineLeaves = 0;
        int oakTree = 0;
        int oakLeaves = 0;
        int birchTree = 0;
        int birchLeaves = 0;
        int otherTree = 0;
        int otherLeaves = 0;
        int treeHeight = 0;
        int thisTreeLeaves = 0;
        String treeType;
        
        //Loops
        while (numTrees != -1){
            System.out.print("How many trees are in this Cluster?: ");
            numTrees = input.nextInt();
            if (numTrees == -1){
                break;
            } 
            else if(numTrees < -1){
                continue;
            } 
            else if(numTrees == 0){
            System.out.println("No trees in the cluster");
            } else {
                for (treeCount = 0; treeCount< numTrees; treeCount++){
                System.out.println("What type of tree?: ");
                treeType = input.next();
                treeHeight = 0;
                while (treeHeight < 1){
                    System.out.println("Enter tree height:");
                    treeHeight = input.nextInt();
                }
                if (treeType.equalsIgnoreCase("Oak")) {
                        oakTree++;
                        thisTreeLeaves = 100 + (int)(Math.random() * 50);
                        oakLeaves += (thisTreeLeaves * treeHeight);
                } else if(treeType.equalsIgnoreCase("Pine")) {
                        pineTree++;
                        thisTreeLeaves = 25 + (int)(Math.random() * 25);
                        pineLeaves += (thisTreeLeaves * treeHeight);
                } else if(treeType.equalsIgnoreCase("Birch")) {
                        birchTree++;
                        thisTreeLeaves = 75 + (int)(Math.random() * 10);
                        birchLeaves += (thisTreeLeaves * treeHeight);
                } else{
                        otherTree++;
                        otherLeaves += (75 * treeHeight);
                    }
                }
            }
        }
        
        //Print Statements
       System.out.printf("%10s,%15s,%7s,%12s\n","Tree","Total Leaves","Count","Avg. Leaves");
       System.out.printf("%10s,%15d,%7d,%12.2f\n","Pine",pineLeaves,pineTree,(double)pineLeaves/pineTree);
       System.out.printf("%10s,%15d,%7d,%12.2f\n","Oak",oakLeaves,oakTree,(double)oakLeaves/oakTree);
       System.out.printf("%10s,%15d,%7d,%12.2f\n","Birch",birchLeaves,birchTree,(double)birchLeaves/birchTree);
       System.out.printf("%10s,%15d,%7d,%12.2f\n","Other",otherLeaves,otherTree,(double)otherLeaves/otherTree);
    } //main
    
}
