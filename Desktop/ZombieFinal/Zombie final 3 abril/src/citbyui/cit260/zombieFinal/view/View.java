
package citbyui.cit260.zombieFinal.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import zombieFinal.ZombieFinal;


public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ZombieFinal.getInFile();
    protected final PrintWriter console = ZombieFinal.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }

        
    
    @Override
    public void display() {
      String value;
        boolean done = false;
        
        do { 
           this.console.println(this.displayMessage);
          value = this.getInput();
          done= this.doAction(value);
         
            
        }while (!done);

    }
    
     @Override
    public String getInput() {

        
        boolean valid = false;
        String value = null;
        try {
       
        while (!valid) {
                
            
            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) { 
                this.console.println("\n*** You must enter a value");
                continue;
            }
            
            break;
        }
        } catch (Exception e) {
            this.console.println("Error reading input: " + e.getMessage());
        }    
        return value;     
    }
    
  
   
    
}
