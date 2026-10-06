abstract class TransportJourney {
    String type;
    double distanceKm;
    public TransportJourney(String type, double distanceKm) {
        this.type = type;
        this.distanceKm = distanceKm;
    }
    public abstract double calculateFare();
}

class BusJourney extends TransportJourney {
    public BusJourney(double distanceKm) { super("BUS", distanceKm); }
    @Override public double calculateFare() { return distanceKm * 0.50; }
}

class MetroJourney extends TransportJourney {
    public MetroJourney(double distanceKm) { super("METRO", distanceKm); }
    @Override public double calculateFare() { return distanceKm * 1.05; }
}

public class PublicTransportFareCalculator {
    public static void main(String[] args) {
        TransportJourney j1 = new BusJourney(7.0);
        TransportJourney j2 = new MetroJourney(5.0);
        System.out.printf("%s: %.2f\n", j1.type, j1.calculateFare());
        System.out.printf("%s: %.2f\n", j2.type, j2.calculateFare());
    }
}
