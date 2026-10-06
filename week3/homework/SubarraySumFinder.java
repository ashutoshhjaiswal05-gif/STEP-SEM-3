public class SubarraySumFinder {
    public static void findSubarray(int[] arr, int target) {
        int currentSum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];
            while (currentSum > target && start < end) {
                currentSum -= arr[start++];
            }
            if (currentSum == target) {
                System.out.println("Subarray found between index " + start + " and " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        findSubarray(arr, 33);
    }
}
