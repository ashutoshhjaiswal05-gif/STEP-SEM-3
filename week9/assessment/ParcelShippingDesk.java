interface Parcel {
    double calculateCharge();
    double calculateInsurance();
    String getType();
}

class StandardParcel implements Parcel {
    private double weightKg;
    public StandardParcel(double weightKg) { this.weightKg = weightKg; }
    @Override public double calculateCharge() { return weightKg * 50.0; }
    @Override public double calculateInsurance() { return 20.0; }
    @Override public String getType() { return "STANDARD"; }
}

class ExpressParcel implements Parcel {
    private double weightKg;
    public ExpressParcel(double weightKg) { this.weightKg = weightKg; }
    @Override public double calculateCharge() { return weightKg * 100.0; }
    @Override public double calculateInsurance() { return 50.0; }
    @Override public String getType() { return "EXPRESS"; }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel p1 = new StandardParcel(3.0);
        Parcel p2 = new ExpressParcel(3.0);
        System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n",
                p1.getType(), p1.calculateCharge(), p1.calculateInsurance(), p1.calculateCharge() + p1.calculateInsurance());
        System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n",
                p2.getType(), p2.calculateCharge(), p2.calculateInsurance(), p2.calculateCharge() + p2.calculateInsurance());
    }
}
