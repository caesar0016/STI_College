import java.util.Scanner;

public class info{
    Scanner s = new Scanner(System.in);
    stored storedNames01 = new stored();
    
    public void inputNames (){
        System.out.println("Enter Name: ");
        storedNames01.storedNames.put("Name: ", s.nextLine());
        System.out.println(storedNames01.storedNames);


    }


}