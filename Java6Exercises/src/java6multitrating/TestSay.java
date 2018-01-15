/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java6multitrating;

/**
 *
 * @author Dragos
 */
public class TestSay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SayGoodMorning sgm =new SayGoodMorning();
        SayGoodBye sgb =new SayGoodBye();
            
        sgm.setPriority(10);
        sgb.setPriority(2);
        System.out.println("SGM State " + sgm.getState());
        System.out.println("SGB State " + sgb.getState());
        sgm.start();
        sgb.start();
        System.out.println("SGM State " + sgm.getState());
        System.out.println("SGB State " + sgb.getState());
    
        
        
        System.out.println("SGM Priority " + sgm.getPriority());
       
        System.out.println("SGM Priority " + sgb.getPriority());
 
        
        
    }
    
}
