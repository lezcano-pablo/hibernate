/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieSurvivalIsland.control;

import citbyui.cit260.zombieSurvivalIsland.model.Player;
import java.security.cert.PKIXRevocationChecker.Option;

/**
 *
 * @author FamiliaLezcano
 */
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
       
       zombieSurvivalIsland.setPlayer(player);
       
       return player;
    }
       
   public static void createNewGame(Player player) {
       System.out.println("\n*** createNewGAme stub function called ***");
   }
   
    
   

}
    
