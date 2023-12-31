package ss07_interface.Shape;

public class Square extends Shape implements IColorable {
    private double side = 0;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*(1+percent));
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
