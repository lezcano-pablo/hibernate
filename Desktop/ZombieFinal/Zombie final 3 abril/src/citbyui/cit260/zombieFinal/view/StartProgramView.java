
package citbyui.cit260.zombieFinal.view;

import citbyui.cit260.zombieFinal.control.Controls;
import citbyui.cit260.zombieFinal.control.GameControl;
import citbyui.cit260.zombieFinal.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import zombieFinal.ZombieFinal;

public class StartProgramView {
    
    
    private String promptMessage;
    protected final PrintWriter console = ZombieFinal.getOutFile();
    protected final BufferedReader keyboard = ZombieFinal.getInFile();
    
    public StartProgramView() {     
        this.promptMessage = "\n PLEASE TYPE YOUR NAME: ";  
        this.displayBanner();
           
        
    }
    
    private void displayBanner() {
       
        System.out.println(
       "**************************************************************************************"
     +"\n* In this game, you will be taking on the role as one survivor in an island             "
    + "\n* plagued with zombies. They were traveling by boat and it was shipwrecked.           *"
    + "\n* Their main mission will be investigating the island so that they can find the       *"
    + "\n* required tools to repair the ship and leave the island. You can choose between      *"
    + "\n* three different characters. They will go on foot with only one backpack with        *"
    + "\n* some provisions. As you progress in the game, different kind of zombies will        *"
    + "\n* appear; each of them with different level of difficulty. You can choose to run      *"
    + "\n* or fight. The game is over when you have repaired the ship and leave theisland.     *"
    + "\n*                                                                                     *"
        
                                                
    + "\n* GOOD LUCK AND GET READY FOR THE ACTION!"
    +"\n***************************************************************************************"                                                         
    +"\n***************************************************************************************"             
    );
        
    }
    
    
    
    
   

    public void displayStartProgramView() {
       boolean done = false;
       do{
           String playersName = this.getPlayersName();
           if(playersName.toUpperCase().equals("Q"))
               return;
           
           done = this.doAction(playersName);
       }while (!done);
    
    
    }

    
    
    public String getPlayersName() {
        
        boolean valid = false;
        String value = "";
        try {
        
        while(!valid){
                        this.console.println("\n" + this.promptMessage);
                        value = this.keyboard.readLine();
                        value = value.trim();
                        
                        if(value.length() < 1){
                            ErrorView.display(this.getClass().getName(),
                                    "\n Invalid value: value can not be blank");
                        continue;
                            
                        }
                        break;

            }
        }catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return value;
    }
    
    private boolean doAction(String playersName) {
          if(playersName.length()< 2){
        ErrorView.display(this.getClass().getName(),
                "\n Invalid players name: "
        + "The name must be greater than one character in length");
       
          return false;
          
        
          }
          
          Player player = GameControl.createPlayer(playersName);
          if(player== null){
                ErrorView.display(this.getClass().getName(),
                        "\n error creating the player");

         return false;
}
          
          this.displayNextView(player);
          return true;
}

    private void displayNextView(Player player) {
     this.console.println("\n============================================="         
                       +"\nWELCOME TO THE GAME " + player.getName()
                       +"\nWE HOPE YOU HAVE A LOT OF FUN!"
                       +"\n==============================================="
                               );
                       MainMenuView MainMenuView= new MainMenuView();
                       MainMenuView.display();
                       
    }

}