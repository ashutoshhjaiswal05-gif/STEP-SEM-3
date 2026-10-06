abstract class Employee {
    double salary;
    public Employee(double salary) { this.salary = salary; }
    public abstract double calculateBonus();
}

class PermanentEmployee extends Employee {
    public PermanentEmployee(double salary) { super(salary); }
    @Override
    public double calculateBonus() { return salary * 0.20; }
}

class ContractEmployee extends Employee {
    public ContractEmployee(double salary) { super(salary); }
    @Override
    public double calculateBonus() { return salary * 0.10; }
}

public class FestivalBonusCalculator {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(50000);
        Employee e2 = new ContractEmployee(50000);
        System.out.printf("Permanent Bonus: $%.2f\n", e1.calculateBonus());
        System.out.printf("Contract Bonus: $%.2f\n", e2.calculateBonus());
    }
}
