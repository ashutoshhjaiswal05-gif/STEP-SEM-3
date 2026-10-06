import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
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
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        String[] predefinedPlayerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        
        int wins = 0, losses = 0, draws = 0;
        int n = 5;
        
        System.out.println("Round | Player Move | Computer Move | Result");
        System.out.println("------------------------------------------------");
        
        for (int i = 0; i < n; i++) {
            String playerMove = predefinedPlayerMoves[i];
            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMove, computerMove);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            
            System.out.printf("Round %d — Player: %-8s Computer: %-8s Result: %s\n", (i + 1), playerMove, computerMove, result);
        }
        
        double winPercentage = ((double) wins / n) * 100;
        System.out.println("------------------------------------------------");
        System.out.printf("Final Summary (after %d rounds) Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", n, wins, losses, draws, winPercentage);
    }
}
