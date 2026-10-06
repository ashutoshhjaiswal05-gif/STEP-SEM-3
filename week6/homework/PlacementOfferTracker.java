class PlacementOffer {
    String studentName;
    String companyName;
    double lpaPackage;

    public PlacementOffer(String studentName, String companyName, double lpaPackage) {
        this.studentName = studentName;
        this.companyName = companyName;
        this.lpaPackage = lpaPackage;
    }

    public void displayOffer() {
        System.out.printf("%s -> %s @ %.1f LPA\n", studentName, companyName, lpaPackage);
    }
}

public class PlacementOfferTracker {
    public static void main(String[] args) {
        PlacementOffer p1 = new PlacementOffer("Ravi", "TCS", 4.5);
        PlacementOffer p2 = new PlacementOffer("Karthik", "Infosys", 4.0);
        p1.displayOffer();
        p2.displayOffer();
    }
}
