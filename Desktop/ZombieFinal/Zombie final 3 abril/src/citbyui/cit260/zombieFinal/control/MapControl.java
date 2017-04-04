/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.control;

import citbyui.cit260.zombieFinal.control.GameControl;
import citbyui.cit260.zombieFinal.enums.Actor;
import citbyui.cit260.zombieFinal.enums.SceneType;
import citbyui.cit260.zombieFinal.exceptions.MapControlException;
import citbyui.cit260.zombieFinal.model.Map;
import citbyui.cit260.zombieFinal.model.Scene;
import java.awt.Point;
import zombieFinal.ZombieFinal;

/**
 *
 * @author FamiliaLezcano
 */
class MapControl {

    static Map createMap() {
       Map map = new Map(20, 20);
       
       Scene[]scenes = createScenes();
       
       GameControl.assignScenesToLocations(map, scenes);
       return map;
    }

    public static void moveActorToStartingLocation(Map map)
    throws MapControlException{
      Actor[] actors= Actor.values();
      for(Actor actor: actors){
          
          Point coordinates = actor.getCoordinates();
          MapControl.moveActorToLocation(actor, coordinates);
         
      
      }
    }

    public static void moveActorToLocation(Actor actor, Point coordinates) 
    throws MapControlException{
Map map = ZombieFinal.getCurrentGame().getMap();
int newRow =coordinates.x-1;
int newColumn = coordinates.y-1;
if(newRow < 0 || newRow >= map.getNoOfRows()|| 
    newColumn < 0 || newColumn >= map.getNoOfColumns()){
    throw new MapControlException("Can not move actor to location"
    +coordinates.x + ", "+ coordinates.y
   +"because that location is outside"
   +"the bounds of the map.");
}
    
    
}
    

    private static Scene[] createScenes() {
       
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "This is the beginning of everything"
                );
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.starting.ordinal()] = startingScene;
        
        
        Scene desertScene = new Scene();
        desertScene.setDescription(
                "This is the desert"
                );
        desertScene.setMapSymbol("DS");
        desertScene.setBlocked(false);
        desertScene.setTravelTime(240);
        scenes[SceneType.desert.ordinal()] = desertScene;
        
        Scene oceanScene = new Scene();
        desertScene.setDescription(
                "This is the ocean"
                );
       oceanScene.setMapSymbol("OC");
        oceanScene.setBlocked(false);
        oceanScene.setTravelTime(240);
        scenes[SceneType.ocean.ordinal()] = oceanScene;
        
        
        Scene forestScene = new Scene();
        forestScene.setDescription(
                "This is the forest"
                );
       forestScene.setMapSymbol("FR");
        forestScene.setBlocked(false);
        forestScene.setTravelTime(240);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
         Scene finishScene = new Scene();
        finishScene.setDescription(
                "This is the forest"
                );
       finishScene.setMapSymbol("FS");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(240);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        
        return scenes;
        
        
        
    }
    
    
    
}
