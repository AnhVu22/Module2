package ss06_inherance_java.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(10, "blue", 20);
        System.out.println(cylinder.toString());
    }
}
