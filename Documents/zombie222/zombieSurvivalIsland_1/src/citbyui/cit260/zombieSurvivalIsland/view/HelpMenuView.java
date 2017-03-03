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
public class HelpMenuView extends View {
    

public HelpMenuView() {
         super("\n"
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
                    +"\n-----------------------------------------------------");
    }


@Override

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
       GoalOfTheGameView GoalOfTheGameView = new GoalOfTheGameView();
       GoalOfTheGameView.display();
    }

    private void howToMove() {
         HowToMoveView HowToMoveView = new HowToMoveView();
       HowToMoveView.display();
    }

    private void harvestResources() {
        System.out.println("*** harvestResources function called ***");
    }

    private void quit() {
        System.out.println("*** quit function called ***");
    }

   

}
