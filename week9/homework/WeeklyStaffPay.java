abstract class Staff {
    String name;
    public Staff(String name) { this.name = name; }
    public abstract double calculateWeeklyPay();
}

class FullTimeStaff extends Staff {
    double weeklySalary;
    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }
    @Override public double calculateWeeklyPay() { return weeklySalary; }
}

class ContractStaff extends Staff {
    int hoursWorked;
    double hourlyRate;
    public ContractStaff(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override public double calculateWeeklyPay() { return hoursWorked * hourlyRate; }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Staff s1 = new FullTimeStaff("Karan", 1200.0);
        Staff s2 = new ContractStaff("Pooja", 30, 25.0);
        System.out.printf("%s: %.2f\n", s1.name, s1.calculateWeeklyPay());
        System.out.printf("%s: %.2f\n", s2.name, s2.calculateWeeklyPay());
        System.out.printf("Total Payroll: %.2f\n", s1.calculateWeeklyPay() + s2.calculateWeeklyPay());
    }
}
