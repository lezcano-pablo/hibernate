/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.zombieFinal.view;

/**
 *
 * @author FamiliaLezcano
 */
public class WorkOnShipView extends View {
    
    public WorkOnShipView(){
        
         super("\n****************************************"
            + "\n| WORK ON SHIP                             |"
            + "\n****************************************"
            + "\n - SELECT THE PLACE WHERE YOU WANT TO WORK ON?"
            + "\n1 - Starboard: It is in name that receives the side or right part of a boat"
            + "\n2 - Babor: It is the name that receives the side or left part of a boat."
            + "\n3 - Bow: It is the front of the boat that wedge-shaped cuts the waters in advance."
            + "\n4 - Stern: This is the back or rear of the boat."
            
            + "\n5 - Back to the game menu"
            + "\n*****************************************");
    
    }
        public boolean doAction(String value ) {
           

            value = value.toUpperCase(); // convert to all upper case
            char choice = value.charAt(0);
     
        switch (choice) {
            case 'G':
                
                 case '1':
                 this.console.println("\n"
                   +"For this section of the ship you will need wood of 5 meters long or more");

                break;
            case '2':
                this.console.println("\n"
                   +"For this section of the ship you will need wood of 5 meters long or more");
                break;
            case '3':
                this.console.println("\n"
                    +"For this section of the ship you will need wood at least of 3 meters long or more");
                break;
            case '4':
                this.console.println("\n"
                   +"For this section of the ship you will need wood at least of 3 meters long or more");
                break;
            
            case '5':
                GameMenuView GameMenuView= new GameMenuView();
                GameMenuView.display();
                break;
            case 'Q':
                return true;

            default:
                 ErrorView.display(this.getClass().getName(),
                        "\n error, Wrong selection");;
        }
        
        return false;
    }    
}

        
        


