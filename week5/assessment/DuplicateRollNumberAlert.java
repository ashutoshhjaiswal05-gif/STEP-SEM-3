public class DuplicateRollNumberAlert {
    public static String findFirstDuplicateRollNumber(int[] rollNumbers) {
        for (int i = 0; i < rollNumbers.length; i++) {
            for (int j = i + 1; j < rollNumbers.length; j++) {
                if (rollNumbers[i] == rollNumbers[j]) {
                    return "Duplicate Found: " + rollNumbers[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        int[] rolls1 = {101, 102, 103, 101, 104};
        System.out.println(findFirstDuplicateRollNumber(rolls1));

        int[] rolls2 = {101, 102, 103, 104};
        System.out.println(findFirstDuplicateRollNumber(rolls2));
    }
}
