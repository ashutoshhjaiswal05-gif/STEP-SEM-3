abstract class TravelBooking {
    double distanceKm;
    public TravelBooking(double distanceKm) { this.distanceKm = distanceKm; }
    public abstract double calculateFare();
    public abstract String getMode();
}

class FlightBooking extends TravelBooking {
    public FlightBooking(double distanceKm) { super(distanceKm); }
    @Override public double calculateFare() { return 500.0 + (distanceKm * 5.0); }
    @Override public String getMode() { return "FLIGHT"; }
}

class TrainBooking extends TravelBooking {
    public TrainBooking(double distanceKm) { super(distanceKm); }
    @Override public double calculateFare() { return 50.0 + (distanceKm * 1.5); }
    @Override public String getMode() { return "TRAIN"; }
}

public class TravelBookingWithCommonFee {
    public static void main(String[] args) {
        TravelBooking b1 = new FlightBooking(1000.0);
        TravelBooking b2 = new TrainBooking(500.0);
        System.out.printf("%s: %.2f\n", b1.getMode(), b1.calculateFare());
        System.out.printf("%s: %.2f\n", b2.getMode(), b2.calculateFare());
    }
}
