import java.util.Scanner;

public class CustomerIdentityVerification {

    public static String reverseCustomerName(String customerName) {
        if (customerName == null) {
            return null;
        }
        
        // Utilizing StringBuilder as it provides an optimized, built-in reverse function
        StringBuilder reversed = new StringBuilder(customerName);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Customer Identity Verification System ---");
        System.out.print("Enter customer name: ");
        String originalName = scanner.nextLine();

        // Call the method to reverse the string without altering the original variable
        String reversedName = reverseCustomerName(originalName);

        System.out.println("\nVerification Results:");
        System.out.println("Original Name: " + originalName);
        System.out.println("Reversed Name: " + reversedName);

        scanner.close();
    }
}