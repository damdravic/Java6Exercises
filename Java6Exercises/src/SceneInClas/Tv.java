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
public class Tv extends Thread {

    private Boolean isFavoritShow ;

    public Boolean getIsFavoritShow() {
        return isFavoritShow;
   }

//    public void setIsFavoritShow(Boolean isFavoritShow) {
//        this.isFavoritShow = isFavoritShow;
//    }
//    
    @Override
    public void run() {
        try {
            System.err.println("tv shows are boring");
            Thread.sleep(1000); //To change body of generated methods, choose Tools | Templates.
        } catch (InterruptedException ex) {
            Logger.getLogger(Tv.class.getName()).log(Level.SEVERE, null, ex);
        }
        isFavoritShow = true;
        System.err.println("tv show started .. ");
    }
    
    private void reciving(){
        while(true){
           if(isFavoritShow){
 
           }
        
    }
        
        
        
    }
    
    
}
