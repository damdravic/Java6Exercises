/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopCalculator;

/**
 *
 * @author user
 */
public class Screen {
    
    private int valoareafis;
    
    public Screen(int valoare  ){
            this.valoareafis=valoare;
    
    }
    
    public Screen(){
        
    }
    
   int displayTurnedOn(int valoareCerutaDeMetoda){
      System.out.println("Calculator is ON");
        this.valoareafis = valoareCerutaDeMetoda;
       System.out.println( valoareafis  ); 
        return valoareafis;
    }
    
    
}
