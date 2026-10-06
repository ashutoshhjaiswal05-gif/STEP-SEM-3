abstract class CanteenUser {
    String name;
    public CanteenUser(String name) { this.name = name; }
    public abstract double calculateTotal(double baseAmount);
}

class StudentUser extends CanteenUser {
    public StudentUser(String name) { super(name); }
    @Override
    public double calculateTotal(double baseAmount) {
        return baseAmount * 0.90; // 10% discount
    }
}

class StaffUser extends CanteenUser {
    public StaffUser(String name) { super(name); }
    @Override
    public double calculateTotal(double baseAmount) {
        return baseAmount * 0.95; // 5% discount
    }
}

public class CanteenBilling {
    public static void main(String[] args) {
        CanteenUser u1 = new StudentUser("Rahul");
        CanteenUser u2 = new StaffUser("Dr. Sharma");
        System.out.printf("STUDENT: %.2f\n", u1.calculateTotal(300.0));
        System.out.printf("STAFF: %.2f\n", u2.calculateTotal(300.0));
    }
}
