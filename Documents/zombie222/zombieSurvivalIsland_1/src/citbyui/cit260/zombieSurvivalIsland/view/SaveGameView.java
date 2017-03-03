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
public class SaveGameView extends View {
    
    
    
public SaveGameView() {
         super("\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| Save Game"
                    + "\n You are about to save the current game, Are you sure?                                        |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nY - Yes?"
                    +"\nN - NO?"
                    +"\nQ - Quit"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------");
    }    
 


    public boolean doAction(String SaveOption) {//this function shows different option so that the end user can chooose
        SaveOption = SaveOption.toUpperCase(); // convert choice to upper case
        
        switch (SaveOption) {
            case "Y":
                this.ConfirmationOption();
                break;
            case "N":
                this.cancelGame();
                break;
                case "Q":
                this.quit();
                break;
            default:    
                System.out.println("\n** Invalid selection ** Try again"); 
        }

        return false;

}

    

    private void cancelGame() {
        System.out.println("\n** cancelGame() function called ** Try again");
    }

    private void quit() {
        System.out.println("\n** quit() function called ** Try again");
    }

    private void ConfirmationOption() {
        ConfirmationSaveView confirmationSaveView= new ConfirmationSaveView();
      confirmationSaveView.display();
    }
    
    
}
