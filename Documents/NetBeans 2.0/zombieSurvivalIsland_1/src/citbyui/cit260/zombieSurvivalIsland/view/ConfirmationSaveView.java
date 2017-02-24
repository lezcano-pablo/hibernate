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
public class ConfirmationSaveView {

    private final String help;
    
    public ConfirmationSaveView() {
         this.help = "\n"
                    +"\n#####################################################"
                    +"\n-----------------------------------------------------"
                    +"\n| Save Game"
                    + "\n Your game has been saved successfully!                                        |"
                    +"\n-----------------------------------------------------"
                    +"\nR -  Type R to return to the main menu"
                    +"\n-----------------------------------------------------"
                    +"\n#####################################################";
    }        
    
public void displayConfirmationSaveView() {
    
    boolean done = false;
    do  {
        
        String ConfirmationOption = this.getConfirmationOption();
        if (ConfirmationOption.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(ConfirmationOption);    
    
    } while (!done);
    
    
    
}    

    private String getConfirmationOption() {
        Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.help);
             
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

    
    private boolean doAction(String ConfirmationOption) {
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
       mainMenuView.displayMainMenuView();
    }
 }
    

