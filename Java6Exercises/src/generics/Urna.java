/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Dragos
 * @param <U>
 */
public class Urna<U extends Number> {
    U myNumber;  // U este typul  si apoi numele (ex int a)

    public U getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(U myNumber) {
        this.myNumber = myNumber;
    }
    
    
    
    
    
    
    
    
    
    
    
}
