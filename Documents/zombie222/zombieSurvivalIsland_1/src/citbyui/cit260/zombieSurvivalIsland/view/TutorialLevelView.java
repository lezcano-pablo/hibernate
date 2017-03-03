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
public class TutorialLevelView extends View{

    
    public TutorialLevelView() {
         super("\n On this level will will have a backpack filled with"
                    +"\n Items such as food, wood, tools"
                    +"\n The damage level will be low compared with the normal level"
                    +"\n *****************************************************");
    }
    
    
    public boolean doAction(String tutorial) {
       tutorial = tutorial.toUpperCase(); // convert choice to upper case
        
        switch (tutorial) {
            case "R":
                
               case "C":
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

 