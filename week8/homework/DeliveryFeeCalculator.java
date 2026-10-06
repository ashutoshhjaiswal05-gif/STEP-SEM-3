abstract class Delivery {
    String type;
    double weightKg;
    public Delivery(String type, double weightKg) {
        this.type = type;
        this.weightKg = weightKg;
    }
    public abstract double calculateFee();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weightKg) { super("STANDARD", weightKg); }
    @Override public double calculateFee() { return 10.0 + (weightKg * 2.5); }
}

class InternationalDelivery extends Delivery {
    public InternationalDelivery(double weightKg) { super("INTERNATIONAL", weightKg); }
    @Override public double calculateFee() { return 50.0 + (weightKg * 15.0); }
}

public class DeliveryFeeCalculator {
    public static void main(String[] args) {
        Delivery d1 = new StandardDelivery(2.0);
        Delivery d2 = new InternationalDelivery(7.0);
        System.out.printf("%s: %.2f\n", d1.type, d1.calculateFee());
        System.out.printf("%s: %.2f\n", d2.type, d2.calculateFee());
    }
}
