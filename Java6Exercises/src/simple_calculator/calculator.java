/*
* Calculator
 */
package simple_calculator;

/**
 *
 * @author dragos
 */
import java.util.Scanner;
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declararea variabilelor
         int nr1,nr2;
         char operator;
         double rezultat = 0.0;
         
         Scanner scanTasta = new Scanner(System.in);
         
         System.out.println("Introduceti primul numar: ");
         nr1 = scanTasta.nextInt();
         System.out.println("Introduceti operatorul: ");
         operator = scanTasta.next().charAt(0);
         System.out.println("Introduceti al 2-lea numar: ");
         nr2 = scanTasta.nextInt();
         
         switch(operator){
                  
             case'+' : rezultat = nr1 + nr2 ;
                break;
             case'-' : rezultat = nr1 - nr2 ;
                break;
             case'*' : rezultat = nr1 * nr2 ;
                break;
             case'/' : rezultat = nr1 - nr2 ;
                break;
         
        
    }
                System.out.println("Rezultatul este : " + rezultat );
  
    }  
}
