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
public class FamilySceneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating instances
        
        
        
        Cigar tigara = new Cigar();
        Woman femeie = new Woman(tigara);
        Tv tv = new Tv();
        VacuumCleaner  aspirator = new VacuumCleaner();
        Man barbat = new Man(aspirator,femeie,tv);
        
        
        tigara.start();
        tv.start();
        femeie.start();
        barbat.start();
        aspirator.start();
        
        //simulating started favorit show
        // tv.setIsFavoritShow(Boolean.TRUE);
        
        
        
        
        
        
        
        
        
    }

    
}
