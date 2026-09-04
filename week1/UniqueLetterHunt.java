import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueLetterHunt {

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Compute the frequency of every character
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Scan the string left to right to find the first character with a frequency of exactly 1
        for (char c : text.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }

        // Return a null character if no non-repeating character is found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- The Unique Letter Hunt Mini-Game ---");
        System.out.print("Enter a word or short sentence: ");
        String input = scanner.nextLine();

        char firstUnique = findFirstNonRepeatingChar(input);

        if (firstUnique != '\0') {
            System.out.println("First non-repeating character: '" + firstUnique + "'");
        } else {
            System.out.println("Result: No non-repeating character exists in the provided text.");
        }

        scanner.close();
    }
}