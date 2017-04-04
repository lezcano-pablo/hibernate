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
 * @author LOPEZ-1
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = ZombieFinal.getOutFile();
    private static final PrintWriter logFile = ZombieFinal.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "----------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n----------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
    }

    
}
