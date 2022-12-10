/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package birthmonth;

import java.util.*;

/**
 *
 * @author STI
 */
public class BirthMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Set a = new HashSet();
        Set b = new HashSet();
        
        int num1 = 0;
        
        while(num1!=3){
            System.out.print("Enter Birth Month " + (num1 +1 ) + ": ");
            Collections.addAll(a, s.next());
            
            
            num1++;
        }
        num1 = 0;
        System.out.println("......................");
        while(num1!=3){
            System.out.print("Enter Birth Month " + (num1 +1 ) + ": ");
            Collections.addAll(b, s.next());
            
            
            
            num1++;
        }
        System.out.println("Group 1: " + a);
        System.out.println("Group 2: " + b);
        
        System.out.println("......................");
        System.out.print("Enter your birth month: ");
        Set self = new HashSet();
        
        Set union = new HashSet(a);
        Set inter = new HashSet(a);
        Set diff = new HashSet(a);
        
        self.add(s.next());
       
        
        union.addAll(b);
        inter.retainAll(b);
        diff.removeAll(b);
        
        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
        System.out.println("Difference: " + diff);
        
        if (a.containsAll(self)){
        System.out.println("You have the same birth month with one of your classmates.");
        
        }
        else{
        
            System.out.println("You have no same birth month with your clasmate.");
        
        }
        
    }
    
}
