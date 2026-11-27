package Week14;

import java.util.Scanner;
import java.time.LocalTime;

public abstract class Weekdays implements Alarm {

    String time;

    public void setAlarm(String time) {
        this.time = time;
    }

    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(time);
        LocalTime now = LocalTime.now();

        if (alarm.isBefore(now)) {
            System.out.println("Alarm is set for tommorow!");
        } else {
            System.out.println("I'll wake you up later!");
        }

    }

}
