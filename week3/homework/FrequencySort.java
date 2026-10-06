import java.util.*;

public class FrequencySort {
    public static String sortByFrequency(String s) {
        Map<java.lang.Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<java.lang.Character> list = new ArrayList<>(map.keySet());
        list.sort((a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for (java.lang.Character c : list) {
            for (int i = 0; i < map.get(c); i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sortByFrequency("tree"));
    }
}
