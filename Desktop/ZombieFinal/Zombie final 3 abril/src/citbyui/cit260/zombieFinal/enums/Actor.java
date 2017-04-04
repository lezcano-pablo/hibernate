/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.enums;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author FamiliaLezcano
 */
public enum Actor implements Serializable {
    
    
   Jose("Big Guy"),
   Javier("Fat guy"),
   Pablo("Hot guy");
   
 private final String description;
private final Point coordinates;

    private Actor(String description) {
        this.description = description;
       coordinates= new Point(1, 1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    
   


}   

