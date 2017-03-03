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
public class ConfirmationSaveView extends View{

    
    public ConfirmationSaveView() {
         super("\n"
                    +"\n#####################################################"
                    +"\n-----------------------------------------------------"
                    +"\n| Save Game"
                    + "\n Your game has been saved successfully!                                        |"
                    +"\n-----------------------------------------------------"
                    +"\nR -  Type R to return to the main menu"
                    +"\n-----------------------------------------------------"
                    +"\n#####################################################");
    }        
    

    
    public boolean doAction(String ConfirmationOption) {
    ConfirmationOption = ConfirmationOption.toUpperCase(); // convert choice to upper case
        
        switch (ConfirmationOption) {
            case "R":
                this.MainMenuView();
                break;
           
        }

        return false;

}    

    private void MainMenuView() {
         MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.display();
    }
 }
    

