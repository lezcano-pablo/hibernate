
package citbyui.cit260.zombieFinal.control;

import citbyui.cit260.zombieFinal.model.Game;
import citbyui.cit260.zombieFinal.model.Player;
import java.io.PrintWriter;
import zombieFinal.ZombieFinal;


public class ProgramControl {
    protected final PrintWriter console = ZombieFinal.getOutFile();
    
    private Game game;
    private Player player; 

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    
    public Player createPlayer(String name) {
        
        player = new Player();
        player.setName(name);
        
        return player;
    
    }

    
    
    
}
