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
public class Calculator {
    
    public static Screen ecran= new Screen();
    
    public static Processes proces = new Processes();
    
    public static void main(String[] args){
        
        
        ecran.initiere();
        
        ecran.ready(0);
        
        proces.creatingOperand();
        
        
    }
    
    
    
    
    
    
    
    
}
