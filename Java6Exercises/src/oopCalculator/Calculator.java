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
    static int operand1;
    static int operand2;
    static char operator1 =' ';
    static char operator2;
    
    private Button[] butoane;
    private Character buttonsSymbols[] = {'0','1','2','3','4','5','6','7','8','9','+','-','*','/','='};
    
    public Calculator(){
         butoane =  new Button[15];
        int i = 0;
        for(Character currentMarkup:buttonsSymbols){
            Button newButton = new Button();
            newButton.buttonSymbol(currentMarkup);
            butoane[i] = newButton;
            i++;
                                               }
                           }

    
   public void turnOn(){
       ecran.displayTurnedOn(0);
   } 
   
   
    public void displayMessage(){
        if( operator2 == '=' ){
          // trimite la calcul
                                    }
         else if(operator1 == '+' || operator1 == '-' || operator1 == '/' || operator1 == '*' || operator1 == ' '){     
                            if(operatorNr == operandNr){
                               ecran.displayMessageIntro("Enter new operand : ");
                               operandNr++;
                                  if(operand1 == 0){
                                         int operand1 = read.nextInt();
                                         displayMessage();
                                       }
                                   else{    int operand2 = read.nextInt();
                                     displayMessage();
                                                  }
                                                        }
                
                           
                           else{ecran.displayMessageIntro("Enter operator:");
                              operatorNr++;
                             if(operator1 == ' '){
                                         int operand1 = read.next().charAt(0);
                                         displayMessage();
                                       }
                                   else{    int operator2 = read.next().charAt(0);
                                     displayMessage();
                                                  }
           
                                      }
      
         }
      
    }
     
        
        

    
    
    
   public int getOperand1(){
       return operand1;
   } 
   
   public int getOperand2(){
       return operand2;
   } 
   
   public char getOperator(){
       return operator1;
   } 
    
   
}

