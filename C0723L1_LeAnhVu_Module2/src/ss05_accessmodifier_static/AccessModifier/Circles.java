package ss05_accessmodifier_static.AccessModifier;

public class Circles {
    private double radius = 1.0f;
    private String color = "red";

    public Circles() {
    }
    public Circles(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Radius: " + this.radius + ", Color: " + this.color + ", Area: " + this.getArea();
    }
}
