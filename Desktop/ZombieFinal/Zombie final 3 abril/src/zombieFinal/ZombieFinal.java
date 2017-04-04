

package zombieFinal;

import citbyui.cit260.zombieFinal.model.Game;
import citbyui.cit260.zombieFinal.model.Player;
import citbyui.cit260.zombieFinal.view.ErrorView;
import citbyui.cit260.zombieFinal.view.MainMenuView;
import citbyui.cit260.zombieFinal.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ZombieFinal {
   
   
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    protected final PrintWriter console = ZombieFinal.getOutFile();
    private static PrintWriter logFile = null;

    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      try {
          
      ZombieFinal.inFile =
              new BufferedReader(new InputStreamReader(System.in));
      
      ZombieFinal.outFile = new PrintWriter(System.out, true);
      
      //open log file
      String filePath = "log.txt";
      ZombieFinal.logFile = new PrintWriter(filePath);
              
        
      StartProgramView StartProgramView= new StartProgramView();
      StartProgramView.displayStartProgramView();
      return;
     
      
    } catch (Throwable e) {
    
            System.out.println("Exception: " + e.toString() +
                               "\nCause: " + e.getCause() +
                               "\nMessage: " + e.getMessage());
            
            e.printStackTrace();
            
    }
      finally {
          try {
              
              if (ZombieFinal.inFile != null);
                  ZombieFinal.inFile.close();
                  
              if (ZombieFinal.outFile != null)     
                  ZombieFinal.outFile.close();
              
              if (ZombieFinal.logFile != null)
                  ZombieFinal.logFile.close();
          } catch (IOException ex) {
              System.out.println("Error closing files");
              return ;
          }
          
      }
      
      
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ZombieFinal.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ZombieFinal.player = player;
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ZombieFinal.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        ZombieFinal.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        ZombieFinal.logFile = logFile;
    }
    
    
}