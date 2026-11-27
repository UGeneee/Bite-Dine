package Game;

import java.util.Scanner;
public class HistoryGame implements Menu {

    public void show(String name) {
        System.out.println("\nWelcome to Philippine History Guess, " + name + "! Press 1, 2, or 3.");
        System.out.println("1 - Continue");
        System.out.println("2 - New Game");
        System.out.println("3 - Exit");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        HistoryGame menu = new HistoryGame();
        HistoryRound game = new HistoryRound();

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        while (true) {
            menu.show(name);
            String c = in.nextLine().trim();
            if (c.equals("1")) {
                if (game.hasSave()) {
                    game.play(in);
                } else {
                    System.out.println("No saved game. Choose New Game first.");
                }
            } else if (c.equals("2")) {
                game.reset();
                game.play(in);
            } else if (c.equals("3")) {
                System.out.println("Goodbye, " + name + "! Last score: " + game.getScore());
                return;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
