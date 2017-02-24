/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.view;

import byui.cit260.zombieSurvivalIsland.control.GameControl;
import byui.cit260.zombieSurvivalIsland.model.Player;
import java.util.Scanner;

/**
 *
 * @author FamiliaLezcano
 */
public class StartProgramView {
    
    private final String promptMessage;
    
    public  StartProgramView(){
        
        this.promptMessage=("\nPlease enter your name: ");
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                
                
      "\n***************************************************************************************"
     +"\n*                                                                                     *"            
    + "\n* In this game, you will be taking on the role as one survivor in an island           *"
    + "\n* plagued with zombies. They were traveling by boat and it was shipwrecked.           *"
    + "\n* Their main mission will be investigating the island so that they can find the       *"
    + "\n* required tools to repair the ship and leave the island. You can choose between      *"
    + "\n* three different characters. They will go on foot with only one backpack with        *"
    + "\n* some provisions. As you progress in the game, different kind of zombies will        *"
    + "\n* appear; each of them with different level of difficulty. You can choose to run      *"
    + "\n* or fight. The game is over when you have repaired the ship and leave theisland.     *"
    + "\n*                                                                                     *"
    + "\n***************************************************************************************"
        );
    }

    public void displayStartProgramView() {
       
        boolean done= false;//set flag to not done
       do{
          // prompt for and get playerName
           String playersName= this.getPlayersName();
           if(playersName.toUpperCase().equals("Q"))//user wants to quit
               return;//exit the name
           //do requested action and display next view
           
           done = this.doAction(playersName);
       }
       while (!done);
        

    }
    
     private String getPlayersName() {
        
         Scanner keyboard = new Scanner(System.in);
         String value ="";
         boolean valid = false;
         
         while(!valid){
             
             System.out.println("\n" + this.promptMessage);
             
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

    private boolean doAction(String playersName) {
     if(playersName.length() < 2){
         
         System.out.println("\nInvalid player name: " 
                 + "The name must be greter than one character in lenght");
         return false;
     }
    
Player player = GameControl.createPlayer(playersName);
if (player == null ){
    System.out.println("\nError creating the player.");
    return false;

}
 this.displayNextView(player);
 return true;
    }

    private void displayNextView(Player player) {
       System.out.println(
     "\n================================================"
    +"\n WELCOME TO THE GAME " + player.getName()
    +"\n WE HOPE YOU HAVE A LOT OF FUN!"
    +"\n================================================ "
       );
       
       
       MainMenuView mainMenuView = new MainMenuView();
       mainMenuView.displayMainMenuView();
    }
}

    
    
    
     
     
   
     
     




    
   

