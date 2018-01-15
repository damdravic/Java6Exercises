/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package velocity;
import java.util.Scanner;
/**
 *
 * @author Dragos
 */
public class velo {
    int distance;
    int time;
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        velo v = new  velo();
        System.out.println("Ce distanta aveti de parcurs (m):");
        v.distance =scan.nextInt();
        System.out.println("Timpul in care trebuie parcursa distanta (ore) :");
        v.time = scan.nextInt();
        double viteza = v.distance/v.time;
        System.out.println("Viteza cu care trebuie sa se deplaseze: " + viteza + "m/h");
        
        
        
        
        
    }
    
    
    
    
}
