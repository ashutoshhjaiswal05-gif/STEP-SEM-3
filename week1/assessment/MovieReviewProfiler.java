import java.util.Scanner;

public class MovieReviewProfiler {

    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short (1-4 letters): 0");
            System.out.println("Medium (5-8 letters): 0");
            System.out.println("Long (9+ letters): 0");
            return;
        }

        String[] words = review.trim().split("\\s+");
        
        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
            int len = cleanWord.length();
            
            if (len >= 1 && len <= 4) {
                shortCount++;
            } else if (len >= 5 && len <= 8) {
                mediumCount++;
            } else if (len >= 9) {
                longCount++;
            }
        }

        System.out.println("Short (1-4 letters): " + shortCount);
        System.out.println("Medium (5-8 letters): " + mediumCount);
        System.out.println("Long (9+ letters): " + longCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Movie Review Word Length Profiler ---");
        System.out.print("Enter the movie review: ");
        String review = scanner.nextLine();

        System.out.println("\n--- Word Length Breakdown ---");
        classifyWordLengths(review);

        scanner.close();
    }
}