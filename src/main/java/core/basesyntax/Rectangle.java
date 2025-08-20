package core.basesyntax;

public class Rectangle extends FColorS implements Figure {
    private final int height;
    private final int length;

    public Rectangle(int height, int length, String color) {
        super(color);
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " units, height: " + height
                + " units, length: " + length + " units, color: " + color);
    }
}
