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
public class Flat extends shape {
    
    protected String definition = "plan";
    
    
    protected String getParentDefinition(){
    
     String parentDefinition = super.definition;  
     
     return parentDefinition;
    
    }
    
    
    
}
