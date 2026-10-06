import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static char findFirstNonRepeatingChar(String text) {
        int[] counts = new int[256];
        for (int i = 0; i < text.length(); i++) {
            counts[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            if (counts[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0';
    }

    public static void test(String text) {
        char ch = findFirstNonRepeatingChar(text);
        if (ch != '\0') {
            System.out.printf("\"%s\" -> First Non-Repeating Character: '%c'\n", text, ch);
        } else {
            System.out.printf("\"%s\" -> No Non-Repeating Character Found\n", text);
        }
    }

    public static void main(String[] args) {
        test("swiss");
        test("aabbcc");
    }
}
