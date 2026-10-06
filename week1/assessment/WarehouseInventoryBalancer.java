import java.util.Scanner;

public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        
        int maxQuantity = -1;
        String maxSection = "";
        int maxIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            
            if (sectionA[i] > maxQuantity) {
                maxQuantity = sectionA[i];
                maxSection = "Section A";
                maxIndex = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            
            if (sectionB[i] > maxQuantity) {
                maxQuantity = sectionB[i];
                maxSection = "Section B";
                maxIndex = i;
            }
        }

        System.out.println("\n--- Inventory Report ---");
        System.out.println("Total Section A: " + totalA);
        System.out.println("Total Section B: " + totalB);
        
        if (totalA == totalB) {
            System.out.println("Balance Status: Balanced");
        } else {
            System.out.println("Balance Status: Not Balanced");
        }

        System.out.println("Highest Single Quantity: " + maxQuantity + " (Located in " + maxSection + " at index " + maxIndex + ")");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of product categories (array length): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        int n = scanner.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("\nEnter item quantities for Section A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Index " + i + ": ");
            sectionA[i] = scanner.nextInt();
        }

        System.out.println("\nEnter item quantities for Section B:");
        for (int i = 0; i < n; i++) {
            System.out.print("Index " + i + ": ");
            sectionB[i] = scanner.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        scanner.close();
    }
}
