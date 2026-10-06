import java.util.Scanner;

public class ISBNValidator {

    public static String normalizeCode(String raw) {
        if (raw == null) {
            return null;
        }
        
        String trimmed = raw.trim();
        
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }
        
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) {
            return "Invalid: wrong length.";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code.";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body.";
            }
        }

        StringBuilder formattedDisplay = new StringBuilder();
        formattedDisplay.append("[")
                        .append(code.substring(0, 3))
                        .append("] YEAR: ")
                        .append(code.substring(3, 7))
                        .append(" | CATALOG: ")
                        .append(code.substring(7));

        return formattedDisplay.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawInput = scanner.nextLine();

        String normalizedCode = normalizeCode(rawInput);
        String result = validateAndFormat(normalizedCode);
        
        System.out.println(result);
        
        scanner.close();
    }
}