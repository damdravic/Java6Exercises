/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copycopy;

/**
 *
 * @author Dragos
 */
public class VacuumCleaner extends Thread{
    
    /**@Override method inherited from superclass Thread that implements Runnable. */
    @Override
    public void run(){
        System.out.println("Man's vacuuming...");
    }
}
