class EmployeeSalary {
    String empName;
    double baseSalary;
    double bonus;

    public EmployeeSalary(String empName, double baseSalary, double bonus) {
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return baseSalary + bonus;
    }

    public void displaySalaryDetails() {
        System.out.printf("Employee: %s | Base: $%.2f | Bonus: $%.2f | Total: $%.2f\n",
                empName, baseSalary, bonus, calculateTotalSalary());
    }
}

public class PayrollSalaryManagement {
    public static void main(String[] args) {
        EmployeeSalary emp1 = new EmployeeSalary("Alice", 50000, 5000);
        emp1.displaySalaryDetails();
    }
}
