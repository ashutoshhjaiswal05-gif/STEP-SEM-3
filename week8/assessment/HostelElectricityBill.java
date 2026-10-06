abstract class Room {
    int units;
    public Room(int units) { this.units = units; }
    public abstract double calculateBill();
}

class RegularRoom extends Room {
    public RegularRoom(int units) { super(units); }
    @Override
    public double calculateBill() { return units * 5.0; }
}

class AcRoom extends Room {
    public AcRoom(int units) { super(units); }
    @Override
    public double calculateBill() { return units * 8.0; }
}

public class HostelElectricityBill {
    public static void main(String[] args) {
        Room r1 = new RegularRoom(100);
        Room r2 = new AcRoom(100);
        System.out.printf("Regular Room Bill: $%.2f\n", r1.calculateBill());
        System.out.printf("AC Room Bill: $%.2f\n", r2.calculateBill());
    }
}
