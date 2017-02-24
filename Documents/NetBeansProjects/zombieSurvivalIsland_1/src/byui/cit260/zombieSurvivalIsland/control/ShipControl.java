/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.control;



/**
 *
 * @author LOPEZ-1
 */
public class ShipControl {
    
    public String workOnShip(int wood, int tool) {
        
        if (wood == 0) { // number of woods needs to be greater than 0
            return "-1";
                    
        }
        
        if (tool == 0) { // number of tools needs to be greaster than 0
            return "-1";
        }
        // this will display how many woods and tools the user has to fix the ship
        String message = "You have " + wood + " wood(s) and " + tool + " tool(s) to fix ship";
        
        return message;
        
    }
    
    public String viewShipStatus(int collected, int required) {
        required = 150;
        
        
        if (collected > 100) {
            return "-1";
                
        }
      
        String message = "Your progess is " + collected + " out of 100%";
        
        return message;
    }
}
