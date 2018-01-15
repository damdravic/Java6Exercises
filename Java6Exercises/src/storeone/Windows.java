/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storeone;
import javax.swing.JFrame;
/**
 *
 * @author Dragos
 */
public class Windows {
    
    public String createWindow(String titlu){
        
        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(400,400);
        
        return titlu;
        
        
    }
    
    
    
}
