
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Enrollment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, LinkedList<String>> map = new HashMap<>();

        int choice = 0;

        do {
            System.out.println("\n===== STUDENT ENROLLMENT SYSTEM =====");
            System.out.println("1. Enroll Student");
            System.out.println("2. Display All Enrolled Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = 0; 
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());

                        if (map.containsKey(id)) {
                            System.out.println("That Student ID is already enrolled.");
                            break;
                        }

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine().trim();

                        System.out.print("Enter Course: ");
                        String course = sc.nextLine().trim();

                        LinkedList<String> info = new LinkedList<>();
                        info.add(name);  
                        info.add(course); 

                        map.put(id, info);
                        System.out.println("Student enrolled successfully!");
                    } catch (NumberFormatException e) {
                        System.out.println("Student ID must be a number.");
                    }
                    break;

                case 2:
                    if (map.isEmpty()) {
                        System.out.println("No students enrolled yet.");
                    } else {
                        System.out.println("\n--- Enrolled Students ---");
                        for (int key : map.keySet()) {
                            LinkedList<String> info = map.get(key);
                            System.out.println("ID: " + key
                                    + " | Name: " + info.get(0)
                                    + " | Course: " + info.get(1));
                        }
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter Student ID to search: ");
                        int searchId = Integer.parseInt(sc.nextLine().trim());

                        if (map.containsKey(searchId)) {
                            LinkedList<String> info = map.get(searchId);
                            System.out.println("Student found!");
                            System.out.println("ID: " + searchId
                                    + " | Name: " + info.get(0)
                                    + " | Course: " + info.get(1));
                        } else {
                            System.out.println("No student found with that ID.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Student ID must be a number.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
