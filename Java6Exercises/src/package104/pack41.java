/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package104;

/**
 *
 * @author Dragos
 */
public class pack41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        pack4 camera1 = new pack4();
        pack4 camera2 = new pack4();
        
        camera1.lungime = 3;
        camera2.lungime = 5;
        
        System.out.println("Abia initializate 1:" + camera1.lungime );
        System.out.println("Abia initializate 2:" + camera1.lungime );
        
        camera1.lungime = camera2.lungime ;
        
        System.out.println("Egalizate 1:" + camera1.lungime );
        System.out.println("Egalizate 2:" + camera1.lungime );
        
        camera2.lungime = 6;
        
        System.out.println("Camera 2 reasignata(camera asta ar trebui sa fie 5 inca) 1:" + camera1.lungime );
        System.out.println("Camrea 2 reasignata 2:" + camera1.lungime );
      
    }
    
}
