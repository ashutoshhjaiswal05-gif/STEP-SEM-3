abstract class Tariff {
    int units;
    public Tariff(int units) { this.units = units; }
    public abstract double calculateBill();
    public abstract String getType();
}

class ResidentialTariff extends Tariff {
    public ResidentialTariff(int units) { super(units); }
    @Override public double calculateBill() { return units * 4.50; }
    @Override public String getType() { return "RESIDENTIAL"; }
}

class CommercialTariff extends Tariff {
    public CommercialTariff(int units) { super(units); }
    @Override public double calculateBill() { return units * 8.00; }
    @Override public String getType() { return "COMMERCIAL"; }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Tariff t1 = new ResidentialTariff(200);
        Tariff t2 = new CommercialTariff(300);
        System.out.printf("%s: %.2f\n", t1.getType(), t1.calculateBill());
        System.out.printf("%s: %.2f\n", t2.getType(), t2.calculateBill());
        System.out.printf("Total: %.2f\n", t1.calculateBill() + t2.calculateBill());
    }
}
