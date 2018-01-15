/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *    methode generice
 * @author Dragos
 */
public class Util {
    /** 
     static method returns true or false after comparing two objects by type 
     * Pair with two generic parameters K and V (Key and Value) 
     * @param <K> generic type key 
     * @param <V> generic type value 
     * @param p1 formal parameter by type PairClass 
     * @param p2 formal parameter by type PairClass
     * @return boolean 
     */ 
    public static <K, V> boolean compare(OrderedPair<K, V> p1, OrderedPair<K, V> p2) { 
        return p1.getKey().equals(p2.getKey()) && 
               p1.getValue().equals(p2.getValue()); 
    } 
}