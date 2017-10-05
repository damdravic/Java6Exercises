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
public class Calculator {
    
    
    Screen ecran = new Screen();
    static int operatorNr = 1;
    static int operandNr = 1;
    
   public void turnOn(){
       ecran.displayTurnedOn(0);
   } 
    public void displayMessage(){
      if(operatorNr == operandNr){
                 ecran.displayMessageOperandIntro("Intro")

    
                   }
    }
   
   }
   
    

