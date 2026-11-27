package dsa;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDirectory {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> studentList = new HashMap<String, String>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student number: ");
            String studNum = sc.nextLine();

            System.out.print("Enter student name: ");
            String studName = sc.nextLine();

            studentList.put(studNum, studName);
        }

        System.out.println("Student directory: " + studentList);

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1 - Search, 2 - Remove, 3 - Add/Update, 4 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter student number to search: ");
                    String searchNum = sc.nextLine();

                    if (studentList.containsKey(searchNum)) {
                        System.out.println("Student name: " + studentList.get(searchNum));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 2: 
                    System.out.print("Enter student number to remove: ");
                    String removeNum = sc.nextLine();

                    if (studentList.containsKey(removeNum)) {
                        String removed = studentList.remove(removeNum);
                        System.out.println("Removed student " + removed);
                        System.out.println("Updated student directory: " + studentList);
                    } else {
                        System.out.println("Student not found. Nothing removed.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter student number to add or update: ");
                    String newNum = sc.nextLine();

                    System.out.print("Enter student name: ");
                    String newName = sc.nextLine();

                    if (studentList.containsKey(newNum)) {
                        studentList.put(newNum, newName);
                        System.out.println("Existing record found. Updated entry.");
                    } else {
                        studentList.put(newNum, newName);
                        System.out.println("No existing record found. Added new entry.");
                    }
                    System.out.println("Updated student directory: " + studentList);
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid input. Please choose 1 to 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
