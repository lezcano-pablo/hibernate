/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

import java.util.Scanner;

/**
 *
 * @author LOPEZ-1
 */
public class HelpMenuView {
    private final String help;
    private String promptMessage;
    

public HelpMenuView() {
         this.help = "\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| HELP MENU                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nG - What is the goal of the game?"
                    +"\nM - How to move"
                    +"\nE - Estimating the amount of resources"
                    +"\nH - Harvesting resources"
                    +"\nQ - Quit the game"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------";
    }

public void displayHelpMenuView() {
    
    boolean done = false;
    do  {
        
        String menuOption = this.getHelpOption();
        if (menuOption.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(menuOption);    
    
    } while (!done);
    
}
    private String getHelpOption() {
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

    public boolean doAction(String choice) {
       
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "G":
                this.goalOfTheGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "H":
                this.harvestResources();
                break;
            case "Q":
                this.quit();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }

        return false;

}

    private void goalOfTheGame() {
       System.out.println("*** goalOfTheGame function called ***");
    }

    private void howToMove() {
        System.out.println("*** howToMove function called ***");
    }

    private void harvestResources() {
        System.out.println("*** harvestResources function called ***");
    }

    private void quit() {
        System.out.println("*** quit function called ***");
    }

   

}
