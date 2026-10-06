interface Appliance {
    double calculateUnits(double hoursUsed);
    double calculateCost(double hoursUsed, double ratePerUnit);
    String getName();
}

class AirConditioner implements Appliance {
    @Override public double calculateUnits(double hoursUsed) { return hoursUsed * 1.5; }
    @Override public double calculateCost(double hoursUsed, double ratePerUnit) { return calculateUnits(hoursUsed) * ratePerUnit; }
    @Override public String getName() { return "AIR_CONDITIONER"; }
}

class Refrigerator implements Appliance {
    @Override public double calculateUnits(double hoursUsed) { return hoursUsed * 0.2; }
    @Override public double calculateCost(double hoursUsed, double ratePerUnit) { return calculateUnits(hoursUsed) * ratePerUnit; }
    @Override public String getName() { return "REFRIGERATOR"; }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Appliance a1 = new AirConditioner();
        Appliance a2 = new Refrigerator();
        double hours = 8.0, rate = 6.0;
        System.out.printf("%s: Units=%.2f Cost=%.2f\n", a1.getName(), a1.calculateUnits(hours), a1.calculateCost(hours, rate));
        System.out.printf("%s: Units=%.2f Cost=%.2f\n", a2.getName(), a2.calculateUnits(hours), a2.calculateCost(hours, rate));
    }
}
