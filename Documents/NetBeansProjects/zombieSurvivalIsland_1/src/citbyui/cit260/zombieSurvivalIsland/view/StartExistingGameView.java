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
public class StartExistingGameView {
     private final String load;
    
    
    public StartExistingGameView() {
         this.load = "\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| LOAD GAME                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nC - CONTINUE?"
                    +"\nQ - Quit the game"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------";
    }

public void displayStartExistingGameView() {
    
    boolean done = false;
    do  {
        
        String continueGame = this.getcontinueGame();
        if (continueGame.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(continueGame);    
    
    } while (!done);
    
}

    private String getcontinueGame() {
      Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.load);
             
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
    

    private boolean doAction(String choice) {
         choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "C":
                this.continueGame();
                break;
            case "Q":
                this.quit();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }

        return false;
    
}

    private void continueGame() {
                System.out.println("\n*** continueGame() function called"); 
    }

    private void quit() {
                System.out.println("\n*** quit() function called"); 
    }
    }
    


