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
public class StartExistingGameView extends View {
    
    
    
    public StartExistingGameView() {
         super("\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| LOAD GAME                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nC - CONTINUE?"
                    +"\nQ - Quit the game"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------");
    }



    public boolean doAction(String choice) {
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
    


