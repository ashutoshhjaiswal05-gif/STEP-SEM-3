interface Ticket {
    double calculatePrice();
    String getSeatNumber();
}

class RegularTicket implements Ticket {
    private String seat;
    private double basePrice;

    public RegularTicket(String seat, double basePrice) {
        this.seat = seat;
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() { return basePrice; }

    @Override
    public String getSeatNumber() { return seat; }
}

class VipTicket implements Ticket {
    private String seat;
    private double basePrice;

    public VipTicket(String seat, double basePrice) {
        this.seat = seat;
        this.basePrice = basePrice;
    }

    @Override
    public double calculatePrice() { return basePrice + 150.0; } // Includes VIP lounge fee

    @Override
    public String getSeatNumber() { return seat; }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Ticket t1 = new RegularTicket("A12", 250.0);
        Ticket t2 = new VipTicket("V01", 250.0);
        System.out.printf("%s: %.2f\n", t1.getSeatNumber(), t1.calculatePrice());
        System.out.printf("%s: %.2f\n", t2.getSeatNumber(), t2.calculatePrice());
    }
}
