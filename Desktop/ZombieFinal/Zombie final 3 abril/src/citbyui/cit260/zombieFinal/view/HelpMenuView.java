

package citbyui.cit260.zombieFinal.view;

import java.io.PrintWriter;
import java.util.Scanner;
import zombieFinal.ZombieFinal;


public class HelpMenuView extends View{
    
    protected final PrintWriter console = ZombieFinal.getOutFile();
    
    public HelpMenuView(){
            super("\n****************************************"
            + "\n| Help Menu                             |"
            + "\n****************************************"
            + "\nG - What is the goal of the game?"
            + "\nT - Travel to a new location"
            + "\nV - View a description of a location"
            + "\nE - Estimating the resources needed"
            + "\nM - Manufacture items"
            + "\nR - Harvesting resources"
            + "\nD - Deliver resources"
            + "\nW - Work on ship"           
            + "\nJ - Launch ship"
            + "\nQ - Quit"
            + "\n*****************************************");
    
    }
    

    
   public boolean doAction(String value ) {
           

            value = value.toUpperCase(); // convert to all upper case
            char choice = value.charAt(0);
     
        switch (choice) {
            case 'G':
                
                 case 'T':
                 this.console.println("\n"
                    + "\nMove a person to a new location in the game. Select"
                    + "\nthe Travel to new location option in the Game"
                    + "\nMenu. Select the person that will be moved"
                    + "\nand the row and column coordinates of the location"
                    + "\nthey are to be moved to in the map. The person"
                    + "\nbe moved to the new location if there are no"
                    + "\nobstacles in the most direct path to the location."
                    + "\nIf you encounter an obstacle you will have"
                    + "\nto move around the obstacle to get to your desired"
                    + "\nlocation.");

                break;
            case 'V':
                this.console.println("\n"
                    + "\nView the description of a location and who is"
                    + "\ncurrently at that location. You can not view a "
                    + "\nlocation until someone has visited the location at"
                    + "\nleast one time. Select the View Location option in"
                    + "\nthe Game menu and enter the coordinates of the"
                    + "\nlocation you would like to view.");
                break;
            case 'E':
                this.console.println("\n"
                    + "\nAs part of the planning phase of the game, you will"
                    + "\nneed to estimate the resources that will be needed"
                    + "\nto survive the voyage to the promised land. Select"
                    + "\nthe Estimate the resources needed option on the"
                    + "\nGame menu. Select a resource and then enter the "
                    + "\nnumber of barrels of that particular item that are"
                    + "\nneeded for the trip. The amount needed is based on"
                    + "\nthe recommended daily amount of food storage per" 
                    + "\nperson. You will need to go search the Internet"
                    + "\nthe recommended amount per person. You will then"
                    + "\nhave to figure how much can be stored in the barrels" 
                    + "\ndesigned to hold the selected type of resource you"
                    + "\nyou are planning for. You will have to go back to"
                    + "\ngame menu and design the barrels first if you have"
                    + "\nalready done so");
                break;
            case 'B':
                this.console.println("\n"
                    + "\nDesign the barrels to hold the different types of "
                    + "\nresources to be loaded on the ship. Select the Design "
                    + "\nBarrels option on the Game menu. Select a resource "
                    + "\nand then enter height and diameter of the barrel for"
                    + "\nthe resource being selected.");
                break;
            case 'M':
                this.console.println("\n"
                    + "\nYou will need to manufacture items needed to build"
                    + "\nthe ship and store the items that you will take on"
                    + "\nyour journey. Select the Manufacture items option"
                    + "\non the Game Menu. Select a person to manufacture"
                    + "\nthe item and the amount to be manufacured.");
                break;
            case 'R':
                this.console.println("\n"
                    + "\nYou must locate the resources needed in the land"
                    + "\nof Bountiful and then harvest the resource."
                    + "\nSelect the Havest resource option in the Game"
                    + "\nMenu and enter the amount that you want to harvest.");
                break;
            case 'D':
                this.console.println("\n"
                    + "\nOnce you have harvested a resource you will need"
                    + "\nto deliver the resource to the warehouse. Move the"
                    + "\nperson who just harvested a resource to the"
                    + "\nwarehouse and Select the Deliver resource option"
                    + "\non the Game Menu. The items will be unloaded and"
                    + "\nstored in the warehouse.");
                break;

            case 'W':
                this.console.println("\n"
                    + "\nYou will need to assign people to work on building"
                    + "\nthe ship. Select the indvidual to work on the ship"
                    + "\nand enter the number of days that they will work"
                    + "\non the ship.");
                break;
           
            case 'J':
                this.console.println("\n"
                    + "\nLaunch the ship and embark on your journey to the "
                    + "\ntPromised Land. You must have completed the ship"
                    + "\nand loaded ship with all of the required resources"
                    + "\nbefore you start your journey. Select the Launch"
                    + "\nship option on the Game Menu. If the shipe is"
                    + "\ncompleted and all of the required resources are"
                    + "\nloaded on the ship then win the game");
                break;
            case 'Q':
                return true;

            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }    
}
