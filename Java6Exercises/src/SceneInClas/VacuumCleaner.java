/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SceneInClas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dragos
 */
public class VacuumCleaner extends Thread {
    
   private Boolean isCleaning = false;
    
    
   @Override
    public void run(){
       System.err.println("aspiratorul");
       cleaning();
    }

    
    
    //getters and setters
     
    public Boolean getIsCleaning() {
        return isCleaning;
    }

    public void setIsCleaning(Boolean isCleaning) {
        this.isCleaning = isCleaning;
    }
     
    
    
    
      //
    private void cleaning(){
        if(isCleaning){
            try {
                //cleaning  .....sleep
               
                Thread.sleep(MIN_PRIORITY);
            } catch (InterruptedException ex) {
                Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
