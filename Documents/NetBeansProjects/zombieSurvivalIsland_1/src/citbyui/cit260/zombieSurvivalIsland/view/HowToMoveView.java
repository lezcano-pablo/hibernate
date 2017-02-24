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
public class HowToMoveView {

    private final String help;
    public HowToMoveView() {
         this.help = "\n During the game,it will show you different kind of options"
                    +"\n For example, for moving you will have to choose a specific locations"
                    +"\n each of them will have a unique coordinate"
                    +"\n The coordinates will be delimited by columns and rows"
                    + "\n To move to a location you will have to type the corresponding |"
                    +"\n number of row and letter of column"
                    +"\n---------------------------------------------------------------------"
                    +"\nR - type R to return to the main menu"
                    ;
    }    
 
public void displayHowToMoveView() {
    
    boolean done = false;
    do  {
        
        String move = this.getMove();
        if (move.toUpperCase().equals("Q"))
            return;
            
        done = this.doAction(move);    
    
    } while (!done);
    
    
    
}

    private String getMove() {
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

    

    private boolean doAction(String choice) {
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
       mainMenuView.displayMainMenuView();
    }
 }
    