/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.view;

import citbyui.cit260.zombieFinal.enums.Actor;
import citbyui.cit260.zombieFinal.model.Game;
import zombieFinal.ZombieFinal;

/**
 *
 * @author LOPEZ-1
 */
public class MoveActorView extends View {
 
    public MoveActorView() {
        super("\n"
             +"\n------------------------------------------"   
             +"\n | CHOOSE ACTOR TO MOVE                  |"
             +"\n------------------------------------------"
             +"\nP - PABLO"
             +"\nR - JAVIER"
             +"\nJ - JOSE"
             +"\nQ - Quit");
    }

    @Override
    public boolean doAction(String obj) {
        
        Actor actor;
        Game game = ZombieFinal.getCurrentGame();
        
        String choice = (String) obj;
        choice = choice.trim().toUpperCase();
        
        //list of actors
        switch (choice) {
            case "P":
                this.chooseLocationView();
                actor = Actor.Pablo;
                break;
            case "R":
                this.chooseLocationView();
                actor = Actor.Javier;
                break;
            case "J": 
                this.chooseLocationView();
                actor = Actor.Jose;
                break;
            case "Q":
                return true;
            default:
                
                ErrorView.display("MoveActorView", "Invalid selection:");        
        }
        return false;
    }
    public void chooseLocationView() {
        ChooseLocationView chooseLocationView = new ChooseLocationView();
        chooseLocationView.display();
    }    
    
    
}
