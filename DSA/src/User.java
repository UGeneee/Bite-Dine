import java.util.Scanner;
import java.util.HashMap;
public class User {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, String> hashTable = new HashMap<>();
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("School: ");
        String school = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Program: ");
        String program = sc.nextLine();
        
        hashTable.put("name", name);
        hashTable.put("school", school);
        hashTable.put("age", age);
        hashTable.put("program", program);
        
        
        System.out.println("Name: " + hashTable.get("name"));
        System.out.println("School: " + hashTable.get("school"));
        System.out.println("Age: " + hashTable.get("age"));
        System.out.println("Program: " + hashTable.get("program"));
    }
}
