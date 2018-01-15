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
public class WhistPlay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PachetCarti pc = new PachetCarti();
        Players players = new Players();
        Menu menu = new Menu();
        
        
        
        players.enterYourNmae();
        menu.printNames(players);
        
        
        pc.packCard();
       
    }
    
}
