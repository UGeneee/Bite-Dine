package Week14;

import java.util.Scanner;

public class Story {

    static int choose(Scanner in, String a, String b) {
        System.out.println(a);
        System.out.println(b);
        while (true) {
            String c = in.nextLine().trim();
            if (c.equals("1") || c.equals("2")) {
                return Integer.parseInt(c);
            }
            System.out.println("Please press 1 or 2.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Press 1 or 2 to select your game mode.");
        Game mode = null;
        while (mode == null) {
            System.out.println("1 - Story");
            System.out.println("2 - Survival");
            String c = in.nextLine().trim();
            if (c.equals("1")) {
                mode = new StoryMode();
            } else if (c.equals("2")) {
                mode = new SurvivalMode();
            } else {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Press P to start playing, " + name + ".");
        while (!in.nextLine().trim().equalsIgnoreCase("p")) {
            System.out.println("Press P to start playing, " + name + ".");
        }

        mode.play(in);
        System.out.println("\n" + ((Describe) mode).getName() + " mode finished, " + name
                + "! Score: " + ((Score) mode).getScore());
    }
}
