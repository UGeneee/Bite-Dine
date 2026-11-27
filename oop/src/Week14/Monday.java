
package Week14;

import java.util.Scanner;
public class Monday extends Weekdays{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Monday m = new Monday();
        
        System.out.print("Enter time for alarm in this format (HH:MM): ");
        String time = sc.nextLine();
        
        m.setAlarm(time);
        m.showAlarm();
        
    }
    
}
