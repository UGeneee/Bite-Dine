package Week14;

import java.util.Random;
import java.util.Scanner;

public class SurvivalMode implements Game, Score, Describe {

    private int score;

    public String getName() {
        return "Survival";
    }

    public int getScore() {
        return score;
    }

    public void play(Scanner in) {
        Random rnd = new Random();
        int health = 100, food = 2, days = 0;
        for (int day = 1; day <= 5; day++) {
            System.out.println("\nDay " + day + " - Health: " + health + ", Food: " + food);
            if (Story.choose(in, "1 - Hunt for food", "2 - Rest") == 1) {
                if (rnd.nextBoolean()) {
                    System.out.println("You caught food! +2 food");
                    food += 2;
                } else {
                    System.out.println("You got hurt. -20 health");
                    health -= 20;
                }
            } else {
                health = Math.min(100, health + 20);
                System.out.println("You rested. +20 health");
            }
            if (food > 0) {
                food--;
            } else {
                System.out.println("You are starving. -30 health");
                health -= 30;
            }
            if (health <= 0) {
                System.out.println("You did not survive.");
                break;
            }
            days++;
        }
        score = days * 20 + Math.max(health, 0);
    }
}
