

package citbyui.cit260.zombieFinal.view;

import citbyui.cit260.zombieFinal.control.Controls;
import citbyui.cit260.zombieFinal.control.GameControl;
import citbyui.cit260.zombieFinal.exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import zombieFinal.ZombieFinal;


public class MainMenuView extends View{
    
     
    
   public MainMenuView(){
        super("\n*****************************************"
            + "\n| MAIN MENU                             |"
            + "\n*****************************************"
            + "\nG - Start game" 
            + "\nJ - Start Save Game"    
            + "\nH - Get help on how to play the game" 
            + "\nS - Save game" 
            + "\nE - Exit"
            + "\n*****************************************");
    
}
    
    

    public boolean doAction(String value) {
     
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0);
        switch (choice) {
            case 'G': 
        {
            try {
                this.startNewGame();
            } catch (MapControlException ex) {
                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                                break;
                                
            case 'J'         :
                this.startSaveGame();
                break;
            case 'H': 
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case 'S': 
                this.saveGame();                    
                break;
            case 'E':
                return true;

            default:
                ErrorView.display("MainMenuView",
                        "\n*** Invalid selection *** Try again");
        }
       
        return false;
        
    }

    private void startNewGame() throws MapControlException {
         
        // create a new game
        GameControl.createNewGame(ZombieFinal.getPlayer());
             
        
        GameMenuView GameMenuView = new GameMenuView();
        GameMenuView.display();
    }

  
        

  

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\n Enter the file path for file where the game is to be saved");
      String filePath = this.getInput();
      try{
          
          GameControl.saveGame(ZombieFinal.getCurrentGame(), filePath);
          
      }catch (Exception ex){
          ErrorView.display("MainMenuView", ex.getMessage());
      }
        
      
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void startSaveGame() {
     this.console.println("\n\nEnter the file path for file where the game"
     + " is to be saved");
    String filePath = this.getInput();
    try {
        GameControl.getSavedGame(filePath);
    }catch(Exception ex) {
        
        ErrorView.display("MainMenuView", ex.getMessage());
    }
    
    GameMenuView GameMenuView = new GameMenuView();
    GameMenuView.display();
    }

}
    

