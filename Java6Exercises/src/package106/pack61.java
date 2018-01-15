/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package106;

/**
 *
 * @author Dragos
 */
public class pack61 {

    /**
     * @param args the command line arguments
     */
    
       public static void function(pack6 i){
           
           i.x = 'f';
           
       }
    
    
    public static void main(String[] args) {
        
        pack6 obj = new pack6();
        obj.x='k';
        System.out.println("litera din obiect :" + obj.x );
        function (obj);
        System.out.println("litera din obiect :" + obj.x );
        
        // TODO code application logic here
    }
    
}
