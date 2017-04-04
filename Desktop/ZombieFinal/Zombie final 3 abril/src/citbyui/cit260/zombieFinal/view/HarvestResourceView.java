/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.view;

/**
 *
 * @author Javier
 */
import java.io.PrintWriter;
import zombieFinal.ZombieFinal;

/**
 *
 * @author Javier
 */
public abstract class HarvestResourceView extends View{
    
 protected final PrintWriter selectedHarvest = ZombieFinal.getOutFile();
 public HarvestResourceView(){
             super( 
                   "\n---------------------------------------------------------------"
                 + "\n| To survive, is necessary to get some Harvest Resources:.|"
                 + "\n|                                                             |"   
                 + "\n| You can pick some of this resorces and use it for    |"
                 + "\n| create wapons, barriers, create ships and fortress.|"
                 + "\n| Here is a suggestions to the class of Harvest Resources that you will need:  |"
                 + "\n---------------------------------------------------------------"
                 + "\nS - Stones"
                 + "\nW - Wood"
                 + "\nS - Straw"
                 + "\nI - Iron"
                 + "\nQ - Quit to main main menu"
                 + "\n---------------------------------------------------------------");
        }

    @Override
    public boolean doAction(String value) {
     
     value = value.toUpperCase(); // convert to all upper case
            char choice = value.charAt(0);
 
        switch (choice) {
            case 'S':
                this.selectedHarvest .println("\n"
                    + "\nThe stones serve to create barriers,"
                    + "\nand also serve as defense weapons."    
                    + "\nGive a 15% protection"
                   );
                break;
                 case 'W':
                 this.selectedHarvest .println("\n"
                    + "\nWood is neccessary to create barriers and ships,"
                     + "\nGive a 35% protection"
                    );

                break;
            case 'T':
                this.selectedHarvest .println("\n"
                    + "\nStraw helps to fortify the barriers and give."
                    + "\nmore power to the wapons."
                    + "\nGive a 25% strength"
                      
                    );
                break;
            case 'I':
                this.selectedHarvest .println("\n"
                    + "\nThe Iron is necessary to build a ship"
                    + "\nand create strong weapons."   
                    + "\nGive a 25% strength and 25% protection"
                    );
                break;
            case 'Q':
                return true;

            default:
                this.selectedHarvest.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }    
}

    
    

