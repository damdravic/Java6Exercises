/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Dragos
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
try { 
             int mounths = ageInMonths(Integer.parseInt(args[0])); 
             System.out.println("numar de luni  " + mounths);
                      } 
           catch (NumberFormatException e) { 
                              System.out.println("first program argument needs to be an int"); 
                                              }
            catch (IllegalArgumentException e) { 
                             System.out.println(e.getMessage()); 
                                                 } 
} 
 
 
static int ageInMonths(int age) { 
        if (age < 0) {
                throw new IllegalArgumentException("age should be >= 0"); 
          } 
          return age * 12; 
    } 
    
}
