import java.util.Arrays;
import java.util.Scanner;

class Player implements Comparable<Player> {

    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed,
                  double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // First isDraftable() method
    // Rule for experienced players
    public boolean isDraftable() {
        return isDraftable(matchesPlayed, injured);
    }

    // Second overloaded isDraftable() method
    // Rule for all players
    static boolean isDraftable(int matchesPlayed, boolean injured) {

        // Experienced player
        if (matchesPlayed >= 10) {
            return true;
        }

        // Less experienced but fit player
        if (matchesPlayed >= 5 && injured == false) {
            return true;
        }

        return false;
    }

    // Sort by batting average in descending order
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage,
                              this.battingAverage);
    }

    public String getName() {
        return name;
    }
}

public class FantasyLeagueAutoDraft {

    static String draftAndRank(Player[] players) {

        // Count draftable players
        int count = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i].isDraftable()) {
                count++;
            }
        }

        // Create array for draftable players
        Player[] draftable = new Player[count];

        int index = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i].isDraftable()) {
                draftable[index] = players[i];
                index++;
            }
        }

        // Sort using compareTo()
        Arrays.sort(draftable);

        // Create output
        String result = "";

        for (int i = 0; i < draftable.length; i++) {
            result = result + (i + 1) + ". "
                    + draftable[i].getName();

            if (i < draftable.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        Player[] players = new Player[n];

        // Input player details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Player " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Matches Played: ");
            int matchesPlayed = sc.nextInt();

            System.out.print("Batting Average: ");
            double battingAverage = sc.nextDouble();

            System.out.print("Injured (true/false): ");
            boolean injured = sc.nextBoolean();

            players[i] = new Player(
                name,
                matchesPlayed,
                battingAverage,
                injured
            );
        }

        System.out.println("\nDraft Ranking:");
        System.out.println(draftAndRank(players));

        sc.close();
    }
}