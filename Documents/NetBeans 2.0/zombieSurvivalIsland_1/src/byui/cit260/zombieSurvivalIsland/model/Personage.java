/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.zombieSurvivalIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author FamiliaLezcano
 */
public class Personage implements Serializable {
    
    private String name;
    private String characteristics;

    public Personage() {
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.characteristics);
        return hash;
    }

    @Override
    public String toString() {
        return "Personage{" + "name=" + name + ", characteristics=" + characteristics + '}';
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
        final Personage other = (Personage) obj;
        return true;
    }
    
    
    
    
    
}
