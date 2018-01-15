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
public class Adunare extends Thread {
    
    Counter c;
    
    public Adunare(Counter existingCounter){
            c= existingCounter;
    
}
    
    @Override
    public void run() {
        for (int i=0;i<500;i++){
    c.increment();
        System.out.println("c value " + c.value());
        
        }
}
    
    
}