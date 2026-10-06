import java.util.Scanner;

public class TrafficSignalAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("No signals recorded.");
            return;
        }

        int maxStreak = 0;
        char maxColor = ' ';
        
        int currentStreak = 1;
        char currentColor = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                currentStreak++;
            } else {
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    maxColor = currentColor;
                }
                currentColor = signalLog.charAt(i);
                currentStreak = 1;
            }
        }

        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            maxColor = currentColor;
        }

        System.out.println("Longest streak color: " + maxColor);
        System.out.println("Longest streak length: " + maxStreak);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the signal log sequence (e.g., RRGGGYRR): ");
        String log = scanner.nextLine();

        findLongestStreak(log);

        scanner.close();
    }
}