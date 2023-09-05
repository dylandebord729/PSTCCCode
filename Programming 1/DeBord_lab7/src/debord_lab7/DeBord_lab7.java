/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab7;
import java.util.Scanner;
/**
 *Name: Dylan DeBord
 * Programming 1
 * Lab 7
 * Due 4/21/23 at 0900
 * 
 */
public class DeBord_lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables and strings fo the menu
            int option = -1;
            double[] ratings = new double[0];
            String[] reviewers = new String[0];
            System.out.println("Welcome to Game Review Catalog!");
        do{
            printMenu();
            option = getOption();
            
            
            //Swith Statement
            switch(option){
                case -1: //Exit
                    break;
                case 1: //Add a New Review Score
                    ratings = addEntry(ratings);
                    break;
                case 2: //Add a New Reviewer
                    reviewers = addEntry(reviewers);
                    break;
                case 3: //Print Stats
                    printStats(reviewers, ratings);
                    break;
                default:
                System.out.println("Not A Valid Option.");
            }
        } while(option != -1);
    }
    public static void printMenu(){
        //Print Menu Options
        System.out.println("1 -- Add New Review Score");
        System.out.println("2 -- Add New Reviewer");
        System.out.println("3 -- Print Stats");
        System.out.println("-1 -- Quit");
    }
    public static int getOption(){
    //Make Scanner
        Scanner input = new Scanner(System.in);
     //Option Variable
        int option = 0;
     //option Input next Int
        option = input.nextInt();
        return option;
    }
    public static double[] addEntry(double[] ratings){
    //Make Scanner
        Scanner input = new Scanner(System.in);
    //Rating print Satement and double
        System.out.print("Enter your Rating: ");
        //Double stuff
        double rating = input.nextDouble();
        //Return
        return increaseArray(rating, ratings);
    }
    public static String[] addEntry(String[] reviewers){
    //Make Scanner
        Scanner input = new Scanner(System.in);
    //
    System.out.print("Enter your Reviewer: ");
    String reviewer = input.nextLine();
    return increaseArray(reviewer, reviewers);
    }
    // DOUBLE increase Array
    public static double[] increaseArray(double rating, double[] ratings){
        //Ints
        int arrSize = ratings.length + 1;
        int idx = 0;
        //double for new ratings.
        double[] newRatings = new double[arrSize];
        // for loop
        for(idx = 0; idx < arrSize - 1; idx++){
            newRatings[idx] = ratings[idx];
        }
        newRatings[arrSize-1] = rating;
        return newRatings;
    }
    // String increase Array
    public static String[] increaseArray(String reviewer, String[] reviewers){
        //Ints
            int arrSize = reviewers.length + 1;
            int idx = 0;
        //String for new ratings.
            String[] newReviewers = new String[arrSize];
        // for loop
            for(idx = 0; idx < arrSize - 1; idx++){
                newReviewers[idx] = reviewers[idx];
            }
        newReviewers[arrSize-1] = reviewer;
        return newReviewers;
    }
   public static void printStats(String[] reviewers, double[] ratings){
       int idx;
       //Ratings
       int arrSize = ratings.length;
       System.out.printf("Ratings:  ");
       for(idx = 0; idx < arrSize; idx++){
           System.out.printf("%20.1f", ratings[idx]);
       }
       System.out.printf("\n");
       //Reviewers
       arrSize = reviewers.length;
       System.out.printf("Reviewers:");
       for(idx = 0; idx < arrSize; idx++){
           System.out.printf("%20s", reviewers[idx]);
       }
       System.out.printf("\n");
   } 
}
