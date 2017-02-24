/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

import java.util.Scanner;

/**
 *
 * @author FamiliaLezcano
 */
public class GoalOfGameView {
     private String goal;
    
    
    public GoalOfGameView() {
         this.goal = "\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n|               GOAL OF THE GAME                    |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n - What is the goal of the game?                     "
                    +"\n The goal of the game it's pretty simple. You need to"
                    +"\n find the required materials(resources) in order to  "
                    +"\n fix the ship that was destroyed.                    "
                    +"\n There are zombies out there that want you dead. You "
                    +"\n need to run for your life and defeat the zombiens   "
                    +"\n while getting everything ready to go back home.     "
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------";
    }

public void displayGoalOfGameView() {
    
    boolean done = false;
    do  {
        
        String goalOfGame = this.getGoalOfGame();
        if (goalOfGame.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(goalOfGame);    
    
    } while (!done);
    
}
    private String getGoalOfGame() {
        Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.goal);
             
             value = keyboard.nextLine();
             value = value.trim(); //
             
             if(value.length()< 1){
                 
                 System.out.println("\nInvalid value: value can not be blank");
                 continue;
             }
             
             break;//end the loop
         
    }
         
         return value;//return the value entered
    }

    public boolean doAction(String goalOfGame) {
        
        goalOfGame = goalOfGame.toUpperCase(); // convert choice to upper case
        
        switch (goalOfGame) {
            
            case "Q":
                this.quit();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }
        
        return false;
    
}   
    private void quit() {
        System.out.println("*** quit function called ***");
    }
    
    
}

