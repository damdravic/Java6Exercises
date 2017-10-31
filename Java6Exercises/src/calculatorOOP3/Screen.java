/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorOOP3;

/**
 *
 * @author Dragos
 */
public class Screen {
    
    private int valoare = 0;
    
    public Screen(int valcont){
        this.valoare=valcont;
    }
    
    public Screen(){
    }
    
    public void initiere(){
     System.out.println(" *** Calculatorul este pornit *** ");
    }
    
    public void ready(int val){
      this.valoare = val;
    System.out.println(val);
    
    }
    
}
