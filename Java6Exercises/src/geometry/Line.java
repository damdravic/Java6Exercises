/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Dragos
 */
public class Line extends Flat implements Definible {
    

    
 String definition = " determinata de 2 puncte";   
        
 
 public String getDefinition(){
     
          String grangpaDefinition = super.getParentDefinition();
        
          String parentDefinition = super.definition;  
          
          String finaldefinition = grangpaDefinition + parentDefinition + definition ;
            
        return finaldefinition ;
        
        }
    
    
    
}
