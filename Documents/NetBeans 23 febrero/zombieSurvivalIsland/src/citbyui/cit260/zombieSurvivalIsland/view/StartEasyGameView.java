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
public class StartEasyGameView {
    
     private final String menu;
    
    /**
     *
     */
    public StartEasyGameView() {
         this.menu = "\n"
                    +"\n*****************************************************"
                    +"\n*****************************************************"
                    +"\n| EASY GAME LEVEL SELECTED                          |"
                   
                    +"\n GET READY FOR THE ACTION!!!                         "
                    +"\nC Type C to start the tutorial"
                 +  "\nR Type R to return to the main menu"
                    +"\n*****************************************************"
                    +"\n*****************************************************";
    }
    
     public void displayStartEasyGameView() {
    
    boolean done2 = false;
    do  {
        
        String easyLevel = this.getEasyLevel();
        if (easyLevel.toUpperCase().equals("Q"))
            return;
            
        done2 = this.doAction(easyLevel);    
    
    } while (!done2);
    
}

    private String getEasyLevel() {
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
    
    private boolean doAction(String easyLevel) {
      easyLevel = easyLevel.toUpperCase(); // convert choice to upper case
        
        switch (easyLevel) {
            case "C":
                TutorialLevelView tutorialLevelView = new TutorialLevelView();
       tutorialLevelView.displayTutorialLevelView();
                break;
               case "R":
                this.MainMenuView();
                break;  
           
        }

        return false;

}    

    private void MainMenuView() {
         MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.displayMainMenuView();
    }
 }
    