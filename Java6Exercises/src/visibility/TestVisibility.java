/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visibility;

import viisibility.packageOne.Alpha;
import viisibility.packageOne.Beta;
import viisibility.packageTwo.Gamma;

/**
 *
 * @author Dragos
 */
public class TestVisibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alpha alphaObject = new Alpha();
        Beta betaObject = new Beta();
        Gamma gammaObject = new Gamma();
        
        System.out.println("TestVisibility Alpha class:public var:"+alphaObject.publicVarA);
        //System.out.println("TestVisibility Alpha class:protected var:"+alphaObject.protectedVarA);
          
        //System.out.println("TestVisibility Alpha class:private var:"+alphaObject.privateVarA);
        //System.out.println("TestVisibility Alpha class:package var:"+alphaObject.packageVarA);
        
        System.out.println("TestVisibility Alpha method:public methode:");
        alphaObject.testInternVariables();
        
        System.out.println("TestVisibility Beta method:public methode:");
        betaObject.testInheritedVariables();
        
        System.out.println("TestVisibility Beta method:public methode:");
        gammaObject.testInheritedVariables();
        
        System.out.println("TestVisibility Beta method Parent:public methode:");
        gammaObject.testParentVariables();
        
    }
    
}
