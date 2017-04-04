

package citbyui.cit260.zombieFinal.control;

import citbyui.cit260.zombieFinal.enums.Item;
import citbyui.cit260.zombieFinal.enums.SceneType;
import citbyui.cit260.zombieFinal.exceptions.GameControlException;
import citbyui.cit260.zombieFinal.exceptions.MapControlException;
import citbyui.cit260.zombieFinal.model.Game;
import citbyui.cit260.zombieFinal.model.InventoryItem;
import citbyui.cit260.zombieFinal.model.Location;
import citbyui.cit260.zombieFinal.model.Map;
import citbyui.cit260.zombieFinal.model.Player;
import citbyui.cit260.zombieFinal.model.Scene;
import citbyui.cit260.zombieFinal.model.Ship;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import zombieFinal.ZombieFinal;


public class GameControl {

    /**
     *
     * @return
     */
    public static Player createPlayer(String name) {
        if(name ==null){
            
            return null;
        }
       Player player = new Player();
       player.setName(name);
       
       ZombieFinal.setPlayer(player);
       
       return player;
    }
       
   public static void createNewGame(Player player) throws MapControlException {
       Game game = new Game ();
       ZombieFinal.setCurrentGame(game);
       
       game.setPlayer(player);
       
       InventoryItem[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Ship ship = new Ship();
       game.setShip(ship);
       
       Map map = MapControl.createMap();
       game.setMap(map);
       
       MapControl.moveActorToStartingLocation(map);

   }

    private static InventoryItem[] createInventoryList() {
       InventoryItem[] inventory = new InventoryItem[4];
       
       InventoryItem hammer = new InventoryItem();
       hammer.setDescription("Hammer");
       hammer.setQuantityInStock(0);
       hammer.setRequiredAmount(0);
       inventory[Item.hammer.ordinal()] = hammer;
       
       InventoryItem food = new InventoryItem();
       food.setDescription("Food");
       food.setQuantityInStock(0);
       food.setRequiredAmount(0);
       inventory[Item.food.ordinal()] = food;
       
       InventoryItem wood = new InventoryItem();
       wood.setDescription("Wood");
       wood.setQuantityInStock(0);
       wood.setRequiredAmount(0);
       inventory[Item.wood.ordinal()] = wood;
       
       InventoryItem stone = new InventoryItem();
       stone.setDescription("Stone");
       stone.setQuantityInStock(0);
       stone.setRequiredAmount(0);
       inventory[Item.stone.ordinal()] = stone;
        return inventory;
       
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[SceneType.starting.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.ocean.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.cave.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.finish.ordinal()]);


    }

    public static Location[][] getMapLocations() {
        System.out.println("getMapLocations called");
        return null;
    }

    public static void getSavedGame(String filepath) 
                        throws GameControlException {
        Game game = null;

        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        
        
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }

       // close the outuput file
       ZombieFinal.setCurrentGame(game); // save in CuriousWorkmanship
    }

    public static void saveGame(Game game, String filePath) 
    throws GameControlException{
       try(FileOutputStream fops = new FileOutputStream(filePath)){
         ObjectOutputStream output = new  ObjectOutputStream(fops); 
      output.writeObject(game);
      
       }
       catch(Exception e){
           
           throw new GameControlException(e.getMessage());
       }
    }
 
   

}
