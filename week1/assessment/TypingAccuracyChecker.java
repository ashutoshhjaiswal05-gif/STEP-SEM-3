import java.util.Scanner;

public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        // Handle edge case where lengths don't match
        if (original == null || typed == null || original.length() != typed.length()) {
            System.out.println("Error: The original passage and typed attempt must be of equal length for this test.");
            return;
        }

        if (original.isEmpty()) {
             System.out.println("Error: Passage cannot be empty.");
             return;
        }

        int matches = 0;
        int firstMismatchIndex = -1;
        int totalCharacters = original.length();

        // Compare character by character using positions
        for (int i = 0; i < totalCharacters; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matches++;
            } else if (firstMismatchIndex == -1) {
                // Record the very first mismatch found
                firstMismatchIndex = i; 
            }
        }

        // Calculate the accuracy percentage
        double accuracyPercentage = ((double) matches / totalCharacters) * 100;

        // Print the final accuracy percentage
        System.out.printf("Accuracy: %.1f%%\n", accuracyPercentage);

        // Print the position of the first mismatch or a success message
        if (firstMismatchIndex == -1) {
            System.out.println("Result: Perfect match! No mismatches found.");
        } else {
            // Using 1-based indexing for the output so it makes sense to a non-programmer user
            System.out.println("First mistake occurred at position: " + (firstMismatchIndex + 1) + 
                               " (Expected '" + original.charAt(firstMismatchIndex) + 
                               "', but typed '" + typed.charAt(firstMismatchIndex) + "')");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Typing Speed Test Accuracy Checker ---");
        System.out.print("Enter the original passage: ");
        String original = scanner.nextLine();

        System.out.print("Enter your typed attempt (must be the exact same length): ");
        String typed = scanner.nextLine();

        System.out.println("\n--- Analysis ---");
        checkTypingAccuracy(original, typed);

        scanner.close();
    }
}
