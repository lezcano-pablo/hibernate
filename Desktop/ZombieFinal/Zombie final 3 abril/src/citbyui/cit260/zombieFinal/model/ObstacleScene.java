

package citbyui.cit260.zombieFinal.model;

import java.io.Serializable;
import java.util.Objects;


public class ObstacleScene extends Scene {
        

    private boolean blocked;

    public ObstacleScene() {
    }

   

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
     public boolean isBlocked() {
        return blocked;
    }

    
}
