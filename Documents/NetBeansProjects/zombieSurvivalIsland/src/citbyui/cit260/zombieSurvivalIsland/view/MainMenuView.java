/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

import byui.cit260.zombieSurvivalIsland.control.GameControl;

import java.util.Scanner;

/**
 *
 * @author FamiliaLezcano
 */
public class MainMenuView
{
    private String menu;
    private String promptMessage;
    

public MainMenuView() {
         this.menu = "\n"
                    +"\n-----------------------------------------------------"
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
                    +"\n-----------------------------------------------------";
    }

public void displayMainMenuView() {
    
    boolean done = false;
    do  {
        
        String menuOption = this.getMenuOption();
        if (menuOption.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(menuOption);    
    
    } while (!done);
    
}
    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.menu);
             
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

    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
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
      StartExistingGameView.displayStartExistingGameView();
    }

   

    private void displayHelpMenu() {
         System.out.println("*** displayHelpMenu function called ***");
    }

    private void saveGame() {
          SaveGameView saveGameView= new SaveGameView();
      saveGameView.displaySaveGameView();
    }

    private void startNewGame() {
         startNewGame startNewGame= new startNewGame();
      startNewGame.displayStartNewGame();
    }

   
    
    
  

}          
   

   
