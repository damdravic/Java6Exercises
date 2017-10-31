/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/**
 *
 * @author Dragos
 */
public class Windows extends JFrame{
    
    JFrame win1 = new JFrame();
    
    
     public void createWindow(String titlu,String scope){
     

     win1.setLayout(null);
     win1.setVisible(true);
     win1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
     win1.setSize(400, 400);
     win1.setTitle(titlu);
     

     
     
     JButton b=new JButton("Search EBook ");

        b.setSize(130, 30);  
        
             
        //Adding button onto the frame
        win1.add(b);  
     }
     
     int centreWindow() {
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (int) ((dimension.getWidth() - win1.getWidth()) / 2);
    int y = (int) ((dimension.getHeight() - win1.getHeight()) / 2);
     
      return x ;
         
      
      
}

  
     
 } 

