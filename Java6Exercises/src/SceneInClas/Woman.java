/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SceneInClas;

/**
 *
 * @author Dragos
 */
public class Woman extends Thread {
    
    private Boolean isSleeping = true;

    private Cigar tigara;
    
    public Woman (Cigar c){
        tigara = c;
    }
    
    public void setIsSleeping(Boolean isSleeping) {
        this.isSleeping = isSleeping;
        
    }
    
    /**
     *
     */
    @Override
    public void run(){
              System.err.println("Femeia doarme");
              
              while(isSleeping){
              }
              
              System.err.println("Femeia se trezeste");
              }
                  
      private void sleeping(){
        
    }         
        
    }
    
   
    
    
            
