/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoopcalc;

/**
 *
 * @author user
 */
public class Screen {
    
    private int valoare;
    
    public Screen(int valoare  ){
                     this.valoare=valoare;
    
    }
     
    String newLine = System.getProperty("line.separator");
    
    public void initiere(){
    
    System.out.println("Calculatorul a pornit" + newLine + "0");
    }
    
    
}
