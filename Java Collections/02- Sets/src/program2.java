/*
 *  Java Masterclass
 *  Kareem Abdelkader
 *  Implement a Sorted Leader Board
 */


import java.util.Scanner;
import java.util.TreeSet;

class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Player other) {
        return Integer.compare(other.score, this.score); // Descending order
    }

    @Override
    public String toString() {
        return name + " - Score: " + score;
    }
}


public class program2 {

    public static void main(String[] args) {

        TreeSet<Player> leaderboard = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter player name (or type 'exit' to stop): ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter player score: ");
            int score;
            try {
                score = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid score. Please enter a number.");
                continue;
            }

            leaderboard.add(new Player(name, score));
            System.out.println("Player added successfully!\n");
        }

        System.out.println("\nLeaderboard (Sorted by Score Descending):");
        for (Player player : leaderboard) {
            System.out.println(player);
        }

        scanner.close();

    }

}
