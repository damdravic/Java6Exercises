/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopCalculator;

/**
 *
 * @author user
 */
public class Processes {
    
      public Double getPrimulOperand() {
        return primulOperand;
    }

    public void setPrimulOperand(Double primulOperand) {
        this.primulOperand = primulOperand;
    }

    public Double getAlDoileaOperand() {
        return alDoileaOperand;
    }

    public void setAlDoileaOperand(Double alDoileaOperand) {
        this.alDoileaOperand = alDoileaOperand;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
    
    private Double add(){
        rezultat = primulOperand + alDoileaOperand;
        return rezultat;
    }
    
    private Double substract(){
        rezultat = primulOperand - alDoileaOperand;
        return rezultat;
    }
    
    private Double multiply(){
        rezultat = primulOperand * alDoileaOperand;
        return rezultat;
    }
    
    private Double divide(){
        rezultat = primulOperand / alDoileaOperand;
        return rezultat;
    }
    
    
    
    
    
    
}
