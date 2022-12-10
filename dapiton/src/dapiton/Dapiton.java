/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dapiton;

import java.util.*;


/**
 *
 * @author STI
 */
public class Dapiton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Set a = new HashSet();
        Set b = new HashSet();
        Collections.addAll(a, "Mark", "Nika", "Mairo", "Kae");
        Collections.addAll(b, "John", "Marco", "Mark");
        
        Set union = new HashSet(a);
        Set inter = new HashSet(a);
        Set diff = new HashSet(a);
        
        union.addAll(b);
        inter.retainAll(b);
        diff.removeAll(b);
        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
        System.out.println("Difference: " + diff);
        System.out.println("A is a subset of B: " + a.containsAll(b));
















    }
    
}
