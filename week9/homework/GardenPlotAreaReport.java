abstract class Shape {
    String owner;
    public Shape(String owner) { this.owner = owner; }
    public abstract double calculateArea();
    public abstract String getShapeName();
}

class Rectangle extends Shape {
    double length, width;
    public Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }
    @Override public double calculateArea() { return length * width; }
    @Override public String getShapeName() { return "RECTANGLE"; }
}

class Triangle extends Shape {
    double base, height;
    public Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }
    @Override public double calculateArea() { return 0.5 * base * height; }
    @Override public String getShapeName() { return "TRIANGLE"; }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("Ravi", 6.0, 4.0);
        Shape s2 = new Triangle("Neha", 6.0, 5.0);
        System.out.printf("%s (%s): %.2f\n", s1.owner, s1.getShapeName(), s1.calculateArea());
        System.out.printf("%s (%s): %.2f\n", s2.owner, s2.getShapeName(), s2.calculateArea());
        System.out.printf("Total Area: %.2f\n", s1.calculateArea() + s2.calculateArea());
    }
}
