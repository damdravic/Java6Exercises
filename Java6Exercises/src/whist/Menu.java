/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whist;

/**
 *
 * @author Dragos
 */
public class Menu {
    
    Players players;
    
    public void firstPrint(){
    System.out.println("Enter you name :");
    
    }
    
    
    public void printNames(Players players){
        int nr = 1;
        for(String x : players.playersNames){
            System.out.print("Jucator "+ nr   +" : " + x + "     ");
            nr++;
            
        }
        
        
        
    }
    
    
    
    
}
