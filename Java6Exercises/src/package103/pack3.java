/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package103;

/**
 *
 * @author Dragos
 */
public class pack3 {
    public class pack31{
        
        int i = 21;
        boolean j = true;
        String sir = "h";
        
     int verify (String s)   {
         
         int x = s.length();
         return x;
     }
  
    
     
        
    }
    
    public static void main(String[] args){
         
        pack3 obj = new pack3();
       pack3.pack31 innerObj = obj.new pack31();
        
        System.out.println("ddd\n" + innerObj.verify(innerObj.sir));
         
         
     } 
    
    
    
}
