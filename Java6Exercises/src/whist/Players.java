/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Dragos
 */
public class Players {
    
    Menu menu = new Menu();
    Scanner scan = new Scanner(System.in);
    
    ArrayList<String> playersNames = new ArrayList<>(Arrays.asList("Betty","Miruna","Alin","Bogdan","George"));
    
    public void enterYourNmae(){
         menu.firstPrint();
         String name = scan.nextLine();
         playersNames.add(name);
         Collections.shuffle(playersNames);
    }
    
    
    
}
