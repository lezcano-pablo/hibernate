/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

/**
 *
 * @author FamiliaLezcano
 */
public class StartHardGameView extends View{
public StartHardGameView() {
         super("\n"
                    +"\n*****************************************************"
                    +"\n*****************************************************"
                    +"\n| HARD GAME LEVEL SELECTED                          |"
                   
                    +"\n GET READY FOR THE ACTION!!!                         "
                    +"\nC Type C to start the tutorial"
                 +  "\nR Type R to return to the main menu"
                    +"\n*****************************************************"
                    +"\n*****************************************************");
    }
    
    
    public boolean doAction(String hardLevel) {
      hardLevel = hardLevel.toUpperCase(); // convert choice to upper case
        
        switch (hardLevel) {
            case "C":
                TutorialLevelView tutorialLevelView = new TutorialLevelView();
       tutorialLevelView.display();
                break;
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
    