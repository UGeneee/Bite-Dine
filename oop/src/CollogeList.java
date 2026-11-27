
import java.util.Scanner;

public class CollogeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = sc.nextLine().trim().toUpperCase().charAt(0);

        if (choice == 'E') {
            Employee emp = new Employee();
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            emp.setName(sc.nextLine());
            emp.setContactNum(sc.nextLine());
            emp.setSalary(Double.parseDouble(sc.nextLine().trim()));
            emp.setDepartment(sc.nextLine());

            System.out.println("-----------------------------");
            System.out.println("Name: " + emp.getName());
            System.out.println("Contact Number: " + emp.getContactNum());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());

        } else if (choice == 'F') {
            Faculty fac = new Faculty();
            System.out.println("Type faculty's name, contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            fac.setName(sc.nextLine());
            fac.setContactNum(sc.nextLine());
            fac.setSalary(Double.parseDouble(sc.nextLine().trim()));
            fac.setDepartment(sc.nextLine());
            System.out.println("Press Y if the faculty is regular/tenured or N if not.");
            fac.setStatus(sc.nextLine().trim().equalsIgnoreCase("Y"));

            System.out.println("-----------------------------");
            System.out.println("Name: " + fac.getName());
            System.out.println("Contact Number: " + fac.getContactNum());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department: " + fac.getDepartment());
            System.out.println("Status: " + (fac.isRegular() ? "Regular" : "Not regular"));

        } else if (choice == 'S') {
            Student stu = new Student();
            System.out.println("Type student's name, contact number, program, and year level (1-4).");
            System.out.println("Press Enter after every input.");
            stu.setName(sc.nextLine());
            stu.setContactNum(sc.nextLine());
            stu.setProgram(sc.nextLine());
            stu.setYearLevel(sc.nextLine());

            System.out.println("-----------------------------");
            System.out.println("Name: " + stu.getName());
            System.out.println("Contact Number: " + stu.getContactNum());
            System.out.println("Program: " + stu.getProgram());
            System.out.println("Year Level: " + stu.getYearLevel());

        } else {
            System.out.println("Invalid choice. Please run again and press E, F, or S.");
        }
    }
}
