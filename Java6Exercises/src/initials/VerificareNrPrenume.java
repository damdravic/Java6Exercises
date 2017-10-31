/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initials;
import java.util.Scanner;
/**
 *
 * @author Dragos
 */
public class VerificareNrPrenume {
    Scanner scan =  new Scanner(System.in);
    private int nrp;
    
    public int getNrp(){
        return nrp;
    }
    
    public void setNrp(){
        System.out.println("Cate prenume aveti?");
        this.nrp = scan.nextInt();
        
    }
    
}
