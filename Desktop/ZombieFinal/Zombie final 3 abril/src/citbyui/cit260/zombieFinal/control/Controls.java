

package citbyui.cit260.zombieFinal.control;

import citbyui.cit260.zombieFinal.model.Game;


public final class Controls {
    
    private final static ProgramControl programControl = new ProgramControl();    
    private final static GameControl gameControl = new GameControl();    
    private final static InventoryControl inventoryControl = new InventoryControl();
    private static Game currentGame = null;
    
    public static ProgramControl getProgramControl() {
        return programControl;
    }

    public static GameControl getGameControl() {
        return gameControl;
    }

    public static InventoryControl getInventoryControl() {
        return inventoryControl;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Controls.currentGame = currentGame;
    }
    
    
}
