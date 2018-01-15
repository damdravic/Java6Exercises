/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Dragos
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create a new Box  for Sring
       String sir = new String("Sirul de pus in cutie");
       Box<String> cutiuta = new Box<String>();
       cutiuta.setVolume(sir);
       
       Double numarCuVirgula = new Double(223.225);  // 
       Box<Double> cutioaie = new Box<>();
       cutioaie.setVolume(numarCuVirgula);
       
       // generatre boxpt bocanc
       
       Bocanc bocanc = new Bocanc();             //cream un bocanc
       Box<Bocanc> cutieDeBocanci = new Box<>(); //creem o noua cutie
       cutieDeBocanci.setVolume(bocanc);         // introducem bocncul in cutie
       
       
       System.out.println("Cutiuta de siruri contine" + cutiuta.getVolume());
          System.out.println("Cutiuta de double contine" + cutioaie.getVolume());
             System.out.println("Cutiuta de bocanci contine" + cutieDeBocanci.getVolume());
       
       
       //create a Urna fou Integer
       Integer numarIntreg = 12;
       Urna <Integer> urnaCuIntregi = new  Urna<>();
       urnaCuIntregi.setMyNumber(numarIntreg);
       System.out.println("urna de numere" + urnaCuIntregi.getMyNumber());
       
       
       OrderedPair<Integer, String> perechiOrdonate ;
       Integer i =10;
       String s = "Aha!";
       perechiOrdonate = new OrderedPair<Integer, String>(i,s);
       
       System.out.println("Perechea Ordonata este ( " + perechiOrdonate.getKey()+ " , " +perechiOrdonate.getValue() +" )");
       
       
          // call a generyc type method 
          
        OrderedPair<Integer, String> p1 = new OrderedPair<>(1, "apple"); 
        OrderedPair<Integer, String> p2 = new OrderedPair<>(2, "pear"); 
        OrderedPair<Integer, String> p3 = new OrderedPair<>(1, "apple"); 
        boolean same; 
        same = Util.<Integer, String>compare(p1, p2); 
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p2.getKey()+","+p2.getValue()+") is "+same); 
        same = Util.<Integer, String>compare(p1, p3); 
        System.out.println("("+p1.getKey()+","+p1.getValue()+") is equal with ("+p3.getKey()+","+p3.getValue()+") is "+same);
       
       
       
       
       
       
       
    }
    
}
