public class TrafficLight {
    private String color;

    public TrafficLight() {
        this.color = "red";
    }

    public void next() {
        if (color.equals("red")) color = "green";
        else if (color.equals("green")) color = "yellow";
        else if (color.equals("yellow")) color = "red";
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        System.out.println("Initial color: " + light.getColor());
        light.next();
        System.out.println("After 1st next(): " + light.getColor());
        light.next();
        System.out.println("After 2nd next(): " + light.getColor());
    }
}
