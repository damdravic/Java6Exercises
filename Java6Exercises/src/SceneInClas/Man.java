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
public class Man extends Thread{
 
    private VacuumCleaner vc;
    private Woman w;
    private Tv tv;
    
    
    public Man(VacuumCleaner v, Woman woman,Tv tv){
        
        vc=v;
        w=woman;
    }
    
    
    
    @Override
    public void run() {
        cleaning(vc);
       watchingTv(tv,w);
    }
    
    private void cleaning(VacuumCleaner vc){
        vc.getIsCleaning();
    }
    
    private void watchingTv(Tv tv,Woman w){
        
        while(true){
         if(tv.getIsFavoritShow() == true){
            w.setIsSleeping(Boolean.FALSE);
            break;
        }
    }
    
    }


    
}
