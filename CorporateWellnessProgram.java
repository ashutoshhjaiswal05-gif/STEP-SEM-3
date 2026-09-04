import java.util.Scanner;

public class CorporateWellnessProgram {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) { 
            return "Normal";
        } else if (bmi < 30.0) { 
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-12s | %-8s | %-15s\n", "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double height = heights[i];
            double weight = weights[i];
            
            // BMI Calculation
            double bmi = weight / (height * height);
            String status = getBmiStatus(bmi);

            // Print formatted row
            System.out.printf("Person %-3d | %-12.2f | %-12.2f | %-8.2f | %-15s\n", 
                              (i + 1), height, weight, bmi, status);
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees in the team: ");
        int teamSize = scanner.nextInt();

        // Initialize parallel arrays based on user input
        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];

        // Gather data for each person
        for (int i = 0; i < teamSize; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter height in meters (e.g., 1.75): ");
            heights[i] = scanner.nextDouble();
            
            System.out.print("Enter weight in kg (e.g., 70.0): ");
            weights[i] = scanner.nextDouble();
        }

        System.out.println("\nGenerating Wellness Report...\n");
        printWellnessReport(heights, weights);

        scanner.close();
    }
}