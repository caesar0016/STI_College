/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runanimal;
import java.util.Scanner;
/**
 *
 * @author STI
 */
public class RunAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
         boolean isDone = false;
        
        while (isDone != true){
            System.out.println("..................");
            System.out.println("Menu: [B] for Bird, [C] for Cat, [D] for Dog");
            System.out.println("[E] for Exit");
            System.out.println("..................");
            System.out.print("Choose Animal: ");
            String inputAnimal = s.next();
            
            
            if(inputAnimal.equalsIgnoreCase("B")){
                Bird b = new Bird();
                
                System.out.println("..................");
                b.eat();
                b.sleep();
                b.makeSound();

            }
            else if(inputAnimal.equalsIgnoreCase("C")){
                Cat c = new Cat();
                
                System.out.println("..................");
                c.eat();
                c.sleep();
                c.makeSound();
       
            }
            else if(inputAnimal.equalsIgnoreCase("D")){
                Dog d = new Dog();
                
                System.out.println("..................");
                d.eat();
                d.sleep();
                d.makeSound();

            }
            else if(inputAnimal.equalsIgnoreCase("E")){
                
                System.out.println("..................");
                System.out.println("Exiting...");
                isDone = true;
            
            }
            else{
                System.out.println("..................");
                System.out.println("Invalid Input");
            
            }

        }

    }
    
}
