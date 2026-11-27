import java.util.Scanner;
public class RunBloodData {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BloodData bd = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String bloodType = scan.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rhFactor = scan.nextLine();

        bd.setBloodType(bloodType);
        bd.setRhFactor(rhFactor);

        System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
    }
}
