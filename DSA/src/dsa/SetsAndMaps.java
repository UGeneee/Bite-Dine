package dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SetsAndMaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== HashSet ===");

        HashSet<String> courses = new HashSet<>();

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter course " + i + ": ");
            courses.add(sc.nextLine());
        }

        System.out.println("Courses: " + courses);
        System.out.println();

        System.out.print("Search course: ");
        String courseSearch = sc.nextLine();
        if (courses.contains(courseSearch)) {
            System.out.println(courseSearch + " is available.");
        } else {
            System.out.println(courseSearch + " is not found.");
        }

        System.out.print("Remove course: ");
        String courseRemove = sc.nextLine();
        courses.remove(courseRemove);
        System.out.println("Courses after removal: " + courses);
        System.out.println();

        System.out.println("=== HashMap ===");

        HashMap<String, Integer> grades = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student " + i + " name: ");
            String name = sc.nextLine();
            System.out.print("Enter " + name + "'s grade: ");
            int grade = sc.nextInt();
            sc.nextLine();
            grades.put(name, grade);
        }

        System.out.println("Grades: " + grades);
        System.out.println();

        System.out.print("Search student: ");
        String searchName = sc.nextLine();
        if (grades.containsKey(searchName)) {
            System.out.println(searchName + "'s grade: " + grades.get(searchName));
        } else {
            System.out.println(searchName + " is not found.");
        }

        System.out.print("Update student: ");
        String updateName = sc.nextLine();
        if (grades.containsKey(updateName)) {
            System.out.print("New grade: ");
            int newGrade = sc.nextInt();
            sc.nextLine();
            grades.put(updateName, newGrade);
            System.out.println("Grades after update: " + grades);
        } else {
            System.out.println(updateName + " is not found.");
        }

        System.out.print("Remove student: ");
        String removeName = sc.nextLine();
        grades.remove(removeName);
        System.out.println("Grades after removal: " + grades);

        sc.close();
    }
}
