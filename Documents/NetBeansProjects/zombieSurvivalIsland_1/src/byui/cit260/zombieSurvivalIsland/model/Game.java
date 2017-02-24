/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.model;

import java.io.Serializable;

/**
 *
 * @author LOPEZ-1
 */
public class Game implements Serializable {
    
    // class instance variables
    private double totalTime;
    private int noPlayers;
    private int lastSession;

    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getNoPlayers() {
        return noPlayers;
    }

    public void setNoPlayers(int noPlayers) {
        this.noPlayers = noPlayers;
    }

    public int getLastSession() {
        return lastSession;
    }

    public void setLastSession(int lastSession) {
        this.lastSession = lastSession;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPlayers=" + noPlayers + ", lastSession=" + lastSession + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 73 * hash + this.noPlayers;
        hash = 73 * hash + this.lastSession;
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.noPlayers != other.noPlayers) {
            return false;
        }
        if (this.lastSession != other.lastSession) {
            return false;
        }
        return true;
    }
    
    
    
}
