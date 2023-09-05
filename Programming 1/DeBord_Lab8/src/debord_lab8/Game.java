/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debord_lab8;

import java.util.Scanner;

/**
 *Dylan DeBord
 * Programming 1
 * Lab 8
 * Due: 5/4/2023 (May the 4th be with you. Pun intended)
 */
public class Game {
    //Variables and strings fo the menu
            double[] ratings = new double[0];
            String[] reviewers = new String[0];
            String gameName = new String("");
    Game(){
        this.setGameName("No Name Provided");
    }
    Game(String gameName){
    this.setGameName(gameName);
    }
   static String getGameName(){
       //Make Scanner
        Scanner input = new Scanner(System.in);
        String gName = "";
    //
    System.out.print("Enter Game Name: ");
        gName = input.nextLine();
        return gName;
    }
   void setGameName(String gameName){
    this.gameName = gameName;
   }
   void printMenu(){
        //Print Menu Options
        System.out.println("1 -- Add New Review Score");
        System.out.println("2 -- Add New Reviewer");
        System.out.println("3 -- Print Stats");
        System.out.println("4 -- Set Game Name");
        System.out.println("-1 -- Quit");
    }
   int getOption(){
    //Make Scanner
        Scanner input = new Scanner(System.in);
     //Option Variable
        int option = 0;
     //option Input next Int
        option = input.nextInt();
        return option;
    }
   void addOption(int option){
       if (option == 1){
           addEntry(ratings);
       }else if (option == 2){
           addEntry(reviewers);
       }
   }
   private void addEntry(double[] ratings){
    //Make Scanner
       Scanner input = new Scanner(System.in);
    //Rating print Satement and double
       System.out.print("Enter your Rating: ");
       //Double stuff
       double rating = input.nextDouble();
       //icrease Arry for rating
      this.ratings = increaseArray(rating);
    }
   private void addEntry(String[] reviewers){
    //Make Scanner
        Scanner input = new Scanner(System.in);
    //
    System.out.print("Enter your Reviewer: ");
    String reviewer = input.nextLine();
    this.reviewers = increaseArray(reviewer);
    }
    // DOUBLE increase Array
    private double[] increaseArray(double rating){
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
    private String[] increaseArray(String reviewer){
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
    private void rateGame(){
        //Ints
        int arrSize = ratings.length;
        int idx = 0;
        double totalRating = 0;
        // for loop
        for(idx = 0; idx < arrSize; idx++){
            totalRating += ratings[idx];
        }
        System.out.printf("%3.1f  average    %4d  ratings    %4d   reviewers\n ", totalRating/ratings.length, ratings.length, reviewers.length);
    }
    void printStats(){
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
       rateGame();
   }
}