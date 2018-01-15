/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author Dragos
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scannerRegex = new Scanner(System.in); 
        System.out.println("Insert regex or pattern to be searched: "); 
        // read the regular expresion 
        //String regex = scannerRegex.next(); 
        String regex = "^((1|2)(\\d{2}((((0[13578]|1[02])(0[1-9]|[1-2][0-9]|3[01]))|((0[469]|11)(0[1-9]|[1-2][0-9]|30))|(02(0[1-9]|1[0-9]|2[0-8]))))|(((0[48]|[2468][048]|[13579][26]))|(([02468][048])|[13579][26])00)(02)(29))([1-4][0-9]|5[0-2]|0[1-9])(\\d{3})(\\d))$";
        // create a pattern using introduced regular expresion 
          Pattern pattern = Pattern.compile(regex); 
        // read the source string using a new Scanner object 
        Scanner scannerSourceString = new Scanner(System.in); 
        System.out.println("Insert source string: "); 
        String source = scannerSourceString.nextLine(); 
        // create the matcher as result of applying regex on source string 
        Matcher matcher = pattern.matcher(source); 
        boolean found = false; 
        // if the regular expression or pattern was found 
        while (matcher.find()) { 
            String result; 
            result = String.format("I found text \"%s\" starting at " +  
                    "index %d until index %d.", 
                    matcher.group(), 
                    matcher.start(), 
                    matcher.end()); 
            System.out.println(result); 
            found = true; 
        } 
        // if regular expression or pattern was not found in source string 
        if (!found) { 
            System.out.println("No match found :("); 
        }

    }
    
}
