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
 * 
 */
public class DeBord_Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Variables and strings fo the menu
            int option = -1;
            Game myGame = new Game();
            System.out.println("Welcome to Game Review Catalog!");
        do{
            myGame.printMenu();
            option = myGame.getOption();
            
            
            //Swith Statement
            switch(option){
                case -1: //Exit
                    break;
                case 1: //Add a New Review Score
                    myGame.addOption(option);
                    break;
                case 2: //Add a New Reviewer
                    myGame.addOption(option);
                    break;
                case 3: //Print Stats
                    myGame.printStats();
                    break;
                case 4: // Add New Game
                    myGame.getGameName();
                    break;
                default:
                System.out.println("Not A Valid Option.");
            }
        } while(option != -1);
    }
    
}