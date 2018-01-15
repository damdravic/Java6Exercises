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
public class Counter {
    private volatile int c = 0;//var. comuna
    private boolean canWrite = true;
    
    public synchronized void increment(){
        if(canWrite){
            canWrite = false;
           c++;
        }
        canWrite = true;
    }
    
    public synchronized void decrement() {
        if(canWrite){
            canWrite = false;
           c--;
        }
        canWrite = true;
    }
    public int value() {
        return c;
    }
}
