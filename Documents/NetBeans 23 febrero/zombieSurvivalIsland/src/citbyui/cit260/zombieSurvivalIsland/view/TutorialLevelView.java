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
public class TutorialLevelView {

    private final String menu;
    
    /**
     *
     */
    public TutorialLevelView() {
         this.menu = "\n On this level will will have a backpack filled with"
                    +"\n Items such as food, wood, tools"
                    +"\n The damage level will be low compared with the normal level"
                    +"\n *****************************************************";
    }
    
    /**
     *
     */
    public void displayTutorialLevelView() {
    
    boolean done2 = false;
    do  {
        
        String tutorial = this.getTutorial();
        if (tutorial.toUpperCase().equals("Q"))
            return;
            
        done2 = this.doAction(tutorial);    
    
    } while (!done2);
    
}

    private String getTutorial() {
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
    private boolean doAction(String tutorial) {
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
       mainMenuView.displayMainMenuView();
    }

}

 