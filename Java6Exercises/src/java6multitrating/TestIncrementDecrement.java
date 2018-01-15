/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6multitrating;

/**
 *
 * @author Dragos
 */
public class TestIncrementDecrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creearea contorului
        
        Counter contor = new Counter();
        
        
        
        // creem 2 thread-uri
        Adunare add = new Adunare(contor);
        Scadere dif = new Scadere(contor);
        
        add.setPriority(10);
        dif.setPriority(1);
        
        
        add.start();
        dif.start();
        
        
        
        
        
    }
    
}
