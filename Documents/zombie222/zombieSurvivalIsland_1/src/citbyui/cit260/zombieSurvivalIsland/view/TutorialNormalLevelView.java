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
public class TutorialNormalLevelView extends View {
    public TutorialNormalLevelView() {
         super("\n On this level  will have a backpack with just some"
                    +"\n Items such as food, wood, tools"
                    +"\n The damage level will be high compared with the easy level"
                    +"\n You will have only 3 lives or opportunities to complete the game"
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

 
