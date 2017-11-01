/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopCalculator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Button {
  
    public Character pressButton() {
        return symbol;
    }

    public void buttonSymbol(Character symbol) {
        this.symbol = symbol;
    }

    private Character symbol;
  
}
