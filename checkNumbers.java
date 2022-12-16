
import java.util.Scanner;

public class checkNumbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the program!");
        System.out.println("...................");

        System.out.println("Enter No");
        Long contact =  s.nextLong();

        String num2 = contact + " ";

       System.out.println("Length: " + num2.length());

       if(num2.length() == 4){

        System.out.println("Size: " + num2.length());
        System.out.println("This is valid");
       

       }
       else{

        System.out.println("Not valid");

       }

    }
    
}
