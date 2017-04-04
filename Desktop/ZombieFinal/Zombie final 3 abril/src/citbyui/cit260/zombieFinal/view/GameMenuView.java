
package citbyui.cit260.zombieFinal.view;

import citbyui.cit260.zombieFinal.control.GameControl;
import citbyui.cit260.zombieFinal.model.Game;
import citbyui.cit260.zombieFinal.model.InventoryItem;
import citbyui.cit260.zombieFinal.model.Location;
import java.io.PrintWriter;
import java.util.Scanner;
import zombieFinal.ZombieFinal;


public class GameMenuView extends View {

      public GameMenuView(){
            super("\n*****************************************"
            + "\n| GAME MENU                             |"
            + "\n*****************************************"  
            + "\nT - Travel to new location"
            + "\nV - View Map"
            + "\nS - Save Game"        
            + "\nM - Manufacture items"   
            + "\nE - Estimate the resource needed"           
            + "\nD - Deliver resource"
            + "\nW - Work on ship"
            + "\nR - Harvest resource"
            + "\nI - View list of items in inventory"                
            + "\nJ - Launch ship"
            + "\nH - Help"
            + "\nQ - Quit"              
            + "\n*****************************************");
    
      }

   
    
       
    public boolean doAction(String value) {
         
       
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0);
                
       
        
        switch (choice) {
            case 'T': 
            this.moveToLocation(); 
                break;
            case 'V': 
              this.viewMap(); 
                break;
                case 'M':
            this.manufactureItems(); 
                break;
            case 'E': 
           this.estimateResources();          
            break;
            case 'S':
                this.saveGame();
                break;
            case 'D':
           this.deliverResources(); 
                break;
                case 'W': 
            this.workOnShip();
                break;
            case 'R': 
           this.harvestResources(); 
                break;       
            
            case 'I': 
         this.viewInventory(); 
                break;
            
            case 'J': 
           this.launchShip();      
                break;
            case 'H': 
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.display();
                break;
            case 'Q':
               MainMenuView MainMenuView= new MainMenuView();
               MainMenuView.display();

            default:
             ErrorView.display("MainMenuView",
                        "\n*** Invalid selection *** Try again");
        }
       
         return false;
    }
    
   
    
    
   private void moveToLocation() {
        MoveActorView moveActorView = new MoveActorView();     
        moveActorView.display();
      
    }

    private void viewMap() {
        char scenes;
       Location[][] locations = GameControl.getMapLocations();
        StringBuilder line;
       
       System.out.println("\n          LIST OF LOCATIONS");
      
       line = new StringBuilder("                                ");
       line.insert(0, "1|");
     System.out.println("\n-----------------------------------------");

        line.insert(5, "2|");
         line.insert(10, "3|");
          line.insert(15, "4|");
            line.insert(20, "4|");
             line.insert(25, "4|");
              line.insert(30, "4|");
               line.insert(35, "4|");
              
               
         System.out.println(line.toString());
          System.out.println("\n-----------------------------------------");
         
        
     
    }
    

 private void viewInventory() {
        StringBuilder line;
       Game game = ZombieFinal.getCurrentGame();
       InventoryItem[]inventory = game.getInventory();
       System.out.println("\n          LIST OF INVENTORY ITEMS");
       line = new StringBuilder("                                ");
       line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
         line.insert(30, "IN STOCK");
         System.out.println(line.toString());
         
  for(InventoryItem item: inventory){
  line = new StringBuilder ("                                    ");
 line.insert(0, item.getDescription());
        line.insert(23, item.getRequiredAmount());
         line.insert(33, item.getQuantityInStock()); 
       System.out.println(line.toString());
            
     }
      
        
        
    }
      
        
            
        
    

     private int manufactureItems() {
        System.out.println("--- manufactureItems Called ---");
        return 0; 
    }
     
    private int estimateResources() {
        System.out.println("--- moveToLocation Called ---");
        return 0;
    }
    
private int deliverResources() {
        DeliverResourceView DeliverResourceView = new DeliverResourceView () {} ;
        DeliverResourceView .display();
          return 0;
    }
   
private int workOnShip() {
        WorkOnShipView WorkOnShipView= new WorkOnShipView();
        WorkOnShipView.display();
          return 0;
    }

   
    
    

    

    

   

    

    private int launchShip() {
        LaunchShipView LaunchShipView = new LaunchShipView();
        LaunchShipView.display();
          return 0;
    }

    private void saveGame() {
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

    private void harvestResources() {
       HarvestResourceView HarvestResourceView = new HarvestResourceView(){} ;
        HarvestResourceView .display();
    }

}
             
    

