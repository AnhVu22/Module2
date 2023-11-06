package ss05_accessmodifier_static.AccessModifier;

public class Main {
    public static void main(String[] args) {
        Circles test1 = new Circles(10);
        System.out.println("Test 1: "  + test1);
        System.out.println("Test 1 Radius: "+ test1.getRadius());
        System.out.println("Test 1 Color: "+ test1.getColor());
        Circles test2 = new Circles();
        System.out.println("Test 2: " + test2);
        System.out.println("Test 2 Radius: "+ test2.getRadius());
        System.out.println("Test 2 Color: "+ test2.getColor());
    }
}
