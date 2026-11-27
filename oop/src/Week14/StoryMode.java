package Week14;

import java.util.Scanner;

public class StoryMode implements Game, Score, Describe {

    private int score;

    public String getName() {
        return "Story";
    }

    public int getScore() {
        return score;
    }

    public void play(Scanner in) {
        System.out.println("\nYou wake up in a dark forest. Two paths lie ahead.");
        if (Story.choose(in, "1 - Follow the river", "2 - Enter the cave") == 1) {
            System.out.println("You find a small boat. +10");
            score += 10;
        } else {
            System.out.println("Bats! You run out scratched. +5");
            score += 5;
        }
        System.out.println("\nA stranger offers to guide you.");
        if (Story.choose(in, "1 - Trust the stranger", "2 - Go alone") == 1) {
            System.out.println("He leads you safely to a village. +10");
            score += 10;
        } else {
            System.out.println("You get lost, but find a map. +5");
            score += 5;
        }
        System.out.println("\nThe village gate is locked.");
        if (Story.choose(in, "1 - Knock politely", "2 - Climb the wall") == 1) {
            System.out.println("The gate opens. You are safe! +10");
            score += 10;
        } else {
            System.out.println("You fall, but still make it in. +5");
            score += 5;
        }
        System.out.println("\nThe End.");
    }
}
