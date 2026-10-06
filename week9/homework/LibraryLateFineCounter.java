abstract class LibraryFine {
    String title;
    int daysLate;
    public LibraryFine(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }
    public abstract double calculateFine();
}

class GeneralBook extends LibraryFine {
    public GeneralBook(String title, int daysLate) { super(title, daysLate); }
    @Override public double calculateFine() { return daysLate * 2.0; }
}

class SportsEquipment extends LibraryFine {
    public SportsEquipment(String title, int daysLate) { super(title, daysLate); }
    @Override public double calculateFine() { return daysLate * 5.0; }
}

public class LibraryLateFineCounter {
    public static void main(String[] args) {
        LibraryFine f1 = new GeneralBook("Physics Textbook", 3);
        LibraryFine f2 = new SportsEquipment("Cricket Kit", 2);
        System.out.printf("%s: %.2f\n", f1.title, f1.calculateFine());
        System.out.printf("%s: %.2f\n", f2.title, f2.calculateFine());
        System.out.printf("Total Fines: %.2f\n", f1.calculateFine() + f2.calculateFine());
    }
}
