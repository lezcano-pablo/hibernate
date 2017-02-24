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
public class startNewGame {

    private String menu2;
    
    /**
     *
     */
    public startNewGame() {
         this.menu2 = "\n"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\n| SELECT A LEVEL                                         |"
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------"
                    +"\nE - Easy"
                    +"\nN - Normal"
                    +"\nH - Hard"
                    +"\nQ - Quit "
                    +"\n-----------------------------------------------------"
                    +"\n-----------------------------------------------------";
    }

    /**
     *
     * @return
     */
    public String getMenu2() {
        return menu2;
    }

    /**
     *
     * @param menu2
     */
    public void setMenu2(String menu2) {
        this.menu2 = menu2;
    }

    /**
     *
     * @param menu2
     */
    public startNewGame(String menu2) {
        this.menu2 = menu2;
    }
    
    /**
     *
     */
    public void displayStartNewGame() {
    
    boolean done2 = false;
    do  {
        
        String difficultLevel = this.getDifficultLevel();
        if (difficultLevel.toUpperCase().equals("Q"))
            return;
            
        done2 = this.doAction(difficultLevel);    
    
    } while (!done2);
    
}

    private String getDifficultLevel() {
       Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.menu2);
             
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


    private boolean doAction(String difficultLevel) {
      
       
        difficultLevel = difficultLevel.toUpperCase(); // convert choice to upper case
        
        switch (difficultLevel) {
            case "E":
                this.startEasyGame();
                break;
            case "N":
                this.startNormalGame();
                break;
            case "H":
                this.startHardGame();
                break;
            default:    
                System.out.println("\n*** Invalid selection *** Try again"); 
        }

        return false;

}

    private void startEasyGame() {
         StartEasyGameView startEasyGameView = new StartEasyGameView();
       startEasyGameView.displayStartEasyGameView();
        }
    

    private void startNormalGame() {
                System.out.println("\n*** startNormalGame() function called***"); 
}
    

    private void startHardGame() {
      System.out.println("\n*** startHardGame() function called***"); 
    }

  
}

    
    
    

