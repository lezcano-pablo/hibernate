/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.zombieFinal.model;

import java.awt.Point;
import java.io.Serializable;


public class Game implements Serializable {
    private Player player;
    private Map map;
    private double totalTime;
    private long noPeople;
    private Ship ship;
private InventoryItem[] inventory;
private Location[][] locations;
private Scene[] scenes;


    public Scene[] getScenes() {
        return scenes;
    }

    public void setScenes(Scene[] scenes) {
        this.scenes = scenes;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
private Actor actor;
    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public long getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(long noPeople) {
        this.noPeople = noPeople;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public InventoryItem[] getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", noPeople=" + noPeople + '}';
    }

    public Point[] getActorsLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
    
}
