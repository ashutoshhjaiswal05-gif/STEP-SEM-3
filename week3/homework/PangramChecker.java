public class PangramChecker {
    public static boolean isPangram(String sentence) {
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ('A' <= c && c <= 'Z') index = c - 'A';
            else if ('a' <= c && c <= 'z') index = c - 'a';
            else continue;
            mark[index] = true;
        }
        for (boolean b : mark) {
            if (!b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
    }
}
