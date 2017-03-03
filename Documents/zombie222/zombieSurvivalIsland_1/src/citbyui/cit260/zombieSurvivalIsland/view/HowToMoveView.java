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
public class HowToMoveView extends View {

    
    public HowToMoveView() {
         super("\n During the game,it will show you different kind of options"
                    +"\n For example, for moving you will have to choose a specific locations"
                    +"\n each of them will have a unique coordinate"
                    +"\n The coordinates will be delimited by columns and rows"
                    + "\n To move to a location you will have to type the corresponding |"
                    +"\n number of row and letter of column"
                    +"\n---------------------------------------------------------------------"
                    +"\nR - type R to return to the main menu")
                    ;
    }    
 

    

    public boolean doAction(String choice) {
         choice = choice.toUpperCase();
          switch (choice) {
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
    