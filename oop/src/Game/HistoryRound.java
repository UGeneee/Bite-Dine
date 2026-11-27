package Game;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class HistoryRound implements Play, Resume, Score {

    private static final int ROUNDS = 5;
    private final String[] events = {
        "Magellan arrives in the Philippines and the Battle of Mactan",
        "Legazpi founds the city of Manila",
        "The execution of Gomburza",
        "The founding of the Katipunan",
        "The execution of Jose Rizal",
        "Independence is declared in Kawit, Cavite",
        "The Philippine American War begins",
        "The Commonwealth of the Philippines is established",
        "Japan invades the Philippines in World War II",
        "The Liberation of Manila",
        "The Philippines gains independence from the United States",
        "Martial law is declared by Ferdinand Marcos",
        "The assassination of Benigno Aquino Jr.",
        "The EDSA People Power Revolution",
        "Mount Pinatubo erupts",
        "Typhoon Haiyan (Yolanda) hits the Philippines"
    };
    private final int[] years = {
        1521, 1571, 1872, 1892, 1896, 1898, 1899, 1935,
        1941, 1945, 1946, 1972, 1983, 1986, 1991, 2013
    };

    private List<Integer> order;
    private int round, tries, score;
    private boolean active;

    public boolean hasSave() {
        return active;
    }

    public int getScore() {
        return score;
    }

    public void reset() {
        order = new ArrayList<Integer>();
        for (int i = 0; i < events.length; i++) {
            order.add(i);
        }
        Collections.shuffle(order);
        round = 0;
        tries = 0;
        score = 0;
        active = true;
    }

    public void play(Scanner in) {
        while (round < ROUNDS) {
            int e = order.get(round);
            System.out.println("\nRound " + (round + 1) + " of " + ROUNDS + " - Score: " + score);
            System.out.println("In what year did this happen?");
            System.out.println(">> " + events[e]);
            while (true) {
                System.out.print("Your guess (0 = back to menu): ");
                int g;
                try {
                    g = Integer.parseInt(in.nextLine().trim());
                } catch (NumberFormatException ex) {
                    System.out.println("Please type a year, like 1900.");
                    continue;
                }
                if (g == 0) {
                    return;
                }
                tries++;
                if (g < years[e]) {
                    System.out.println("Later than that!");
                } else if (g > years[e]) {
                    System.out.println("Earlier than that!");
                } else {
                    break;
                }
            }
            int points = Math.max(100 - 10 * (tries - 1), 10);
            score += points;
            System.out.println("Correct! It was " + years[e] + ". +" + points + " points (" + tries + " tries).");
            round++;
            tries = 0;
        }
        System.out.println("\n=== GAME OVER ===");
        System.out.println("Final score: " + score + " / " + (ROUNDS * 100));
        active = false;
    }

}
