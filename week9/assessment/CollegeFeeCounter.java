interface FeePayer {
    double calculateFee();
    String getName();
}

class RegularStudent implements FeePayer {
    private String name;
    private double tuition;

    public RegularStudent(String name, double tuition) {
        this.name = name;
        this.tuition = tuition;
    }

    @Override public double calculateFee() { return tuition; }
    @Override public String getName() { return name; }
}

class ScholarshipStudent implements FeePayer {
    private String name;
    private double tuition;
    private double discountPercent;

    public ScholarshipStudent(String name, double tuition, double discountPercent) {
        this.name = name;
        this.tuition = tuition;
        this.discountPercent = discountPercent;
    }

    @Override public double calculateFee() { return tuition * (1 - discountPercent / 100.0); }
    @Override public String getName() { return name; }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        FeePayer s1 = new RegularStudent("Amit", 50000);
        FeePayer s2 = new ScholarshipStudent("Sneha", 50000, 50);
        System.out.printf("%s: %.2f\n", s1.getName(), s1.calculateFee());
        System.out.printf("%s: %.2f\n", s2.getName(), s2.calculateFee());
    }
}
