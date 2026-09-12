package week5;

import java.util.Arrays;
import java.util.Scanner;

public class FantasyTeam {

    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] *= 2.0;
        playerScores[viceCaptainIndex] *= 1.5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        double[] scores = new double[n];
        System.out.println("Enter the scores of the players:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextDouble();
        }

        System.out.print("Enter the captain index: ");
        int captainIndex = scanner.nextInt();

        System.out.print("Enter the vice-captain index: ");
        int viceCaptainIndex = scanner.nextInt();

        applyMultipliers(scores, captainIndex, viceCaptainIndex);

        System.out.println("Updated scores: " + Arrays.toString(scores));
        scanner.close();
    }
}