/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.view;

/**
 *
 * @author LOPEZ-1
 */
public class ChooseLocationView extends View {
    
    public ChooseLocationView() {
        super("\n*****************************************"
                            + "\n| Move actor to a location in map.        |"
                            + "\n| Locations available are (1)(2)(3)(4)    |"
                            + "\n6| Or pres 6 to return to previous screen  |"
                            + "\n*****************************************"
                            + "\n"); 
    }

    @Override
    public boolean doAction(String value) {
        
        char choice = value.charAt(0);
        value = value.toUpperCase();
        
            switch (choice) {
                case '1':
                    this.console.println("\nActor moved to location 1."
                            + "\nYou get into a forest full of trees "
                            + "\nand zombies."
                            + "You obtain 1 wood.");
                    break;
                case '2':
                    this.console.println("\nActor moved to location 2."
                            + "\nYou get into a desert. There's nothing here"
                            + "\nYou have to go back to location 1.");
                    break;
                case '3':
                    this.console.println("\nActor moved to location 3."
                            + "\nYou are next to the ocean. What will you do"
                            + "\nObtain fish (food)");
                    break;
                case '4':
                    this.console.println("\nActor moved to location 4."
                            + "\nIs getting dark and the ship isn't ready "
                            + "\nyet, but you are far from it. Here's a cave"
                            + "\nyou should spend the night here.");
                    break;
                case '5':
                    this.console.println("\nActor moved to location 5."
                            + "\nHere is the ship. Get home safely!");
                    break;
                case '6':
                   GameMenuView GameMenuView= new GameMenuView();
                   GameMenuView.display();
                
                default:
                    this.console.println("\n *** Invalid selection *** Try again ***");
                
    }
        return false;
}
}
