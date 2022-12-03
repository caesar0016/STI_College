package dapiton;

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Comparator comp = Comparator.comparing(String::length);
		
		PriorityQueue <String>nicknames  = new PriorityQueue<String>(Collections.reverseOrder(comp));
		int num1 = 0;
		
		while(num1!=4) { //asking four nicknames
			System.out.print("Enter nicknames: ");
			nicknames.offer(s.nextLine());
			num1++;
		}
		System.out.println("...........................");
		System.out.println("Press [H] to say Hi");
		System.out.println("...........................");
			
		while(!nicknames.isEmpty()) { //looping the user until queue is empty
			String answer01 = s.next();
				if(answer01.equalsIgnoreCase("H")) {
					System.out.println("Hi " + nicknames.poll());
					
				}
				else {
					
					System.out.println("Invalid Input.. try again");
					
				}	
				
		}
		System.out.println("...........................");
		System.out.println("Done saying hi");
	}
}
