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
public class SaveGameView {
    
     private final String help;
    
public SaveGameView() {
         this.help = "\n"
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
                    +"\n-----------------------------------------------------";
    }    
 
public void displaySaveGameView() {
    
    boolean done = false;
    do  {
        
        String SaveOption = this.getSaveOption();
        if (SaveOption.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(SaveOption);    
    
    } while (!done);
    
    
    
}

    private String getSaveOption() {
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

    

    private boolean doAction(String SaveOption) {
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
      confirmationSaveView.displayConfirmationSaveView();
    }
    
    
}
