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

import java.util.Scanner;


public class Button {
    
  
    
    private int digits;
    public int pressButton(int valdigits){
             this.digits = valdigits;
 

   // create a new scanner with the specified String Object
   Scanner sc = new Scanner(System.in);
    
      digits = sc.nextInt();
    if (!sc.hasNextInt()) {
        System.out.println("That's not a number!");
        sc.next(); // this is important!
    }
        valdigits = digits;
        
       return valdigits;
    }
    

  
    
}
