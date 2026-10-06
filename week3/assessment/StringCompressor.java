public class StringCompressor {
    public static String compressString(String str) {
        if (str == null || str.isEmpty()) return str;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.length() < str.length() ? sb.toString() : str;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
    }
}
