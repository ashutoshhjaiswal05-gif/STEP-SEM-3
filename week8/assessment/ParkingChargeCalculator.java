abstract class Vehicle {
    int hours;
    public Vehicle(int hours) { this.hours = hours; }
    public abstract double calculateFee();
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(int hours) { super(hours); }
    @Override
    public double calculateFee() { return hours * 10.0; }
}

class FourWheeler extends Vehicle {
    public FourWheeler(int hours) { super(hours); }
    @Override
    public double calculateFee() { return hours * 20.0; }
}

public class ParkingChargeCalculator {
    public static void main(String[] args) {
        Vehicle v1 = new TwoWheeler(5);
        Vehicle v2 = new FourWheeler(5);
        System.out.printf("Two Wheeler Fee: $%.2f\n", v1.calculateFee());
        System.out.printf("Four Wheeler Fee: $%.2f\n", v2.calculateFee());
    }
}
