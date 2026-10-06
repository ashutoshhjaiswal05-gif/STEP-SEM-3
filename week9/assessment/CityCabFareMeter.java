interface CabRide {
    double calculateFare();
    String getType();
}

class RegularRide implements CabRide {
    private double distanceKm;
    public RegularRide(double distanceKm) { this.distanceKm = distanceKm; }
    @Override public double calculateFare() { return 50.0 + (distanceKm * 12.0); }
    @Override public String getType() { return "REGULAR"; }
}

class PeakRide implements CabRide {
    private double distanceKm;
    public PeakRide(double distanceKm) { this.distanceKm = distanceKm; }
    @Override public double calculateFare() { return (50.0 + (distanceKm * 12.0)) * 1.5; }
    @Override public String getType() { return "PEAK"; }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        CabRide r1 = new RegularRide(10);
        CabRide r2 = new PeakRide(10);
        System.out.printf("%s: %.2f\n", r1.getType(), r1.calculateFare());
        System.out.printf("%s: %.2f\n", r2.getType(), r2.calculateFare());
    }
}
