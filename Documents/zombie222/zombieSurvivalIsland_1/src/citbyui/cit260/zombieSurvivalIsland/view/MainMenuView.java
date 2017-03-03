/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

import citbyui.cit260.zombieSurvivalIsland.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author FamiliaLezcano
 */
public class MainMenuView extends View
 {

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
    

public MainMenuView() {
                    super("\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| MAIN MENU                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nN - Start a new Game"
                    +"\nG - Get and start saved game"
                    +"\nH - Get help on how to play the game"
                    +"\nS - Save game"
                    +"\nQ - Quit the game"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------");
    }


    

         
    public boolean doAction(String value) {
       
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }

        return false;

}

    

    private void startExistingGame(){
        StartExistingGameView StartExistingGameView= new StartExistingGameView();
      StartExistingGameView.display();
    }

   

    private void displayHelpMenu() {
        HelpMenuView HelpMenuView = new HelpMenuView();
       HelpMenuView.display();
    }

    private void saveGame() {
          SaveGameView saveGameView= new SaveGameView();
      saveGameView.display();
    }

    private void startNewGame() {
         startNewGame startNewGame= new startNewGame();
      startNewGame.display();
    }

   
    
    
  

}          
   

   
