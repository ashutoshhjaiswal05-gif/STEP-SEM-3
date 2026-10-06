import java.util.ArrayList;
import java.util.List;

public class ArrayDifferenceFinder {
    public static List<Integer> findDifference(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr1) {
            boolean found = false;
            for (int val : arr2) {
                if (num == val) {
                    found = true;
                    break;
                }
            }
            if (!found && !result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("Elements in arr1 but not arr2: " + findDifference(arr1, arr2));
    }
}
