import java.util.Scanner;

public class ExamHallSeatChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            // Verify if we have already processed and printed this seat as a duplicate
            // by scanning the elements before the current index.
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (seatNumbers[i] == seatNumbers[k]) {
                    alreadyProcessed = true;
                    break;
                }
            }

            if (alreadyProcessed) {
                continue; // Skip to avoid printing the same duplicate number multiple times
            }

            // Compare the current seat against every subsequent seat
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate seat found: " + seatNumbers[i]);
                    foundDuplicate = true;
                    break; 
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("All clear! No duplicate seat assignments found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Exam Hall Seat Duplication Checker ---");
        System.out.print("Enter the total number of assigned seats: ");
        
        // Handle potential invalid integer inputs for array sizing
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }
        
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Seat count must be greater than 0.");
            return;
        }

        int[] seats = new int[n];

        System.out.println("Enter the seat numbers one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + " Seat: ");
            seats[i] = scanner.nextInt();
        }

        System.out.println("\n--- Scan Results ---");
        checkDuplicateSeats(seats);

        scanner.close();
    }
}