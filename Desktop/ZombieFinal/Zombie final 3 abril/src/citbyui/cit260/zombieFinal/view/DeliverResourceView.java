/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.view;

import java.io.PrintWriter;
import zombieFinal.ZombieFinal;

/**
 *
 * @author Javier
 */
public abstract class DeliverResourceView extends View{
    
 protected final PrintWriter selectedFood = ZombieFinal.getOutFile();
 public DeliverResourceView(){
             super( 
                   "\n---------------------------------------------------------------"
                 + "\n| You will need to choose food items for the trip.|"
                 + "\n|                                                             |"   
                 + "\n| Select the each food item that is    |"
                 + "\n| needed to complete your journey in the city.|"
                 + "\n| Here is a suggestions to the class of food that you will need:  |"
                 + "\n---------------------------------------------------------------"
                 + "\nG - Grain"
                 + "\nL - Legumes"
                 + "\nO - Oil"
                 + "\nW - Water"
                 + "\nH - Honey"
                 + "\nS - Salt"
                 + "\nQ - Quit to main main menu"
                 + "\n---------------------------------------------------------------");
        }

    @Override
    public boolean doAction(String value) {
     
     value = value.toUpperCase(); // convert to all upper case
            char choice = value.charAt(0);
 
        switch (choice) {
            case 'G':
                this.selectedFood.println("\n"
                    + "\nThe grain is vital to recover health"
                    + "\nBring a 20% life"
                   );
                break;
                 case 'L':
                 this.selectedFood.println("\n"
                    + "\nLegumes is vital to gain strength."
                    + "\nBring a 20% strength"
                    );

                break;
            case 'O':
                this.selectedFood.println("\n"
                    + "\nThe Oil is vital to the ship run."
                    );
                break;
            case 'W':
                this.selectedFood.println("\n"
                    + "\nThe water can help to recover sterngth."
                    + "\nBring a 10% strength"
                    );
                break;
            case 'H':
                this.selectedFood.println("\n"
                    + "\nHoney give us a pure strength."
                    + "\nBring a 35% strength"    
                    );
                break;
            case 'S':
                this.selectedFood.println("\n"
                    + "\nSalt is necessary to revover health."
                     + "\nBring a 5% health"
                    );
                break;
            case 'Q':
                return true;

            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }    
}
