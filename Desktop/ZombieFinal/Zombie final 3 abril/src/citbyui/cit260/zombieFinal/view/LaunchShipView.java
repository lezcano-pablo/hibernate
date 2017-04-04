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
public class LaunchShipView extends View{
    public LaunchShipView(){
        
         super("\n****************************************"
            + "\n| LAUNCH SHIP                             |"
            + "\n****************************************"
            + "\n1 - Try to launch the ship"
            + "\n2 - Back to the Game Menu"
            
            + "\n*****************************************");
    
    }
        public boolean doAction(String value ) {
           

            value = value.toUpperCase(); // convert to all upper case
            char choice = value.charAt(0);
     
        switch (choice) {
            case 'G':
                
                 case '1':
                 this.console.println("\n"
                   +"You don not have enough resources for this action");
                break;
                            
            case '2':
                GameMenuView GameMenuView= new GameMenuView();
                GameMenuView.display();
                break;
                        default:
                 ErrorView.display(this.getClass().getName(),
                        "\n error, Wrong selection");;
        }
        
        return false;
    }    
}

        
        

