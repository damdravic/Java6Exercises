/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopCalculator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Calculator {
    
    Scanner read = new Scanner(System.in);
    Screen ecran = new Screen();
    static int operatorNr = 1;
    static int operandNr = 1;
    
    static int operator1;
    static int operator2;
    
    
   public void turnOn(){
       ecran.displayTurnedOn(0);
   } 
   
   
    public void displayMessage(){
      if(operatorNr == operandNr){
                 ecran.displayMessageIntro("Enter operand");
                 operandNr++;
                   if(operator1 == 0){
                                      int operand1 = read.nextInt();
                                      displayMessage();
                                       }
                   else{int operator2 = read.nextInt();
                    displayMessage();
                   }
                
                   }
      else{ecran.displayMessageIntro("Enter operator:");
                operatorNr++;
                char operator = read.next().charAt(0);
                displayMessage();
           
              }
      
      
      
    }
   
   }
   
    

