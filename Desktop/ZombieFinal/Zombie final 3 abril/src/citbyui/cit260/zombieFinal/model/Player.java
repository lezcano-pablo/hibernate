

package citbyui.cit260.zombieFinal.model;

import java.io.Serializable;
import java.util.Objects;


public class Player implements Serializable {
    
    private String name;
    private double bestTime;

    public Player() {
    }
     public String getName() {
        return name;
     }
     
    public Player(String name, double bestTime) {
        this.name = name;
        this.bestTime = bestTime;
    }

   
    

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return bestTime;
    }

    public void setTime(double bestTime) {
        this.bestTime = bestTime;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        return true;
    }
    
    
    
}
