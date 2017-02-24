/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiesurvivalisland;

import byui.cit260.zombieSurvivalIsland.model.Game;
import citbyui.cit260.zombieSurvivalIsland.view.MainMenuView;
import citbyui.cit260.zombieSurvivalIsland.view.StartProgramView;
import citbyui.cit260.zombieSurvivalIsland.view.startNewGame;

/**
 *
 * @author LOPEZ-1
 */
public class ZombieSurvivalIsland {

    
    
    private static Game currentGame = null;
    private static Player player;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieSurvivalIsland.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieSurvivalIsland.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      StartProgramView startProgramView= new StartProgramView();
      startProgramView.displayStartProgramView();
      MainMenuView mainMenuView= new MainMenuView();
      mainMenuView.displayMainMenuView();
      
       
     
      
    }

  
}
