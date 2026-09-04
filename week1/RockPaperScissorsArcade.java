import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsArcade {

    // Required method signature for determining the round winner
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) {
            return "Player Wins";
        }
        
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};

        int n = 5; // Suggested number of rounds
        
        // Arrays to store round history for the summary table
        String[] playerMoves = new String[n];
        String[] computerMoves = new String[n];
        String[] results = new String[n];

        int wins = 0;
        int losses = 0;
        int draws = 0;

        System.out.println("Welcome to the Orientation Day Coding Arcade!");
        System.out.println("Starting a " + n + "-round Rock-Paper-Scissors match...\n");

        // Game Loop
        for (int i = 0; i < n; i++) {
            System.out.print("Round " + (i + 1) + " - Enter your move (Rock, Paper, Scissors): ");
            String playerMove = scanner.nextLine();
            
            // Generate random computer move
            String computerMove = options[random.nextInt(3)];
            
            // Determine winner
            String result = playRound(playerMove, computerMove);
            System.out.println("Computer chose: " + computerMove + " -> " + result + "\n");

            // Record data
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;

            // Update statistics
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        // Output Summary Table
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-10s | %-15s | %-15s | %-15s\n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("Round %-4d | %-15s | %-15s | %-15s\n", 
                    (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println("------------------------------------------------------------------");

        // Output Statistics
        double winPercentage = ((double) wins / n) * 100;
        System.out.printf("\nFinal Summary (after %d rounds)\n", n);
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", 
                wins, losses, draws, winPercentage);

        scanner.close();
    }
}