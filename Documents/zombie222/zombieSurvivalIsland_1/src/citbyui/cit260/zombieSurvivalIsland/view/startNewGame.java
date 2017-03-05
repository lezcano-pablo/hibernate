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

public class startNewGame extends View {

    
    /**
     *
     */
    public startNewGame() {
         super("\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| SELECT A LEVEL                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nE - Easy"
                    +"\nN - Normal"
                    +"\nH - Hard"
                    +"\nQ - Quit "
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------");
    }

   
@Override
    public boolean doAction(String value) {
      
       
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "E":
                this.startEasyGame();
                break;
            case "N":
                this.startNormalGame();
                break;
            case "H":
                this.startHardGame();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }

        return false;

}

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

    private void startEasyGame() {
         StartEasyGameView startEasyGameView = new StartEasyGameView();
       startEasyGameView.display();
        }
    

    private void startNormalGame() {
               StartNormalGameView StartNormalGameView = new StartNormalGameView();
       StartNormalGameView.display();
}
    

    private void startHardGame() {
      System.out.println("\n*** startHardGame() function called***"); 
    }

  
}

    
    
    

