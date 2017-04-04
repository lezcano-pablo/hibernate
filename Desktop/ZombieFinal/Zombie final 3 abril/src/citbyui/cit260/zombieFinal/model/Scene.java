

package citbyui.cit260.zombieFinal.model;

import java.io.Serializable;



public class Scene implements Serializable {
    
   
    private String description;
    private String mapSymbol;
    private double travelTime;
    private double amountOfResource;
private boolean blocked;

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    public Scene() {
    }

 

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public double getAmountOfResource() {
        return amountOfResource;
    }

    public void setAmountOfResource(double amountOfResource) {
        this.amountOfResource = amountOfResource;
    }
    
    
    
}
