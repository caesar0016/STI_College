import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class studentsList{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Map <String, String > students = new HashMap<>();


        
        String studentNumber = "", studentName = "";
        System.out.println("-------------Input three students---------------");

        for(int i = 0; i < 3; i++){

            System.out.println("---------------------------");
            System.out.print("Enter Student No: ");  
            studentNumber = s.next();
            s.nextLine();      
            System.out.print("Enter Student Name: ");
            studentName = s.nextLine();
    
            students.put(studentNumber, studentName);

        }
        System.out.println("--------------------------------");
        System.out.println(students);
        
        for(Map.Entry e : students.entrySet()){
            System.out.println("----------------------");
            System.out.println("Keys==========Values");
            System.out.println(e.getKey() + "       ||         " + e.getValue());
            System.out.println("--------------------");
        }
        
        students.remove(studentNumber, studentName);
        System.out.print("Enter No: ");
        String num1 = s.nextLine();

        System.out.print("Enter Name: ");
        String inputName = s.nextLine();

        students.put(num1, inputName);

        for(Map.Entry e : students.entrySet()){
            System.out.println("----------------------");
            System.out.println("Keys==========Values");
            System.out.println(e.getKey() + "       ||         " + e.getValue());
            System.out.println("--------------------");
        }





















    }



}